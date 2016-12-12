package android.vinu.com.epoiserecruiter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.helper.ItemClickListener;
import android.vinu.com.epoiserecruiter.model.AppliedCandidateList;
import android.vinu.com.epoiserecruiter.model.InvitedCandidateList;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ImVB9 on 12/11/2016.
 */

public class AppliedCandidatesRecyclerViewAdapter extends RecyclerView.Adapter<AppliedCandidatesRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    ArrayList<AppliedCandidateList> mAppliedCandidateListArrayList;

    public AppliedCandidatesRecyclerViewAdapter(Context context, ArrayList<AppliedCandidateList> appliedCandidateListArrayList) {
        mContext = context;
        mAppliedCandidateListArrayList = appliedCandidateListArrayList;
    }

    @Override
    public AppliedCandidatesRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.applied_candidates_list,null);

        return new AppliedCandidatesRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AppliedCandidatesRecyclerViewAdapter.ViewHolder holder, int position) {

        AppliedCandidateList appliedCandidateList = mAppliedCandidateListArrayList.get(position);

        holder.appliedCandidateName.setText(appliedCandidateList.getAppliedCandidateName());
        holder.appliedCandidateEmail.setText(appliedCandidateList.getAppliedCandidateEmail());

        Picasso.with(holder.itemView.getContext())
                .load(R.drawable.messi)
                .into(holder.appliedCandidateImage);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int Position) {

                AppliedCandidateList appliedCandidateList=mAppliedCandidateListArrayList.get(Position);

                AppliedCandidateList selectedAppliedCandidateList= getSelectedAppliedCandidateList(Position);

                Toast.makeText(mContext,selectedAppliedCandidateList.getAppliedCandidateName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mAppliedCandidateListArrayList.size();
    }

    public AppliedCandidateList getSelectedAppliedCandidateList(int position) {
        return mAppliedCandidateListArrayList.get(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView appliedCandidateName;
        public final TextView appliedCandidateEmail;
        public final ImageView appliedCandidateImage;

        private ItemClickListener mItemClickListener;

        public ViewHolder(View view) {
            super(view);

            appliedCandidateName = (TextView) view.findViewById(R.id.applied_cand_name);
            appliedCandidateEmail = (TextView) view.findViewById(R.id.applied_cand_email);
            appliedCandidateImage=(ImageView) view.findViewById(R.id.applied_cand_image);

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