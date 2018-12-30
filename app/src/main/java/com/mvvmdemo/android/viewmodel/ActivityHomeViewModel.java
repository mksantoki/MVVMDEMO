package com.mvvmdemo.android.viewmodel;

import android.support.annotation.NonNull;

import com.mvvmdemo.android.datamodel.DataModelLanguageView;
import com.mvvmdemo.android.model.Language;

import java.util.List;


/**
 * View model for the main activity.
 */
public class ActivityHomeViewModel implements ActivityHomeViewModelView {

    @NonNull
    private final DataModelLanguageView mDataModel;

    /**
     * Instantiates a new Activity home view model.
     *
     * @param dataModel the data model
     */
    public ActivityHomeViewModel(@NonNull final DataModelLanguageView dataModel) {
        mDataModel = dataModel;
    }

    @NonNull
    public List<Language> getSupportedLanguages() {
        return mDataModel.getSupportedLanguages();
    }

    public String languageSelected(@NonNull final Language language) {
        return mDataModel.getGreetingByLanguageCode(language.getCode());
    }

}
