package com.jtecx.recyclerviewdemo;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    private List<ListItem> listData;
    private LayoutInflater inflater;

    public RecyclerAdapter(List<ListItem> listData, Context context) {
        this.listData = listData;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResid());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class RecyclerHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView icon;
        private View container;

        public RecyclerHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.tvTitle);
            icon = (ImageView) itemView.findViewById(R.id.ivIcon);
            container = itemView.findViewById(R.id.containerRoot);

        }
    }
}
