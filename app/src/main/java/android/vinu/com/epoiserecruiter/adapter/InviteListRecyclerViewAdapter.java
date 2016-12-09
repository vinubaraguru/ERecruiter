package android.vinu.com.epoiserecruiter.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.activity.InviteOppDetailActivity;
import android.vinu.com.epoiserecruiter.helper.ItemClickListener;
import android.vinu.com.epoiserecruiter.model.InviteOppList;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class InviteListRecyclerViewAdapter extends RecyclerView.Adapter<InviteListRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    ArrayList<InviteOppList> mInviteOppListArrayList;

    public InviteListRecyclerViewAdapter(Context context, ArrayList<InviteOppList> inviteOppListArrayList) {
        mContext = context;
        mInviteOppListArrayList = inviteOppListArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_invite_opp_list,null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        InviteOppList inviteOppList=mInviteOppListArrayList.get(position);

        holder.inviteOppTitle.setText(inviteOppList.getOppTitle());
        holder.inviteOppPublishedDate.setText(inviteOppList.getOppPublishedDate());

        Picasso.with(holder.itemView.getContext())
                .load(R.drawable.messi)
                .into(holder.inviteOppImage);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int Position) {

                InviteOppList inviteOppList=mInviteOppListArrayList.get(Position);

                InviteOppList selectedInviteOppList= getselectedInviteOppList(Position);

                Intent intent=new Intent(mContext, InviteOppDetailActivity.class);
                intent.putExtra("oppTitle",inviteOppList.getOppTitle());

                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mInviteOppListArrayList.size();
    }

    public InviteOppList getselectedInviteOppList(int position) {
        return mInviteOppListArrayList.get(position);
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView inviteOppTitle;
        public final TextView inviteOppPublishedDate;
        public final ImageView inviteOppImage;

        private ItemClickListener mItemClickListener;

        public ViewHolder(View view) {
            super(view);

            inviteOppTitle = (TextView) view.findViewById(R.id.opp_title);
            inviteOppPublishedDate = (TextView) view.findViewById(R.id.opp_published_date);
            inviteOppImage=(ImageView) view.findViewById(R.id.opp_image);

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
