package com.zhangcg.demo.entity;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by zhangcg.
 */
public class MyModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private UUID id;
    private String info;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
