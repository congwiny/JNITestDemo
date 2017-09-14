package com.congwiny.jnitestdemo2;

/**
 * Created by congwiny on 2017/9/14.
 */

public class JNITestUtils {

    static {
        System.loadLibrary("congwiny");
    }

    public native String getString();
}
