package com.mvvmdemo.android.ui.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.mvvmdemo.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * <p>
 * BaseActivity contains some modifications to the native AppCompatActivity.
 * Mainly, it use ButterKnife for view binding and it automatically check if
 * toolbar exists.
 * </p>
 */
public abstract class BaseActivity extends AppCompatActivity {

    /**
     * The Unbinder.
     */
    Unbinder unbinder;
    /**
     * The Toolbar.
     */
    @Nullable
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (setFullScreen()) {
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(getLayoutId());
        bindViews();
        initControl();
        initView();
        setListener();
    }

    /**
     * Sets full screen.
     *
     * @return the full screen
     */
    protected abstract boolean setFullScreen();

    /**
     * Gets layout id.
     *
     * @return the layout id
     */
    @LayoutRes
    protected abstract int getLayoutId();

    /**
     * Init control.
     */
    protected abstract void initControl();

    /**
     * Init view.
     */
    protected abstract void initView();

    /**
     * Sets listener.
     */
    protected abstract void setListener();

    /**
     * Every object annotated with {@link butterknife.Bind} its gonna injected trough butterknife
     */
    private void bindViews() {
        unbinder = ButterKnife.bind(this);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

    /**
     * Sets back arrow.
     *
     * @param toolbar  the toolbar
     * @param title    the title
     * @param listener the listener
     */
    public void setBackArrow(String title, View.OnClickListener listener) {
        if (toolbar == null) {
            return;
        }
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(listener);
    }
}
