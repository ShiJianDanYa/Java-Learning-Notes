package 练习.集合.用户查找03;

import java.util.ArrayList;

/**
 * ClassName: userTest
 * Package: 练习.集合.用户查找
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1310:16
 * @Version1.0
 */
    
    /*
    需求如下
   1，main方法中定义一个集合，存入三个用户对象。
    用户属性为：id，username，password
    2，要求：定义一个方法，根据id查找对应的用户信息。
    如果存在，返回true
    如果不存在，返回false
*/
public class userTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<user> list = new ArrayList<>();
        //添加元素
        list.add(new user(1,"张三","123"));
        list.add(new user(2,"李四","456"));
        list.add(new user(3,"王五","789"));
        //查找元素
        //获取id
        int id;
        System.out.println("请输入要查找的id");
        id = new java.util.Scanner(System.in).nextInt();

        if(find(list, id)){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }
        }
    public static boolean find(ArrayList<user> list,int id) {
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            if (u.getId() == id) {
                return true;
            }
        }
        return false;
    }
    }
