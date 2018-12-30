package com.mvvmdemo.android.viewmodel;

import android.support.annotation.NonNull;

import com.mvvmdemo.android.model.Language;

import java.util.List;

/**
 * The interface Activity home view model view.
 */
public interface ActivityHomeViewModelView {

    /**
     * Gets supported languages.
     *
     * @return the supported languages
     */
    List<Language> getSupportedLanguages();

    /**
     * Language selected string.
     *
     * @param language the language
     * @return the string
     */
    String languageSelected(@NonNull final Language language);
}
