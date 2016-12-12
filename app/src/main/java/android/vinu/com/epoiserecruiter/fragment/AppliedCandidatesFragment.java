package android.vinu.com.epoiserecruiter.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.adapter.AppliedCandidatesRecyclerViewAdapter;
import android.vinu.com.epoiserecruiter.helper.DividerItemDecoration;
import android.vinu.com.epoiserecruiter.model.AppliedCandidateList;

import java.util.ArrayList;

public class AppliedCandidatesFragment extends Fragment {

    private AppliedCandidatesRecyclerViewAdapter mAppliedCandidatesRecyclerViewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_applied_candidates, null);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.applied_candidate_list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        mAppliedCandidatesRecyclerViewAdapter = new AppliedCandidatesRecyclerViewAdapter(this.getActivity(),invitedCandidateListView());

        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAppliedCandidatesRecyclerViewAdapter);

        return view;
    }

    private ArrayList<AppliedCandidateList> invitedCandidateListView() {

        final ArrayList<AppliedCandidateList> appliedCandidateListArrayList = new ArrayList<>();

        AppliedCandidateList appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        appliedCandidateList=new AppliedCandidateList("Vinu","vinu@epoise.com");
        appliedCandidateListArrayList.add(appliedCandidateList);

        return appliedCandidateListArrayList;
    }
}

