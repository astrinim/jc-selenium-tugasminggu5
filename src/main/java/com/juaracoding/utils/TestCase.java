package com.juaracoding.utils;

public enum TestCase {

    T1("Admin Login Valid"),
    T2("Admin Login Invalid with Wrong Username");


    private String testCaseName;

    TestCase(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
