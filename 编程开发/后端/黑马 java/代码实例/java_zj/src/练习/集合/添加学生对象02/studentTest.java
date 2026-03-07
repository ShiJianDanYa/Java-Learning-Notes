package 练习.集合.添加学生对象02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: studentTest
 * Package: 练习.集合.添加学生对象02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1309:51
 * @Version1.0
 */
    
    /*
    需求如下 定义一个集合，添加一些学生对象，并进行遍历
    学生类的属性为：姓名，年龄。
*/
public class studentTest {
    public static void main(String[] args) {
        //创建集合
        //初始长度为0
        ArrayList<student> list = new ArrayList<>();
        //键盘录入学生信息
        //所以只能是3
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            //创建学生对象
            student s = new student();
            //键盘录入学生信息
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            //输入添加到学生对象
            s.setName(name);
            s.setAge(age);
            //添加到集合
            list.add(s);
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }


        System.out.println("程序结束");
    }
}
