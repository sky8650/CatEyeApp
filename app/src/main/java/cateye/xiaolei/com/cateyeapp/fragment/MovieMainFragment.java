package cateye.xiaolei.com.cateyeapp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import cateye.xiaolei.com.cateyeapp.BR;
import cateye.xiaolei.com.cateyeapp.R;
import cateye.xiaolei.com.cateyeapp.base.BaseCusFragment;
import cateye.xiaolei.com.cateyeapp.databinding.FragmentMovieMainBinding;
import cateye.xiaolei.com.cateyeapp.vm.MovieMainViewModel;

/**
 * 主页电影
 */
public class MovieMainFragment
        extends BaseCusFragment<FragmentMovieMainBinding,MovieMainViewModel>{


    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_movie_main;
    }

    @Override
    public int initVariableId() {
        return BR.vm;
    }
}
