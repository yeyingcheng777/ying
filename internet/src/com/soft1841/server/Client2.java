package com.soft1841.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket socket = new Socket("127.0.0.1", 12580);
            OutputStream out = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要发送的服务器内容：");
            String info = scanner.nextLine();
            out.write(info.getBytes());
            out.close();
        }
    }
}
