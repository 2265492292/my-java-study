package com.itheima.d7_tcp4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReader implements Runnable {
    private Socket socket;

    public ServerReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //给当前对应的浏览器管道响应一个网页数据回去
            OutputStream os = socket.getOutputStream();
            //通过字节输出流包装写出去的数据给浏览器
            //把字节输出流包装成打印流（自带换行）
            PrintStream ps = new PrintStream(os);
            //写相应的网页数据回去
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println();//换行输出响应体
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset='utf-8'>");
            ps.println("<title>");
            ps.println("Java");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1 style='color:blue;font-size=20px'>万事万物皆对象</h1>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            //浏览器一般为短连接，所以关闭接口
            socket.close();
        } catch (Exception e) {
            System.out.println("客户端下线了：" + socket.getInetAddress().getHostAddress());
        }
    }
}
