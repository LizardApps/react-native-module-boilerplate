package com.gettipsi.boilerplate;

import android.widget.ProgressBar;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/**
 * Created by guidovanbeek on 26/04/2017.
 */

public class RNBoilerPlateViewManager extends SimpleViewManager<ProgressBar> {

    public static final String REACT_CLASS = "ProgressBar";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ProgressBar createViewInstance(ThemedReactContext reactContext) {
        return new ProgressBar(reactContext);
    }

    @ReactProp(name = "progress", defaultInt = 0)
    public void setProgress(ProgressBar view, int progress) {
        view.setProgress(progress);
    }

    @ReactProp(name = "indeterminate", defaultBoolean = false)
    public void setIndeterminate(ProgressBar view, boolean indeterminate) {
        view.setIndeterminate(indeterminate);
    }
}