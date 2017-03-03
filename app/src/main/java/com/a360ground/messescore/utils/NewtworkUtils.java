package com.a360ground.messescore.utils;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by Kiyos Solomon on 3/1/2017.
 */

public class NewtworkUtils {

    public static boolean isNetworkConnected(Context mContext) {

        ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

}
