package com.start.myfreetime.http.exception;

/**
 * Created by w on 2016/11/4.
 */

public class OkHttpException {

    private String ret_code;

    private String ret_message;

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_message() {
        return ret_message;
    }

    public void setRet_message(String ret_message) {
        this.ret_message = ret_message;
    }

     public OkHttpException(String ecode, String emsg){
        this.ret_code=ecode;
        this.ret_message=emsg;
    }

}
