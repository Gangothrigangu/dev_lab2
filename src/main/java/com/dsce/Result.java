package com.dsce;

public class Result {

    public static String display(int marks) {
        if (marks < 0) {
            return "invalid";
        } else if (marks >= 40) {
            return "pass";
        } else {
            return "fail";
        }
    }
}