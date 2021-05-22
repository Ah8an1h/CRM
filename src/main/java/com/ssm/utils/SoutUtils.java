package com.ssm.utils;

/**
 * Created by dllo on 18/4/2.
 */
public  class SoutUtils {
    private static boolean bool=true;

    public static void resultStr(Object obj){
        if (bool){
            System.out.println(obj.toString());
        }
    }

    public static boolean isNull(String str) {
        if (str == null || str.length() == 0) {
            return true;
        } else {
            return false;

        }
    }

}
