package com.semperchen.healthexpress.mobile.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.semperchen.healthexpress.mobile.R;

/**
 * Created by Semper on 2015/9/17.
 */
public class RecommendFragment extends Fragment {

    private View mView;

    public static RecommendFragment getInstance(){
        RecommendFragment recommendFragment = new RecommendFragment();
        Bundle extraArguments = new Bundle();
        recommendFragment.setArguments(extraArguments);
        return recommendFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mView=inflater.inflate(R.layout.fragment_recommend,container,false);
        return mView;
    }
}
