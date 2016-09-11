package com.viewshot;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;

/**
 * 对View进行裁剪，可以传入指定的区域
 * Created by zxy94400 on 2016/9/11.
 */
public class ViewShotUtil {

    /**
     * 获取View某个区域的截图
     * @param view
     * @param rect
     * @return
     */
    public Bitmap getBitmapFromView(View view, Rect rect) {
        return null;
    }


    /**
     * 从单个view获取截图
     * @param view
     * @return
     */
    public Bitmap getBitmapFromView(View view) {
        Bitmap bitmap = null;
        if(view == null) {
            return bitmap;
        }
        view.setDrawingCacheEnabled(true);

        view.buildDrawingCache();

        bitmap = view.getDrawingCache();

        return bitmap;
    }

}
