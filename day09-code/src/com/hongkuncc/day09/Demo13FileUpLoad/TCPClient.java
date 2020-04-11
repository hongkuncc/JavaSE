package com.hongkuncc.day09.Demo13FileUpLoad;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 文件上传案例的客户端，读取本地文件，上传到服务器，读取服务器回写的数据
 * 数据源：tcp_ip.png
 * 目的地：服务器
 *
 *
 *
 * */
public class TCPClient {
    public static void main(String[] args) throws IOException {
//        创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("tcp_ip.png");
//        创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream
        OutputStream os = socket.getOutputStream();
        //使用本地字节输入流FileInputStream对象中的方法read，读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len=fis.read(bytes)) != -1){
            //使用网络字节输出流OutputStream对象中的方法write，读取的文件上传到服务器
            os.write(bytes,0,len);
        }
        //使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream
        InputStream is = socket.getInputStream();


        //使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        while((len=fis.read(bytes)) !=-1){
            System.out.println(new String(bytes,0,len));
        }
        //释放资源
        fis.close();
        socket.close();


    }
}
