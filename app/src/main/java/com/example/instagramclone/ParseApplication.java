package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Q6Ls6sb8X0udRA8M4ezS5weTBNXo3xpHin5mKBaT")
                .clientKey("sD94fUeqdjoq3RJtciaWW7uWZg4fvakT9ERa21aJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
