package android.vinu.com.epoiserecruiter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.helper.ItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ImVB9 on 11/27/2016.
 */

public class OrgListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView orgName,orgType;
    ImageView orgImage;

    private ItemClickListener mItemClickListener;

    public OrgListViewHolder(View itemView) {
        super(itemView);

        orgImage=(ImageView) itemView.findViewById(R.id.org_image);
        orgName=(TextView) itemView.findViewById(R.id.org_name);
        orgType=(TextView) itemView.findViewById(R.id.org_type);

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
