package br.com.async.houseinspection.app.exception;

import android.util.AndroidRuntimeException;

/**
 * Created by yrineu on 18/08/14.
 */
public class HouseInspectionException extends AndroidRuntimeException {

    private String[] message;
    public HouseInspectionException(){
        super();
    }



    public void setArgs(String[] args){
        message = args;
    }
}
