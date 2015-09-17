package com.semperchen.healthexpress.mobile.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.semperchen.healthexpress.mobile.R;
import com.semperchen.healthexpress.mobile.ui.adapter.HealthFragmentAdapter;

/**
 * Created by Semper on 2015/9/17.
 */
public class HealthFragment extends BaseFragment {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private View mView;

    public static HealthFragment getInstance(){
        HealthFragment healthFragment = new HealthFragment();
        Bundle extraArguments = new Bundle();
        healthFragment.setArguments(extraArguments);
        return healthFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView=inflater.inflate(R.layout.fragment_health,container,false);

        initializeViews();
        settingsToolbar(mView);

        if(mViewPager != null){
            setupViewPager();
            mTabLayout.setupWithViewPager(mViewPager);
        }

        return mView;
    }

    /**
     * 初始化视图
     */
    private void initializeViews() {

        mViewPager= (ViewPager) mView.findViewById(R.id.viewpager);
        mTabLayout= (TabLayout) mView.findViewById(R.id.tabs);
    }

    /**
     * 设置ViewPager
     */
    private void setupViewPager() {

        HealthFragmentAdapter healthFragmentAdapter=new HealthFragmentAdapter(getChildFragmentManager());
        healthFragmentAdapter.addFragment(RecommendFragment.getInstance(),getString(R.string.recommend));
        healthFragmentAdapter.addFragment(CategoryFragment.getInstance(),getString(R.string.category));
        healthFragmentAdapter.addFragment(TopicFragment.getInstance(),getString(R.string.topic));
        mViewPager.setAdapter(healthFragmentAdapter);
    }

    /**
     *设置actionbar
     *
     * @param rootView 根视图
     */
    @Override
    protected void settingsToolbar(View rootView) {
        super.settingsToolbar(rootView);
        getActivity().setTitle(getString(R.string.app_name));
    }
}
