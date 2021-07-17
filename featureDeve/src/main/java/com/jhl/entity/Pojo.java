package com.jhl.entity;

import com.jhl.utils.JsonUtils;

/**
 * @Description
 * @Author jhl
 * @Date 2021/5/25 9:57
 * @Version 1.0
 */
public abstract  class Pojo {
    public void toJson(){
        JsonUtils.toJsonString(this);
    }
}
