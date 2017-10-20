package com.vivo.coolweahter.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiayizhuan on 17/9/30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
