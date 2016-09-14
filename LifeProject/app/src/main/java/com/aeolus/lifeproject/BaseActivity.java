package com.aeolus.lifeproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import org.xutils.x;

/**
 * 所有activity的基类
 * Created by aeolus.qian on 2016/9/14.
 */
public abstract class BaseActivity extends FragmentActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);

        bindView();
    }

    protected abstract void bindView();
}
