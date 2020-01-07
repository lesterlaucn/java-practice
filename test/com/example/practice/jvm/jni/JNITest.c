#include <jni.h>
#include <stdio.h>
#include "com_example_practice_jvm_jni_JNIExample.h"
/*
    JNI Types and Data Structures (https://docs.oracle.com/javase/7/docs/technotes/guides/jni/spec/types.html)
*/
JNIEXPORT int JNICALL Java_com_example_practice_jvm_jni_JNIExample_returnInt (JNIEnv *env, jobject object, jint len) {
  printf("\nThe length of your string is %d.\n\n", len);
  return len;
}