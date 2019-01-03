package cateye.xiaolei.com.cateyeapp.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import cateye.xiaolei.com.cateyeapp.R;
import cateye.xiaolei.com.cateyeapp.base.BaseCusActivity;
import cateye.xiaolei.com.cateyeapp.databinding.ActivityMainBinding;
import cateye.xiaolei.com.cateyeapp.vm.MainViewModel;
import me.goldze.mvvmhabit.base.BaseActivity;
import cateye.xiaolei.com.cateyeapp.BR;

public class MainActivity extends BaseCusActivity<ActivityMainBinding,MainViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.vm;
    }

    @Override
    public MainViewModel initViewModel() {
        //View持有ViewModel的引用，如果没有特殊业务处理，这个方法可以不重写
        return ViewModelProviders.of(this).get(MainViewModel.class);
    }





}
