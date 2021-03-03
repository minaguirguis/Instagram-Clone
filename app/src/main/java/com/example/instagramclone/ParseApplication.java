package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Q6Ls6sb8X0udRA8M4ezS5weTBNXo3xpHin5mKBaT")
                .clientKey("sD94fUeqdjoq3RJtciaWW7uWZg4fvakT9ERa21aJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
