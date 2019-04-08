package com.soft1841;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetImageByNeT {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://img04.sogoucdn.com/app/a/100520093/3c28af542f2d49f7-da1566425074a021-49652b4db4e26f742bdf91d5ddf65e2f.jpg");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn .setRequestMethod("GET");
        conn.setConnectTimeout(5*1000);
        InputStream inStream = conn.getInputStream();
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer) ) != -1){
            out1.write(buffer,0,len);
        }
        inStream.close();
        byte[] date = out1.toByteArray();
        File imageFile = new File("D:\\1.jpg");
        OutputStream out2 = new FileOutputStream(imageFile);
        out2.write(date);
        out2.close();
    }
}
