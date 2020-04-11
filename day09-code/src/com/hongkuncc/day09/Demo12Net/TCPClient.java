package com.hongkuncc.day09.Demo12Net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;



/*
*
* TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
* 表示客户端的类：
*   java.net.Socket:此类实现客户端套接字。套接字是两台机器间通信的端点
*   套接字：包含了IP地址和端口号的网络单位
*
* 构造方法：
*   Socket(String host, int port) 创建一个流套接字并将其连接到指定主机上的指定端口号。
*   参数：
*       String host：服务器主机的名称/服务器的IP地址
*       int port：服务器的端口号
* 成员方法：
*   OutputStream getOutputStream()返回此套接字的输出流。
*   InputStream getInputStream() 返回此套接字的输入流。
*   void close() 关闭此套接字
*
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream
        OutputStream os = socket.getOutputStream();
        //使用网络字节输出流OutputStream()对象中的方法write,给服务器发送数据
        os.write("你好服务器".getBytes());

        //使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        //使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据


        //释放资源
        socket.close();

    }
}
