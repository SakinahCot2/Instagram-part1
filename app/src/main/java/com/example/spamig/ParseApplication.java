package com.example.spamig;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5rveoBHBlIvD1JmDQrEtTByqxB4KVRQkqDt4yxkH")
                .clientKey("7cOj8vhmZDmlJH1j7UcDFeF5t62ZNxAwfqCHstDc")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
