package com.mvvmdemo.android.ui.main.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.mvvmdemo.android.R;
import com.mvvmdemo.android.adapter.LanguageSpinnerAdapter;
import com.mvvmdemo.android.model.Language;
import com.mvvmdemo.android.ui.MyApplication;
import com.mvvmdemo.android.ui.base.BaseActivity;
import com.mvvmdemo.android.viewmodel.ActivityHomeViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityHomeScreen extends BaseActivity {

    @BindView(R.id.languages)
    Spinner languages;
    @BindView(R.id.greeting)
    TextView greeting;

    ActivityHomeViewModel viewModel;
    private LanguageSpinnerAdapter mLanguageSpinnerAdapter;

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, ActivityHomeScreen.class);
        return intent;
    }

    @Override
    protected boolean setFullScreen() {
        return false;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home_screen;
    }

    @Override
    protected void initControl() {
        MyApplication myApplication = (MyApplication) getApplication();
        viewModel = ((MyApplication) getApplication()).getViewModel();
    }

    @Override
    protected void initView() {
       setBackArrow(getString(R.string.app_name), new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               finish();
           }
       });
    }

    @Override
    protected void setListener() {
        languages.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> parent, final View view,
                                       final int position, final long id) {
                itemSelected(position);
            }

            @Override
            public void onNothingSelected(final AdapterView<?> parent) {
                //nothing to do here
            }
        });

        mLanguageSpinnerAdapter = new LanguageSpinnerAdapter(this, R.layout.language_item, viewModel.getSupportedLanguages());
        languages.setAdapter(mLanguageSpinnerAdapter);
    }

    private void itemSelected(int position) {
        Language languageSelected = mLanguageSpinnerAdapter.getItem(position);
        greeting.setText(viewModel.languageSelected(languageSelected));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
