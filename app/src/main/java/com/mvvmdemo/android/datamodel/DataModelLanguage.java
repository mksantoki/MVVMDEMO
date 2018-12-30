package com.mvvmdemo.android.datamodel;

import android.support.annotation.NonNull;

import com.mvvmdemo.android.model.Language;

import java.util.Arrays;
import java.util.List;


public class DataModelLanguage implements DataModelLanguageView {

    @NonNull
    @Override
    public List<Language> getSupportedLanguages() {
        return getLanguages();
    }

    @NonNull
    private List<Language> getLanguages() {
        return Arrays
                .asList(new Language("English", Language.LanguageCode.EN),
                        new Language("German", Language.LanguageCode.DE),
                        new Language("Slovakian", Language.LanguageCode.HR));
    }

    @NonNull
    @Override
    public String getGreetingByLanguageCode(@NonNull final Language.LanguageCode code) {
        switch (code) {
            case DE:
                return "Guten Tag!";
            case EN:
                return "Hello!";
            case HR:
                return "Zdravo!";
            default:
                return "";
        }
    }
}
