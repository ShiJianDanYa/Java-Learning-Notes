package 练习.集合.集合遍历01;

import java.util.ArrayList;

/**
 * ClassName: 集合遍历01
 * Package: 练习.集合
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1309:40
 * @Version1.0
 */
    
    /*
    需求如下：定义一个集合，添加字符串，并进行遍历
    遍历格式参照：[元素1，元素2，元素3]。
*/
public class 集合遍历01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Integer> list = new ArrayList<>();
        //添加元素
        //jdk5以后int 和 Integer是可以相互转换的
        list.add(2);
        list.add(3);
        list.add(4);
        //开始遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");
        System.out.println("程序结束");
    }
}
