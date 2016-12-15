package android.vinu.com.epoiserecruiter.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.adapter.HiringCandidateResponseRecyclerViewAdapter;
import android.vinu.com.epoiserecruiter.helper.DividerItemDecoration;
import android.vinu.com.epoiserecruiter.model.HiringCandidateResponse;

import java.util.ArrayList;

/**
 * Created by ImVB9 on 12/15/2016.
 */

public class HiringCandidateResponseActivity extends AppCompatActivity {

    private ArrayList<HiringCandidateResponse> mHiringCandidateResponseArrayList = new ArrayList<>();

    private RecyclerView recyclerView;
    private HiringCandidateResponseRecyclerViewAdapter mHiringCandidateResponseRecyclerViewAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_view_result);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


//        recyclerView = (RecyclerView) findViewById(R.id.result_view_recycler_view);

        mHiringCandidateResponseRecyclerViewAdapter = new HiringCandidateResponseRecyclerViewAdapter(mHiringCandidateResponseArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mHiringCandidateResponseRecyclerViewAdapter);
        prepareListData();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish(); // close this activity as oppose to navigating up

        return false;
    }


    private void prepareListData() {

        HiringCandidateResponse hiringCandidateResponse=new HiringCandidateResponse("1st sem");
        mHiringCandidateResponseArrayList.add(hiringCandidateResponse);

        hiringCandidateResponse=new HiringCandidateResponse("1st sem");
        mHiringCandidateResponseArrayList.add(hiringCandidateResponse);

        hiringCandidateResponse=new HiringCandidateResponse("1st sem");
        mHiringCandidateResponseArrayList.add(hiringCandidateResponse);

        hiringCandidateResponse=new HiringCandidateResponse("1st sem");
        mHiringCandidateResponseArrayList.add(hiringCandidateResponse);

        hiringCandidateResponse=new HiringCandidateResponse("1st sem");
        mHiringCandidateResponseArrayList.add(hiringCandidateResponse);

        hiringCandidateResponse=new HiringCandidateResponse("1st sem");
        mHiringCandidateResponseArrayList.add(hiringCandidateResponse);


    }
}
