package com.mvvmdemo.android.model;

import android.support.annotation.NonNull;

/**
 * Language class containing the name of the language and the code.
 */
public class Language {

    /**
     * The enum Language code.
     */
    public enum LanguageCode {
        /**
         * En language code.
         */
        EN, /**
         * De language code.
         */
        DE, /**
         * Hr language code.
         */
        HR
    }

    @NonNull
    private final String mName;

    @NonNull
    private final LanguageCode mCode;

    /**
     * Instantiates a new Language.
     *
     * @param name the name
     * @param code the code
     */
    public Language(@NonNull final String name, @NonNull final LanguageCode code) {
        mName = name;
        mCode = code;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    @NonNull
    public String getName() {
        return mName;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    @NonNull
    public LanguageCode getCode() {
        return mCode;
    }
}
