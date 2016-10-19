package com.csvHandler;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by TOPSHI KREATS on 8/28/2016.
 */
public class CSVHandler {


public  static StringBuilder getContent(String url) {
    try {
        URL webUrl = new URL(url);

        URLConnection conn = webUrl.openConnection();

        conn.setConnectTimeout(10000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line = "";

        StringBuilder builder = new StringBuilder();

        while ((line = reader.readLine()) != null)
        {
            builder.append(line);
        }

        return builder;
    }
    catch (Exception ex)
    {
        ex.printStackTrace();
    }
    return  null ;
}
}
