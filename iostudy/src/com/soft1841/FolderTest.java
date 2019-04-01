package com.soft1841;

import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        //要遍历的路径
        String path = "E:\\WE";
        //获取其file对象
        File file = new File(path);
        //遍历path下的文件和目录，放在File数组中
        File[] fs = file.listFiles();
        //遍历File[]数组
        for (File f : fs) {
            //若非目录(即文件)，则打印
            if (!f.isDirectory()) {
                String FileName = f.getName();
                int position = FileName.indexOf(".");
                String suffixName = FileName.substring(position);
                if (suffixName.equals(".jpg") || suffixName.equals(".png")
                        || suffixName.equals(".gif")) {
                    System.out.println(f);
                }
            }
        }
    }
}