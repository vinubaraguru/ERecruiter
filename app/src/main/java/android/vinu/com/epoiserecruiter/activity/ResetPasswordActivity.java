package android.vinu.com.epoiserecruiter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.vinu.com.epoiserecruiter.R;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ImVB9 on 11/26/2016.
 */

public class ResetPasswordActivity extends AppCompatActivity {

    private TextView resetPasswordEmail;
    private Button resetPasswordButton,backToLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onBackPressed();
//            }
//        });

        resetPasswordEmail =(TextView) findViewById(R.id.user_reset_email);
        resetPasswordButton =(Button) findViewById(R.id.user_reset_password_button);
        backToLogin=(Button) findViewById(R.id.login_back_button);

        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetPasswordProcess();
            }
        });

        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplication(),LoginActivity.class);
                startActivity(intent);

            }
        });

    }

    private void resetPasswordProcess() {

        String resetPassword_email= resetPasswordEmail.getText().toString();

        if(!resetPassword_email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(resetPassword_email).matches()) {

            sendResetPassword(resetPassword_email);

        }else{
            if(resetPassword_email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(resetPassword_email).matches()){
                resetPasswordEmail.setError("Enter valid email ID");
            }else {
                resetPasswordEmail.setError(null);
            }
        }

    }

    private void sendResetPassword(String resetPasswordEmail) {
        //sendForgotPwd process
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
