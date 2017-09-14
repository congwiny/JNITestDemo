//
// Created by 牛冲 on 2017/9/14.
//

#include "com_congwiny_jnitestdemo2_JNITestUtils.h"

JNIEXPORT jstring JNICALL Java_com_congwiny_jnitestdemo2_JNITestUtils_getString
        (JNIEnv *env, jobject jobj) {
    char *text = "哈哈哈";
    return (*env)->NewStringUTF(env, text);
}