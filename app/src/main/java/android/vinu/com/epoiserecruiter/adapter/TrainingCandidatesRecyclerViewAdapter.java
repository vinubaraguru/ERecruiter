package android.vinu.com.epoiserecruiter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.helper.ItemClickListener;
import android.vinu.com.epoiserecruiter.model.TrainingCandidatesList;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ImVB9 on 12/13/2016.
 */

public class TrainingCandidatesRecyclerViewAdapter extends RecyclerView.Adapter<TrainingCandidatesRecyclerViewAdapter.ViewHolder> {

        Context mContext;
        ArrayList<TrainingCandidatesList> mTrainingCandidatesListArrayList;

    public TrainingCandidatesRecyclerViewAdapter(Context context, ArrayList<TrainingCandidatesList> trainingCandidatesListArrayList) {
        mContext = context;
        mTrainingCandidatesListArrayList = trainingCandidatesListArrayList;
    }

    @Override
    public TrainingCandidatesRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.training_candidates_list,null);

            return new TrainingCandidatesRecyclerViewAdapter.ViewHolder(view);
            }

    @Override
    public void onBindViewHolder(TrainingCandidatesRecyclerViewAdapter.ViewHolder holder, int position) {

            TrainingCandidatesList trainingCandidatesList = mTrainingCandidatesListArrayList.get(position);

            holder.trainingCandidateName.setText(trainingCandidatesList.getTrainingCandidateName());
            holder.trainingCandidateEmail.setText(trainingCandidatesList.getTrainingCandidateEmail());

            Picasso.with(holder.itemView.getContext())
            .load(R.drawable.messi)
            .into(holder.trainingCandidateImage);

            holder.setItemClickListener(new ItemClickListener() {
    @Override
    public void onItemClick(View view, int Position) {

            TrainingCandidatesList appliedCandidateList=mTrainingCandidatesListArrayList.get(Position);

            TrainingCandidatesList selectedAppliedCandidateList= getSelectedTrainingCandidateList(Position);

            Toast.makeText(mContext,selectedAppliedCandidateList.getTrainingCandidateName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
            return mTrainingCandidatesListArrayList.size();
            }

    public TrainingCandidatesList getSelectedTrainingCandidateList(int position) {
            return mTrainingCandidatesListArrayList.get(position);
            }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView trainingCandidateName;
        public final TextView trainingCandidateEmail;
        public final ImageView trainingCandidateImage;

        private ItemClickListener mItemClickListener;

        public ViewHolder(View view) {
            super(view);

            trainingCandidateName = (TextView) view.findViewById(R.id.training_cand_name);
            trainingCandidateEmail = (TextView) view.findViewById(R.id.training_cand_email);
            trainingCandidateImage=(ImageView) view.findViewById(R.id.training_cand_image);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mItemClickListener.onItemClick(view,getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener itemClickListener){
            this.mItemClickListener=itemClickListener;
        }


    //        @Override
    //        public String toString() {
    //            return super.toString() + " '" + mContext.getText() + "'";
    //        }
    }
}