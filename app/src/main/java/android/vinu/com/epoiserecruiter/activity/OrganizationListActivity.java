package android.vinu.com.epoiserecruiter.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.adapter.OrgListRecyclerAdapter;
import android.vinu.com.epoiserecruiter.helper.DividerItemDecoration;
import android.vinu.com.epoiserecruiter.model.OrganizationList;

import java.util.ArrayList;

public class OrganizationListActivity extends AppCompatActivity {

    private ArrayList<OrganizationList> mOrganizationListArrayList = new ArrayList<>();

    private RecyclerView recyclerView;
    private OrgListRecyclerAdapter mOrgListRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization_list);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Select Organisation");

        recyclerView = (RecyclerView) findViewById(R.id.org_list_recycler_view);

        mOrgListRecyclerAdapter = new OrgListRecyclerAdapter(this.getApplicationContext() , mOrganizationListArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mOrgListRecyclerAdapter);

        organizationList();

    }
    private void organizationList() {

        OrganizationList organization=new OrganizationList("ePoise systems","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("Career Connect","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("TalentSprint","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("ePoise systems","B2B");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("EXimius","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("Testing","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("ePoise systems","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("ePoise systems","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("ePoise systems","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("ePoise systems","B2C");
        mOrganizationListArrayList.add(organization);

        organization=new OrganizationList("ePoise systems","B2C");
        mOrganizationListArrayList.add(organization);

    }
}
