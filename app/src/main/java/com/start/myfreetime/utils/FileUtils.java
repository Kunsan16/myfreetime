package com.start.myfreetime.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

import com.start.myfreetime.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * Created by w on 2017/4/9.
 */

public class FileUtils {

    public static byte[] image2byte(Context context,String path){
        byte[] data = null;
        Uri uri=Uri.parse(path);
        try {
            data=readStream(context.getContentResolver().openInputStream(uri));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }


    public static Uri bitmapToUri(Context context){

        Resources r =context.getResources();
        Uri uri =  Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                + r.getResourcePackageName(R.drawable.launch) + "/"
                + r.getResourceTypeName(R.drawable.launch) + "/"
                + r.getResourceEntryName(R.drawable.launch));

        return uri;
    }

    public static byte[] readStream(InputStream inStream) throws Exception {
        byte[] buffer = new byte[1024];
        int len = -1;
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        byte[] data = outStream.toByteArray();
        outStream.close();
        inStream.close();
        return data;


    }
}
