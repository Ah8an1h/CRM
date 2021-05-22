package com.ssm.utils;

/**
 * Created by dllo on 18/4/2.
 */
public class AjaxResult {
    private String code;
    private String msg;
    private Object data;

    @Override
    public String toString() {
        return "AjaxResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
