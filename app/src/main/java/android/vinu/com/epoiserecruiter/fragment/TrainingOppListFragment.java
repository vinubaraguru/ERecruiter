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
import android.vinu.com.epoiserecruiter.adapter.TrainingOppListRecyclerViewAdapter;
import android.vinu.com.epoiserecruiter.helper.DividerItemDecoration;
import android.vinu.com.epoiserecruiter.model.TrainingOppList;

import java.util.ArrayList;

/**
 * Created by ImVB9 on 12/13/2016.
 */

public class TrainingOppListFragment extends Fragment {

    private TrainingOppListRecyclerViewAdapter mTrainingOppListRecyclerViewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_training_opp_list, null);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.training_opp_list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        mTrainingOppListRecyclerViewAdapter = new TrainingOppListRecyclerViewAdapter(this.getActivity(),trainingOppListView());

        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mTrainingOppListRecyclerViewAdapter);

        return view;
    }

    private ArrayList<TrainingOppList> trainingOppListView() {

        final ArrayList<TrainingOppList> trainingOppListArrayList = new ArrayList<>();

        TrainingOppList trainingOppList=new TrainingOppList("ePoise interview 1");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 2");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 3");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 4");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 5");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 6");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 7");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 8");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 9");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 10");
        trainingOppListArrayList.add(trainingOppList);

        trainingOppList=new TrainingOppList("ePoise interview 11");
        trainingOppListArrayList.add(trainingOppList);

        return trainingOppListArrayList;
    }
}
