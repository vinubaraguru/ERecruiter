package android.vinu.com.epoiserecruiter.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.activity.HiringCandidateResponseActivity;
import android.vinu.com.epoiserecruiter.helper.ItemClickListener;
import android.vinu.com.epoiserecruiter.model.AppliedCandidateList;
import android.vinu.com.epoiserecruiter.model.HiringCandidateResponse;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ImVB9 on 12/15/2016.
 */

public class HiringCandidateResponseRecyclerViewAdapter extends RecyclerView.Adapter<HiringCandidateResponseRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    ArrayList<HiringCandidateResponse> mHiringCandidateResponseArrayList;

    public HiringCandidateResponseRecyclerViewAdapter(Context context, ArrayList<HiringCandidateResponse> hiringCandidateResponseArrayList) {
        mContext = context;
        mHiringCandidateResponseArrayList = hiringCandidateResponseArrayList;
    }

    public HiringCandidateResponseRecyclerViewAdapter(ArrayList<HiringCandidateResponse> hiringCandidateResponseArrayList) {

    }

    @Override
    public HiringCandidateResponseRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.applied_candidates_list,null);

        return new HiringCandidateResponseRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HiringCandidateResponseRecyclerViewAdapter.ViewHolder holder, int position) {

        HiringCandidateResponse hiringCandidateResponse = mHiringCandidateResponseArrayList.get(position);

//        holder.mVideoView.findViewById(hiringCandidateResponse.getVideoResponseUrl());

//
//        holder.setItemClickListener(new ItemClickListener() {
//            @Override
//            public void onItemClick(View view, int Position) {
//
//                AppliedCandidateList appliedCandidateList=mAppliedCandidateListArrayList.get(Position);
//
//                AppliedCandidateList selectedAppliedCandidateList= getSelectedAppliedCandidateList(Position);
//
//                Toast.makeText(mContext,selectedAppliedCandidateList.getAppliedCandidateName(),Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mHiringCandidateResponseArrayList.size();
    }

    public HiringCandidateResponse getSelectedHiringCandidateResponse(int position) {
        return mHiringCandidateResponseArrayList.get(position);
    }

    public void playVideo(){

//        try {
//            // Start the MediaController
//            MediaController mediacontroller = new MediaController(
//                    HiringCandidateResponseActivity.this);
//            mediacontroller.setAnchorView(videoview);
//            // Get the URL from String VideoURL
//            Uri video = Uri.parse(VideoURL);
//            videoview.setMediaController(mediacontroller);
//            videoview.setVideoURI(video);
//
//        } catch (Exception e) {
//            Log.e("Error", e.getMessage());
//            e.printStackTrace();
//        }
//
//        videoview.requestFocus();
//        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            // Close the progress bar and play the video
//            public void onPrepared(MediaPlayer mp) {
//                pDialog.dismiss();
//                videoview.start();
//            }
//        });

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final VideoView mVideoView;

        private ItemClickListener mItemClickListener;

        public ViewHolder(View view) {
            super(view);

            mVideoView = (VideoView) view.findViewById(R.id.videoView);

            view.setOnClickListener(this);
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