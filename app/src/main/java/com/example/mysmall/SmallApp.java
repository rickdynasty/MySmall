package com.example.mysmall;

import android.app.Application;

import net.wequick.small.Small;

public class SmallApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Small.preSetUp(this);

        Small.setBaseUri("http://example.com/");// 浏览器跳转url
        Small.setUp(this, null);
        // Small.setUp(this, new Small.OnCompleteListener(){...});
    }
}
