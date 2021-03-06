package android.vinu.com.epoiserecruiter.fragment;

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
import android.vinu.com.epoiserecruiter.adapter.HiringOppListRecyclerViewAdapter;
import android.vinu.com.epoiserecruiter.helper.DividerItemDecoration;
import android.vinu.com.epoiserecruiter.model.HiringOppList;
import android.vinu.com.epoiserecruiter.model.InvitedCandidateList;

import java.util.ArrayList;

/**
 * Created by ePoise on 12/9/2016.
 */

public class HiringOppListFragment extends Fragment {

    private HiringOppListRecyclerViewAdapter mHiringOppListRecyclerViewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hiring_opp_list, null);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.hiring_opp_list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        mHiringOppListRecyclerViewAdapter = new HiringOppListRecyclerViewAdapter(this.getActivity(),hiringOppListView());

        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mHiringOppListRecyclerViewAdapter);

        return view;
    }

    private ArrayList<HiringOppList> hiringOppListView() {

        final ArrayList<HiringOppList> hiringOppListArrayList = new ArrayList<>();

        HiringOppList hiringOppList=new HiringOppList("ePoise interview 1");
        hiringOppListArrayList.add(hiringOppList);

        hiringOppList=new HiringOppList("ePoise interview 2");
        hiringOppListArrayList.add(hiringOppList);

        hiringOppList=new HiringOppList("ePoise interview 3");
        hiringOppListArrayList.add(hiringOppList);

        hiringOppList=new HiringOppList("ePoise interview 4");
        hiringOppListArrayList.add(hiringOppList);

        hiringOppList=new HiringOppList("ePoise interview 5");
        hiringOppListArrayList.add(hiringOppList);

        hiringOppList=new HiringOppList("ePoise interview 6");
        hiringOppListArrayList.add(hiringOppList);

        hiringOppList=new HiringOppList("ePoise interview 7");
        hiringOppListArrayList.add(hiringOppList);

        hiringOppList=new HiringOppList("ePoise interview 8");
        hiringOppListArrayList.add(hiringOppList);

        return hiringOppListArrayList;
    }
}
