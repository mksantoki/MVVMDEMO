package com.mvvmdemo.android.datamodel;

import android.support.annotation.NonNull;

import com.mvvmdemo.android.model.Language;

import java.util.List;

/**
 * The interface Data model language.
 */
public interface DataModelLanguageView {

    /**
     * Gets supported languages.
     *
     * @return the supported languages
     */
    @NonNull
    List<Language> getSupportedLanguages();

    /**
     * Gets greeting by language code.
     *
     * @param code the code
     * @return the greeting by language code
     */
    @NonNull
    String getGreetingByLanguageCode(@NonNull final Language.LanguageCode code);
}
