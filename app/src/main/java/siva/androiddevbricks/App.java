package siva.androiddevbricks;

import android.app.Application;

import siva.androiddevbricks.util.BaseHelper;

/**
 * Created by sivaprasadg on 27/12/16.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        BaseHelper.initialize(this);
    }
}
