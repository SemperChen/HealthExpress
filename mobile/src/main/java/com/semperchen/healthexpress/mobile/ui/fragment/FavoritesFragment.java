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
public class FavoritesFragment extends BaseFragment{

    private View mView;

    public static FavoritesFragment getInstance(){
        FavoritesFragment favoritesFragment = new FavoritesFragment();
        Bundle extraArguments = new Bundle();
        favoritesFragment.setArguments(extraArguments);
        return favoritesFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mView=inflater.inflate(R.layout.fragment_favorutes,container,false);
        settingsToolbar(mView);
        return mView;
    }

    @Override
    protected void settingsToolbar(View rootView) {
        super.settingsToolbar(rootView);
    }
}
