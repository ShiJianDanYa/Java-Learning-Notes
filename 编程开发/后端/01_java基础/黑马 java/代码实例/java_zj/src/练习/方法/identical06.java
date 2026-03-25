package 练习.方法;

import java.util.Scanner;

/**
 * ClassName: identical06
 * Package: 练习.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/116:32
 * @Version1.0
 */

/*
 * 练习：
 * 定义方法，判断数组中的某一个数是否存在
 * 将结果返回给调用处。
 */
public class identical06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x=0;
        System.out.println("请输入要查找的数：");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(identical(arr,x)){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
        System.out.println("程序结束");
    }
    public static boolean identical(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return true;
            }
            //如果在这里else {return false}
            // 则会指判断数组第一个是否和x相等
             }
        //注意return false位置，不能放在for循环里
        return false;
    }
}
