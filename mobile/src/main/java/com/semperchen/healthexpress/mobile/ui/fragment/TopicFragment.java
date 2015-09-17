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
public class TopicFragment extends Fragment {

    private View mView;

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
        return mView;
    }
}
