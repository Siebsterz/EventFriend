package com.example.siebster.eventfriend;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siebe on 2/03/2019.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Event> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textView;
        public ImageView imageView;
        public MyViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.event_name);
            imageView = (ImageView) view.findViewById(R.id.event_icon);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public Adapter(List<Event> events) {
        mDataset = events;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        MyViewHolder vh = new MyViewHolder(viewItem);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(mDataset.get(position).getName());
        holder.imageView.setImageResource(R.drawable.ic_wth);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
