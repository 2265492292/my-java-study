package com.itheima.d3_udp2;


//需求：一收一发

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //目标：客户端实现（发送端）
        //1.创建发送端对象
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            //2.创建一个数据包对象，负责封装数据
            /*
            * 参数一：要发送的数据
            * 参数二：发送数据的大小
            * 参数三：目的地IP地址
            * 参数四：接收端端口号
            * */
            System.out.println("请说：");
            String msg =sc.nextLine();
            if ("exit".equals(msg)){
                System.out.println("推出成功");
                socket.close();
                break;
            }
            byte[] buffer =msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length, InetAddress.getLocalHost(),8888);

            //3.把数据包发送出去
            socket.send(packet);
        }
    }
}
