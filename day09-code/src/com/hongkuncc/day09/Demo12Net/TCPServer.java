package com.hongkuncc.day09.Demo12Net;

import com.sun.corba.se.spi.activation.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
*
* TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据
* 表示服务器的类：
*   java.net.ServerSocket 实现服务器套接字
*
* 构造方法：
* ServerSocket(int port) 创建绑定到特定端口的服务器套接字。
*
* 服务器端必须明确一件事情，必须得知道是哪个客户端请求的服务器
*
* 成员方法：
*  Socket accept() 侦听并接受到此套接字的连接。
*192.168.0.102
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象ServerSocket和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //使用ServerSocket对象中的方法accept(),获得到请求的客户端对象Socket
        Socket socket = server.accept();

        //使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //使用Socket对象中的方法getOutputStream()获取网络字节输出流InputStream对象
        OutputStream os = socket.getOutputStream();
        //使用网络字节输入流OutputStream对象中的方法write，读取客户端回写的数据
        os.write("谢谢！".getBytes());

        //释放资源
        socket.close();
        server.close();
    }
}
