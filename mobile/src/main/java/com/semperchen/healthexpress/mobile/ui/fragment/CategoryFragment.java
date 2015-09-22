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
import com.semperchen.healthexpress.mobile.ui.adapter.AllAdapter;
import com.semperchen.healthexpress.mobile.ui.adapter.TopicAdapter;

/**
 * Created by Semper on 2015/9/17.
 */
public class CategoryFragment extends Fragment{

    private View mView;
    private RecyclerView mRecyclerView;
    private AllAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public static CategoryFragment getInstance(){
        CategoryFragment categoryFragment = new CategoryFragment();
        Bundle extraArguments = new Bundle();
        categoryFragment.setArguments(extraArguments);
        return categoryFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mView=inflater.inflate(R.layout.fragment_category,container,false);
        initView();
        return mView;
    }

    private void initView() {
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.all_recyclerView);
        //列数为两列
        int spanCount = 2;
        mLayoutManager = new StaggeredGridLayoutManager(
                spanCount,
                StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new AllAdapter(getContext());
        mRecyclerView.setAdapter(mAdapter);
    }
}
