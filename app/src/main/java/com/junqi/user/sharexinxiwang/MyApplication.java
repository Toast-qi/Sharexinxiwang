package com.junqi.user.sharexinxiwang;

import android.app.Application;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;

/**
 * Created by user on 2016/9/26.
 */
public class MyApplication extends Application {

    {


//    PlatformConfig.setWeixin("wx967daebe835fbeac","5bb696d9ccd75a38c8a0bfe0675559b3");
         PlatformConfig.setSinaWeibo("1644798000","bec3837aa13372682e471963d78fd07c");
         Config.REDIRECT_URL = "http://sns.whalecloud.com/sina2/callback";



//    PlatformConfig.setQQZone("100424468","c7394704798a158208a74ab60104f0ba");
}
}
