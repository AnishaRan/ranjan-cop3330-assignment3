package org.example.ex43.base;

import java.io.File;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class WebsiteBuilder {
    public int createJSFolder(String jsInput) {
        if(jsInput.equals("y")) {
            (new File("JS")).mkdir();
            return 1;
        }
        return 0;
    }
}
