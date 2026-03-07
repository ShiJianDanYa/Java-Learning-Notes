package 数组的课外练习;

import java.util.Scanner;

/**
 * ClassName: 查找数据
 * Package: 数组的课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/2 - 21:25
 * @Version: v1.0
 *
 */
public class 查找数据 {
    /*需求：已知数组元素为{33，5,22,44,55,33}
    键盘录入任意一个数据，查找这个数据在数组中是否存在
    如果数组中要查找的数据出现多次，只要显示第一次的索引即可
    输出要求：
    如果存在打印索引
    如果不存在，提示：“该数据不存在”

    细节一：什么情况下，我才能断定数据在数组中不存在
    细节二：两种写法flag（标记） count（计数器）
    */
    public static void main(String[] args) {
        //静态初始化数组
        int [] arr = {33,5,22,44,55,33};
        System.out.println("请输入要查找的数据：");
        Scanner scanner = new Scanner(System.in);
        int findData = scanner.nextInt();
        //定以一个布尔类型变量 用来判断改数据是否存在
        boolean estimate = false;
        //遍历数组 开始对比
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == findData){
                System.out.println("该数据在数组中的索引为："+i);
                //存在 边为true
                estimate = true;
                // 如果数组中要查找的数据出现多次，只要显示第一次的索引即可
                //找到 数据 直接结束循环
                break;
            }
    }
        //estimate不等于true 数据不存在
        if(estimate!=true) {
            System.out.println("该数据不存在");
        }
    }

}
