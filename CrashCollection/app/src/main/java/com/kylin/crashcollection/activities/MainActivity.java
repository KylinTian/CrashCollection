package com.kylin.crashcollection.activities;

import android.os.Bundle;
import android.view.View;

import com.kylin.crashcollection.R;
import com.kylin.crashcollection.activities.base.BaseActivity;

/**
 * Created by Einstein on 2018/1/3.
 * CrashCollection MainActivity
 */
public class MainActivity extends BaseActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
