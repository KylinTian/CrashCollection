package com.kylin.crashcollection.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.kylin.crashcollection.R;
import com.kylin.crashcollection.activities.base.BaseActivity;
import com.kylin.crashcollection.model.NullObject;

/**
 * Created by Einstein on 2018/1/3.
 * CrashCollection MainActivity
 */
public class MainActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    private TextView tv_click_crash;

    /**
     * NullObject for NullPointerException.
     */
    private NullObject mNullObject = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    /**
     * Init Views.
     */
    private void initViews() {
        tv_click_crash = (TextView) findViewById(R.id.tv_click_crash);
        tv_click_crash.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_click_crash:
                click2Crash();
                break;
            default:
                break;
        }
    }

    /**
     * Click2Crash.Just used for test.
     */
    private void click2Crash() {
        if (mNullObject.id > 0) { // here will crash
            Toast.makeText(MainActivity.this, "Click not crash!", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(MainActivity.this, "Click not crash!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
