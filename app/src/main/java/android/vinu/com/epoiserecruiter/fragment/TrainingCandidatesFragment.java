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
import android.vinu.com.epoiserecruiter.adapter.TrainingCandidatesRecyclerViewAdapter;
import android.vinu.com.epoiserecruiter.helper.DividerItemDecoration;
import android.vinu.com.epoiserecruiter.model.TrainingCandidatesList;

import java.util.ArrayList;

/**
 * Created by ImVB9 on 12/13/2016.
 */

public class TrainingCandidatesFragment extends Fragment {

    private TrainingCandidatesRecyclerViewAdapter mTrainingCandidatesRecyclerViewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_training_candidates_list, null);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.training_candidate_list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        mTrainingCandidatesRecyclerViewAdapter = new TrainingCandidatesRecyclerViewAdapter(this.getActivity(),trainingCandidateListView());

        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mTrainingCandidatesRecyclerViewAdapter);

        return view;
    }

    private ArrayList<TrainingCandidatesList> trainingCandidateListView() {

        final ArrayList<TrainingCandidatesList> trainingCandidatesListArrayList = new ArrayList<>();

        TrainingCandidatesList trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        trainingCandidatesList=new TrainingCandidatesList("Vinu","vinu@epoise.com");
        trainingCandidatesListArrayList.add(trainingCandidatesList);

        return trainingCandidatesListArrayList;
    }
}

