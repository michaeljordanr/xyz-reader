package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json" );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BASE_URL = url;
    }
}
