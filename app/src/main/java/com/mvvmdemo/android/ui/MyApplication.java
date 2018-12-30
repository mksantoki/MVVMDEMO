package com.mvvmdemo.android.ui;

import android.support.annotation.NonNull;

import com.mvvmdemo.android.datamodel.DataModelLanguage;
import com.mvvmdemo.android.datamodel.DataModelLanguageView;
import com.mvvmdemo.android.viewmodel.ActivityHomeViewModel;

/**
 * The type My application.
 */
public class MyApplication extends android.app.Application {

    @NonNull
    private final DataModelLanguageView mDataModel;

    /**
     * Instantiates a new My application.
     */
    public MyApplication() {
        mDataModel = new DataModelLanguage();
    }

    /**
     * Gets data model.
     *
     * @return the data model
     */
    @NonNull
    public DataModelLanguageView getDataModel() {
        return mDataModel;
    }

    /**
     * Gets view model.
     *
     * @return the view model
     */
    @NonNull
    public ActivityHomeViewModel getViewModel() {
        return new ActivityHomeViewModel(getDataModel());
    }

}
