package com.hongkuncc.day09.DemoFileUpLoad;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象ServerSocket和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //使用ServerSocket对象中的方法accept(),获得到请求的客户端对象Socket

        /*
         *
         * 让服务器一直处于监听状态(死循环accept方法)
         * 有一个客户端上传文件，就保存一个文件
         *
         * */
        while (true) {

            Socket socket = server.accept();

            /*
            *
            * 使用多线程技术，提高创新的效率
            * 有一个客户端上传文件，就开启一个线程，完成文件的上传
            *
            * */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        //使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
//      判断 文件夹是否存在；不存在则创建
                        File file = new File("d:\\upload");
                        //使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        /*
                         * 自定义一个文件的命名规则：防止同名文件被覆盖
                         * 规则：域名+毫秒值+随机数
                         *
                         *
                         * */
                        String filename = "chk" + System.currentTimeMillis() + new Random().nextInt(99999) + ".png";

//        创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
//        FileOutputStream fos = new FileOutputStream(file+"tcp_ip.png");
                        FileOutputStream fos = new FileOutputStream(file + "\\" + filename);
                        //使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件
                        System.out.println("11111111111");

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            //使用本地字节输出流FileOutputStream对象中的方法write，读取的文件上保存到服务器
                            fos.write(bytes, 0, len);
                        }

                        System.out.println("2222222222222222222");

//      使用网络字节输出流OutputStream获取到网络字节输出流OutputStream对象
                        socket.getOutputStream().write("上传成功".getBytes());

                        fos.close();
                        socket.close();
                        server.close();

                    }catch (IOException e) {
                        System.out.println(e);
                    }

                }
            }).start();

        }
    }
}
