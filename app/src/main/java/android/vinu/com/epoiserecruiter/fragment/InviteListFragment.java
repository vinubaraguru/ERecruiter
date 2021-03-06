package android.vinu.com.epoiserecruiter.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.vinu.com.epoiserecruiter.adapter.InviteListRecyclerViewAdapter;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.helper.DividerItemDecoration;
import android.vinu.com.epoiserecruiter.model.InviteOppList;

import java.util.ArrayList;


public class InviteListFragment extends Fragment {

    private InviteListRecyclerViewAdapter mInviteListRecyclerViewAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.recycler_view, container, false);

        View view = inflater.inflate(R.layout.recycler_view, null);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        mInviteListRecyclerViewAdapter = new InviteListRecyclerViewAdapter(this.getActivity(),inviteOppListView());

        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mInviteListRecyclerViewAdapter);

        return view;
    }

    private ArrayList<InviteOppList> inviteOppListView() {
        final ArrayList<InviteOppList> inviteOppListArrayList = new ArrayList<>();

        InviteOppList inviteOppList=new InviteOppList("L0 India - Softskill Assessment (Closed)","20 days ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L1 India - Softskill Assessment","a month ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L0 Global - Softskill Assessment","a month ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L1 India - Softskill Assessment","a month ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L1 Global - Softskill Assessment","a month ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L0 India - Softskill Assessment (Closed)","20 days ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L1 India - Softskill Assessment","a month ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L0 Global - Softskill Assessment","a month ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L1 India - Softskill Assessment","a month ago");
        inviteOppListArrayList.add(inviteOppList);

        inviteOppList=new InviteOppList("L1 Global - Softskill Assessment","a month ago");
        inviteOppListArrayList.add(inviteOppList);

        return inviteOppListArrayList;

    }

}
