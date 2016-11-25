package android.vinu.com.epoiserecruiter.activity;


import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;

import android.view.View;
import android.vinu.com.epoiserecruiter.R;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText userEmail, userPassword;
    private ProgressBar progressBar;
    private Button btnLogin, btnReset;
    private CoordinatorLayout mCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEmail = (EditText) findViewById(R.id.user_email);
        userPassword = (EditText) findViewById(R.id.user_password);
        btnLogin = (Button) findViewById(R.id.user_sign_in_button);
        btnReset = (Button) findViewById(R.id.btn_reset_password);

        btnLogin.setOnClickListener(this);
        btnReset.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.user_sign_in_button:
                userLogin();
                break;

            case R.id.btn_reset_password:
                userResetPassword();
        }

    }

    private void userLogin() {
        String email=userEmail.getText().toString();
        String password=userPassword.getText().toString();

        if((!email.isEmpty()&& Patterns.EMAIL_ADDRESS.matcher(email).matches()) && !password.isEmpty()) {

            userLoginProcess(email,password);

        }else{
            if(email.isEmpty() || ! Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                userEmail.setError("Enter valid email address");
            }else {
                userEmail.setError(null);
            }
            if(password.isEmpty())
            {
                userPassword.setError("Enter valid password ");
            } else{
                userPassword.setError(null);
            }
        }
    }


    private void userLoginProcess(String user_email, String user_password) {

        if(user_email.equals("support@epoise.com")&& user_password.equals("support")){

            lunchParentHomeScreen();

        }else{

            Snackbar.make(mCoordinatorLayout, "Invalid email or password !", Snackbar.LENGTH_LONG).show();
        }
    }

    private void lunchParentHomeScreen() {
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);

    }

    private void userResetPassword() {

        Intent intent=new Intent(getApplicationContext(), ResetPasswordActivity.class);
        startActivity(intent);

    }
}

