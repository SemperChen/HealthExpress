package com.semperchen.healthexpress.mobile.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.semperchen.healthexpress.mobile.R;

/**
 * Created by Semper on 2015/9/17.
 */
public class JokeFragment extends BaseFragment {

    private View mView;

    public static JokeFragment getInstance(){
        JokeFragment jokeFragment = new JokeFragment();
        Bundle extraArguments = new Bundle();
        jokeFragment.setArguments(extraArguments);
        return jokeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mView=inflater.inflate(R.layout.fragment_joke,container,false);
        setupToolbar(mView);
        return mView;
    }

    @Override
    protected void setupToolbar(View rootView) {
        super.setupToolbar(rootView);
    }
}
