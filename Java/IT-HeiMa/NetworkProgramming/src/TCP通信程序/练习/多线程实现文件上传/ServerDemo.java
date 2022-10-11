package TCP通信程序.练习.多线程实现文件上传;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//接收到数据写入文本文件，给出反馈，代码用线程实现封装，为每一个客户端开启一个线程
public class ServerDemo {
    public static void main(String[] args) throws IOException {
//        创建服务器对象
        ServerSocket ss = new ServerSocket(10000);
        while (true) {
//        监听客户端连接，返回一个对应的Socket对象
            Socket s = ss.accept();
//        为每一个客户端开启一个线程
            new Thread(new ServerThread(s)).start();
        }
//        ss.close();
    }
}
