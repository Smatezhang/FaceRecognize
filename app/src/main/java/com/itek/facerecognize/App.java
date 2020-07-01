package com.itek.facerecognize;
/**
 * Created by Simonzhang on 2019/4/25.
 */

import android.app.Application;



/**
 * @author:：simon
 * @date：2019/4/25:1:54 PM
 * @mail：simon@itekiot.com
 * @description：
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SPUtils.getInstance().init(this);


    }
}
