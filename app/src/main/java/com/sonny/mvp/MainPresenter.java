package com.sonny.mvp;

/**
 * Created by admin on 2016/11/16.
 */

public class MainPresenter extends MainContract.Presenter {

    public MainPresenter(MainContract.View view) {
        super(view, new MainModel());
    }

    @Override
    public void getValue() {
        mModel.getValue(new ICallBack() {
            @Override
            public void success(String value) {
                mView.setValue(value);
            }
        }, mView.getActivity());
    }
}
