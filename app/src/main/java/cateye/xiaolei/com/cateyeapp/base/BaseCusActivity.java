package cateye.xiaolei.com.cateyeapp.base;

import android.databinding.ViewDataBinding;
import android.os.Bundle;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;


/**
 * 定义自己的baseactivity，也可以改写BaseActivity
 * @param <V>
 * @param <VM>
 */
public abstract   class BaseCusActivity<V extends ViewDataBinding, VM extends BaseViewModel>
        extends BaseActivity<V,VM>{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }




}
