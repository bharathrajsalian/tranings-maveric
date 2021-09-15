package com.training.org;

public class OutOfSpaceException extends Exception{
    public OutOfSpaceException(String errMsg){
        super(errMsg);
    }
}
