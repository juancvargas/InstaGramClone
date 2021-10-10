package com.cejajuan.insta_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Initializes Parse SDK as soon as the application is created
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(BuildConfig.B4APP_APP_ID)
                .clientKey(BuildConfig.B4APP_CLIENT_KEY)
                .server(getString(R.string.back4app_server_url))
                .build()
        );
    }
}
