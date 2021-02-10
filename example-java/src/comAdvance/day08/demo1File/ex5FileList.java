package comAdvance.day08.demo1File;

import java.io.File;

/*
    File类遍历(文件夹)目录功能
        - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

    注意:
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在,会抛出空指针异常
        如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
 */
public class ex5FileList {
    public static void main(String[] args) {

      //  demo1();    //list()
        demo2();    // listFiles()
    }


    /*
      public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
      遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹,把文件/文件夹封装为File对象,多个File对象存储到File数组中
   */
    private static void demo2() {
        File f1=new File("D:\\BaiduNetdiskDownload");
        File[] arr=f1.listFiles();
        for (File f : arr) {
            System.out.println(f);
        }

    }

    /*
       public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
       遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把获取到的多个名称存储到一个String类型的数组中
    */
    private static void demo1() {
        File f1=new File("D:\\BaiduNetdiskDownload");
        String[] arr=f1.list();
        for (String u : arr) {
            System.out.println(u);
        }
        System.out.println("---------");

        File f2=new File("File\\a.txt");   //NullPointerException
        String[] arr1=f2.list();
        for (String u : arr1) {
            System.out.println(u);
        }
    }


}
