package com.example.practice;

public class LoginApp {
    private String ID;
    private String PW;
    private String name;
    public static String webpage = "    <<< WEBLOGIN >>>   ";

    public String login(String paraID, String paraPW, String paraName) {
        ID = paraID;
        PW = paraPW;
        name = paraName;
        return "Hello, ID: " + ID + " PW: " + PW + " name: " + name;
    }
}
