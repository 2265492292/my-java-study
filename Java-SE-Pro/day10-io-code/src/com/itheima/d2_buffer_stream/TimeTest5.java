package com.itheima.d2_buffer_stream;

import java.io.*;

public class TimeTest5 {
    public static final String SRC_VIDEO = "C:\\Users\\QiaoZ\\Videos\\Stellar Blade\\Stellar Blade 2025.06.12 - 19.08.40.06.DVR.mp4";
    public static final String DEST_PATH = "D:\\桌面\\";

    public static void main(String[] args) {
        //目标：原始流和缓冲流的性能分析
        //1.使用低级的字节流按照一个一个字节的形式复制文件
        //copy01();//慢的没话说，简直垃圾
        //2.使用低级的字节流按照字节数组的形式复制文件
        copy02();//性能一般，相对较慢
        //3.使用高级的缓冲字节流按照一个一个字节的形式复制文件
        //copy03();//还是特别慢，不推荐使用
        //4.使用高级的缓冲字节流按照字节数组的形式复制文件
        copy04();//极快！推荐使用
    }

    //1.使用低级的字节流按照一个一个字节的形式复制文件
    public static void copy01() {
        long start = System.currentTimeMillis();
        try (
                //1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_VIDEO);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_PATH + "01.mp4");
        ) {
            //2.转移数据
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    //2.使用低级的字节流按照字节数组的形式复制文件
    public static void copy02() {
        long start = System.currentTimeMillis();
        try (
                //1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_VIDEO);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_PATH + "02.mp4");
        ) {
            //2.转移数据
            byte[] buffer = new byte[256 * 1024];//1KB
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照字节数组的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    //3.使用高级的缓冲字节流按照一个一个字节的形式复制文件
    public static void copy03() {
        long start = System.currentTimeMillis();
        try (
                //1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_VIDEO);
                InputStream bis = new BufferedInputStream(is);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_PATH + "03.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            //2.转移数据
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照一个一个字节的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    //4.使用高级的缓冲字节流按照字节数组的形式复制文件
    public static void copy04() {
        long start = System.currentTimeMillis();
        try (
                //1.创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_VIDEO);
                InputStream bis = new BufferedInputStream(is);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_PATH + "04.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            //2.转移数据
            byte[] buffer = new byte[256 * 1024];//1KB
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照字节数组的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

}
