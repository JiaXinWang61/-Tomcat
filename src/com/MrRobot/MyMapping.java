package com.MrRobot;

import java.util.HashMap;

public class MyMapping {

    public static HashMap<String, String> mapping = new HashMap<>();

    static {
        mapping.put("/mytomcat", "com.MrRobot.MyServlet");
    }

    public HashMap<String, String> getMapping() {
        return mapping;
    }
}
