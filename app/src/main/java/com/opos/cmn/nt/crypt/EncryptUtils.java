package com.opos.cmn.nt.crypt;
import android.text.TextUtils;
import android.util.Log;

public class EncryptUtils {
    static {
        System.loadLibrary("ads-c");
    }

    private static final native String encrypt(String plain);

    public static final String executeEncrypt(String plain) {
        Log.i("EncryptUtils","executeEncrypt thread= " + Thread.currentThread().toString());
        if(TextUtils.isEmpty(plain)) {
            return "";
        }
        String cipher = "";
        try {
           cipher = EncryptUtils.encrypt(plain);
            if(TextUtils.isEmpty(plain)) {
                cipher = "";
            }
        }
        catch(Exception exception) {
            cipher = "";
        }

        return cipher;
    }

    public static final String executeMD5(String plain) {
        if(TextUtils.isEmpty(plain)) {
            return "";
        }

        String cipher = "";
        try {
            cipher = EncryptUtils.md5(plain);
            if(TextUtils.isEmpty(plain)) {
                cipher = "";
            }
        }
        catch(Exception exception) {
            cipher = "";
        }

        return cipher;
    }

    public static final String executeSHA256(String plain) {
        if(TextUtils.isEmpty(plain)) {
            return "";
        }

        String cipher = "";
        try {
            cipher = EncryptUtils.sha256(plain);
            if(TextUtils.isEmpty(plain)) {
                cipher = "";
            }
        }
        catch(Exception exception) {
            cipher = "";
        }

        return cipher;
    }

    private static final native String md5(String plain);

    private static final native String sha256(String plain);
}


