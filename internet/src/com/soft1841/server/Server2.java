package com.soft1841.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12580);
        System.out.println("服务器启动");

        while (true) {
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            byte[] b = new byte[1024];
            in.read(b);
            System.out.println("客户端" + socket.getInetAddress() + "发送了：" + new String(b));
            socket.close();
        }
    }
}
