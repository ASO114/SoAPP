package com.miyauchirenge.soapp;

import android.util.Log;

import com.opos.cmn.nt.crypt.EncryptUtils;

import joor.Reflect;

/**
 * Created by zhangmp on 2020/6/18.
 */

public class OppoAnalyzor {
    public static String directEncrypt(String origEncryptFlag,String plain){
        String cipher = EncryptUtils.executeEncrypt("359250055365538");

        return cipher;
    }

    public static String reflectEncrypt(String origEncryptFlag,String plain) {
        String cipher = "";
        Class EncryptUtilsClass = Reflect.on("com.opos.cmn.nt.crypt.EncryptUtils").get();
        if (null != EncryptUtilsClass) {
            if (origEncryptFlag.equals("1") || origEncryptFlag.equals("2") || origEncryptFlag.equals("3")) {
                //直接反射native函数，获取结果没问题，但IDA调试会出现 Error: Oops! internal error 30057 occured.，SoApp直接调没问题
                //cipher = reflectOnNativeFunction(origEncryptFlag,EncryptUtilsClass,plain);
                cipher = reflectOnFunction(origEncryptFlag, EncryptUtilsClass, plain);
            } else {

            }

        }
        return cipher;
    }
    private static String reflectOnFunction(String origEncryptFlag,Class EncryptUtilsClass,String plain){
        String cipher = "";
        if(origEncryptFlag.equals("1")){
            cipher = Reflect.on(EncryptUtilsClass).call("executeEncrypt",plain).get();
        }else if(origEncryptFlag.equals("2")){
            cipher = Reflect.on(EncryptUtilsClass).call("executeSHA256",plain).get();
        }else if(origEncryptFlag.equals("3")){
            cipher = Reflect.on(EncryptUtilsClass).call("executeMD5",plain).get();
        }else{

        }
        return cipher;
    }

    private static String reflectOnNativeFunction(String origEncryptFlag,Class EncryptUtilsClass,String plain){
        String cipher = "";
        if(origEncryptFlag.equals("1")){
            cipher = Reflect.on(EncryptUtilsClass).call("encrypt",plain).get();
        }else if(origEncryptFlag.equals("2")){
            cipher = Reflect.on(EncryptUtilsClass).call("sha256",plain).get();
        }else if(origEncryptFlag.equals("3")){
            cipher = Reflect.on(EncryptUtilsClass).call("md5",plain).get();
        }else{

        }
        return cipher;
    }
}
