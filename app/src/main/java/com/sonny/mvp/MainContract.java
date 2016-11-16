package com.sonny.mvp;

import android.content.Context;

import com.sonny.mvp.base.BaseModel;
import com.sonny.mvp.base.BasePresenter;
import com.sonny.mvp.base.BaseView;

/**
 * Created by admin on 2016/11/16.
 */

public interface MainContract {

    interface View extends BaseView {
        void setValue(String value);
    }

    interface Model extends BaseModel {
        void getValue(ICallBack iCallBack, Context context);
    }

    abstract class Presenter extends BasePresenter<View, Model> {

        public Presenter(View view, Model model) {
            super(view, model);
        }

        public abstract void getValue();
    }
}
