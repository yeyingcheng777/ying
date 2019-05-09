package com.soft1841.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器
        DatagramSocket socket = new DatagramSocket(8888);
        //创建数据报
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data,data.length);
        System.out.println("******服务器已启动，等待客户端发送数据");
        socket.receive(packet);
        String info = new String(data,0,packet.getLength());
        System.out.println("我是服务器，客户端说：" + info);
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        byte[] data2 ="欢迎你！".getBytes();
        DatagramPacket packet1 = new DatagramPacket(data2,data2.length,address,port);
        socket.send(packet1);
        socket.close();
    }
}
