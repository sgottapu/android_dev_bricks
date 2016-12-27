package siva.androiddevbricks.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;

/**
 * Created by sivaprasadg on 27/12/16.
 */

public class BaseHelper {
    private static Context context;

    public static void initialize(@NonNull Context context) {
        BaseHelper.context = context;
    }

    public static Context getContext() {
        if (BaseHelper.context == null)
            throw new NullPointerException("Application Should call  BaseHelper.initialize(context) from your Application onCreate() method.");

        return BaseHelper.context.getApplicationContext();
    }

    public static Resources getResources() {
        return BaseHelper.getContext().getResources();
    }

    public static Resources.Theme getTheme() {
        return BaseHelper.getContext().getTheme();
    }

    public static AssetManager getAssets() {
        return BaseHelper.getContext().getAssets();
    }

    public static Configuration getConfiguration() {
        return BaseHelper.getResources().getConfiguration();
    }

    public static DisplayMetrics getDisplayMetrics() {
        return BaseHelper.getResources().getDisplayMetrics();
    }

}
