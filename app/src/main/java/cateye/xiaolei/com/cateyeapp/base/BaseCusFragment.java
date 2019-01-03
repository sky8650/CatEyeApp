package cateye.xiaolei.com.cateyeapp.base;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;


/**
 * xiaolei
 * @param <V>
 * @param <VM>
 */
public  abstract class BaseCusFragment<V extends ViewDataBinding, VM extends BaseViewModel>
        extends BaseFragment<V,VM>{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
