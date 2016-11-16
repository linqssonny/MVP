package com.sonny.mvp;

import android.content.Context;

/**
 * Created by admin on 2016/11/16.
 */

public class MainModel implements MainContract.Model {
    @Override
    public void getValue(final ICallBack iCallBack, final Context context) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                iCallBack.success(context.getString(R.string.value));
            }
        }).start();
    }
}
