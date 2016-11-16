package com.sonny.mvp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sonny.mvp.base.BaseActivity;

public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View, View.OnClickListener {

    private TextView mTvValue;

    @Override
    public MainContract.Presenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_get_data).setOnClickListener(this);
        mTvValue = (TextView) findViewById(R.id.tv_mvp_value);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_data:
                mPresenter.getValue();
                break;
        }
    }

    @Override
    public void setValue(final String value) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mTvValue.setText(value);
            }
        });
    }
}
