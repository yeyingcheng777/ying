package com.soft1841.Server;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.43.28",12580);
        System.out.println("已和服务器建立连接，远程主机地址：" + socket.getRemoteSocketAddress());
    }
}
