package android.vinu.com.epoiserecruiter.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.vinu.com.epoiserecruiter.R;
import android.vinu.com.epoiserecruiter.activity.MainActivity;
import android.vinu.com.epoiserecruiter.helper.ItemClickListener;
import android.vinu.com.epoiserecruiter.model.OrganizationList;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ImVB9 on 11/27/2016.
 */

public class OrgListRecyclerAdapter extends RecyclerView.Adapter<OrgListViewHolder> {

    private Context mContext;
    private ArrayList<OrganizationList> mOrganizationListArrayList;

    public OrgListRecyclerAdapter(Context context, ArrayList<OrganizationList> organizationListArrayList) {
        mContext = context;
        mOrganizationListArrayList = organizationListArrayList;
    }

    @Override
    public OrgListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.organization_list,null);

        OrgListViewHolder mOrgListViewHolder =new OrgListViewHolder(view);

        return mOrgListViewHolder;
    }

    @Override
    public void onBindViewHolder(OrgListViewHolder holder, int position) {

        OrganizationList organizationList=mOrganizationListArrayList.get(position);

        holder.orgName.setText(organizationList.getOrgName());
        holder.orgType.setText(organizationList.getOrgType());

        Picasso.with(holder.itemView.getContext())
                .load(R.drawable.messi)
                .into(holder.orgImage);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int Position) {

                OrganizationList organization= mOrganizationListArrayList.get(Position);

                OrganizationList selectedOrganization= getSelectedOrganization(Position);

                Intent intent=new Intent(mContext, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mOrganizationListArrayList.size();
    }

    public OrganizationList getSelectedOrganization(int position) {
        return mOrganizationListArrayList.get(position);
    }
}
