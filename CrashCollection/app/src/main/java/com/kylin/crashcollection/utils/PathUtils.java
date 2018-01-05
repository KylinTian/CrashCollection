package com.kylin.crashcollection.utils;

import android.os.Environment;

import java.io.File;

/**
 * Created by Einstein on 2017/8/17.
 * to deal with app file storage path
 */
public class PathUtils {

    private static final String APP_ROOT_PATH = "/CrashCollection/";

    private static final String CRASH_PATH = "crash/";

    private static boolean hasSDCard() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

    private static String getRootFilePath() {
        if (hasSDCard()) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();// filePath:/sdcard/
        } else {
            return Environment.getDataDirectory().getAbsolutePath() + "/data"; // filePath: /data/data/
        }
    }

    /**
     * 获取应用存储根目录
     *
     * @return
     */
    private static String getAppRootPath() {
        String strAppRootPath = getRootFilePath() + APP_ROOT_PATH;
        File file = new File(strAppRootPath);
        if (!file.exists()) {
            file.mkdir();
        }
        return getRootFilePath() + APP_ROOT_PATH;
    }

    /**
     * 获取应用存储crash文件目录
     *
     * @return
     */
    public static String getCrashPath() {
        String strCrashPath = getAppRootPath() + CRASH_PATH;
        File file = new File(strCrashPath);
        if (!file.exists()) {
            file.mkdir();
        }
        return strCrashPath;
    }
}
