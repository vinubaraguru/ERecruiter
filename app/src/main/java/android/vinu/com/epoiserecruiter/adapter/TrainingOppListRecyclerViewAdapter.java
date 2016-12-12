package android.vinu.com.epoiserecruiter.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.activity.AppliedCandidatesListActivity;
import android.vinu.com.epoiserecruiter.activity.TrainingCandidatesListActivity;
import android.vinu.com.epoiserecruiter.helper.ItemClickListener;
import android.vinu.com.epoiserecruiter.model.HiringOppList;
import android.vinu.com.epoiserecruiter.model.TrainingOppList;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ImVB9 on 12/13/2016.
 */

public class TrainingOppListRecyclerViewAdapter extends RecyclerView.Adapter<TrainingOppListRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    ArrayList<TrainingOppList> mTrainingOppListArrayList;

    public TrainingOppListRecyclerViewAdapter(Context context, ArrayList<TrainingOppList> trainingOppListArrayList) {
        mContext = context;
        mTrainingOppListArrayList = trainingOppListArrayList;
    }

    @Override
    public TrainingOppListRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.training_opp_list,null);

        return new TrainingOppListRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TrainingOppListRecyclerViewAdapter.ViewHolder holder, int position) {

        TrainingOppList trainingOppList = mTrainingOppListArrayList.get(position);

        holder.trainingOppName.setText(trainingOppList.getTrainingOppTitle());

        Picasso.with(holder.itemView.getContext())
                .load(R.drawable.messi)
                .into(holder.trainingOppImage);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int Position) {

                TrainingOppList trainingOppList=mTrainingOppListArrayList.get(Position);

                TrainingOppList selectedTrainingOppList= getSelectedTrainingOppListArrayList(Position);

                Intent intent=new Intent(mContext, TrainingCandidatesListActivity.class);
                intent.putExtra("trainingOppTitle",selectedTrainingOppList.getTrainingOppTitle());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTrainingOppListArrayList.size();
    }

    public TrainingOppList getSelectedTrainingOppListArrayList(int position) {
        return mTrainingOppListArrayList.get(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView trainingOppName;
        public final ImageView trainingOppImage;

        private ItemClickListener mItemClickListener;



        public ViewHolder(View itemView) {
            super(itemView);

            trainingOppName = (TextView) itemView.findViewById(R.id.training_opp_name);
            trainingOppImage=(ImageView) itemView.findViewById(R.id.training_opp_image);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            mItemClickListener.onItemClick(view,getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener itemClickListener){
            this.mItemClickListener=itemClickListener;
        }
    }
}
