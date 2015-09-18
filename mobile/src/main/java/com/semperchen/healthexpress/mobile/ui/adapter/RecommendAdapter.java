package com.semperchen.healthexpress.mobile.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.semperchen.healthexpress.mobile.R;

import java.util.ArrayList;

/**
 * Created by Semper on 2015/9/18.
 */
public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.ViewHolder> {

    private ArrayList<String> items = new ArrayList<>();
    private Context context;

    public RecommendAdapter(ArrayList<String> items,Context context) {
        this.items = items;
        this.context=context;
    }

    @Override
    public RecommendAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_recommend,
                viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        String info = items.get(position);
        View view = viewHolder.itemView;
        TextView textView = (TextView) view.findViewById(R.id.info_text);
        textView.setText(info);
        //手动更改高度，不同位置的高度有所不同
        if(position%2==0){
            textView.setHeight(300 + (position % 3) * 30);
        }else {
            textView.setHeight(200 + (position % 3) * 10);
        }
        //textView.setHeight(200 + (position % 3) * 30);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
