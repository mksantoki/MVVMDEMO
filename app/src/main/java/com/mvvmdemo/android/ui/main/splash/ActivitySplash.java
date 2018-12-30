package com.mvvmdemo.android.ui.main.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import com.mvvmdemo.android.R;
import com.mvvmdemo.android.ui.base.BaseActivity;
import com.mvvmdemo.android.ui.main.home.ActivityHomeScreen;


/**
 * The type Activity splash.
 */
public class ActivitySplash extends BaseActivity {
    /**
     * Create intent intent.
     *
     * @param context the context
     * @return the intent
     */
    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, ActivitySplash.class);
        return intent;
    }

    /**
     * The Context.
     */
    Context context;
    /**
     * The Handler.
     */
    Handler handler;

    @Override
    protected boolean setFullScreen() {
        return true;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash_screen;
    }

    @Override
    protected void initControl() {
        handler = new Handler();
    }

    @Override
    protected void initView() {
        context = this;
    }

    @Override
    protected void setListener() {

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(ActivityHomeScreen.createIntent(context));
                finish();
            }
        }, 3000);
    }
}
