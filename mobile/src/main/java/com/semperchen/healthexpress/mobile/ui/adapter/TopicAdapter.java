package com.semperchen.healthexpress.mobile.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.semperchen.healthexpress.mobile.R;

/**
 * Created by Semper on 2015/9/18.
 */
public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.ViewHolder> {

    private int[] images=new int[]{R.drawable.image_topic_001,R.drawable.image_topic_002,R.drawable.image_topic_001,
            R.drawable.image_topic_002,R.drawable.image_topic_001,R.drawable.image_topic_002,
            R.drawable.image_topic_001,R.drawable.image_topic_002,R.drawable.image_topic_001};
    private Context context;

    public TopicAdapter(Context context) {
        this.context=context;
    }

    @Override
    public TopicAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_topic,
                viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.topic_info_image);
        }
    }
}
