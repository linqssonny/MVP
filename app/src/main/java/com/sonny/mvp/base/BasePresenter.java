package com.sonny.mvp.base;

/**
 * Created by admin on 2016/11/16.
 */

public abstract class BasePresenter<T extends BaseView, M extends BaseModel> {

    public T mView;
    public M mModel;

    public BasePresenter(T view, M model) {
        if (null == view) {
            throw new NullPointerException("view must not null");
        }
        this.mView = view;
        this.mModel = model;
    }

    public void detachView() {
        mView = null;
    }
}
