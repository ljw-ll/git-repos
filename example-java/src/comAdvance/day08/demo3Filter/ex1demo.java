package comAdvance.day08.demo3Filter;

import java.io.File;

/*
在File类中有两个和ListFiles重载的方法,方法的参数传递的就是过滤器
    File[] listFiles(FileFilter filter)
    java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器。
        作用:用来过滤文件(File对象)
        抽象方法:用来过滤文件的方法
            boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
            参数:
                File pathname:使用ListFiles方法遍历目录,得到的每一个文件对象

    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口:实现此接口的类实例可用于过滤器文件名。
        作用:用于过滤文件名称
        抽象方法:用来过滤文件的方法
            boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
            参数:
                File dir:构造方法中传递的被遍历的目录
                String name:使用ListFiles方法遍历目录,获取的每一个文件/文件夹的名称
    注意:
        两个过滤器接口是没有实现类的,需要我们自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则

 */
public class ex1demo {
    public static void main(String[] args) {
        File f1=new File("File");
        getAllFile(f1);
    }


    public static void getAllFile(File dir){
        File[] arr=dir.listFiles(new FileFilterImpl());  // 传递过滤对象
       /* for (File f : arr) {
            System.out.println(f);
        }*/
        for (File f : arr) {
            if(f.isDirectory()){
                getAllFile(f);
                // System.out.println(f);
            }
            else   System.out.println(f);
        }

    }
}
