package com.semperchen.healthexpress.mobile.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.semperchen.healthexpress.mobile.R;
import com.semperchen.healthexpress.mobile.ui.adapter.RecommendAdapter;
import com.semperchen.healthexpress.mobile.ui.adapter.TopicAdapter;

import java.util.ArrayList;

/**
 * Created by Semper on 2015/9/17.
 */
public class TopicFragment extends Fragment {

    private View mView;
    private RecyclerView mRecyclerView;
    private TopicAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public static TopicFragment getInstance(){
        TopicFragment topicFragment = new TopicFragment();
        Bundle extraArguments = new Bundle();
        topicFragment.setArguments(extraArguments);
        return topicFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mView=inflater.inflate(R.layout.fragment_topic,container,false);
        initView();
        return mView;
    }

    private void initView() {
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.topic_recyclerView);
        //列数为两列
        int spanCount = 1;
        mLayoutManager = new StaggeredGridLayoutManager(
                spanCount,
                StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new TopicAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);
    }
}
