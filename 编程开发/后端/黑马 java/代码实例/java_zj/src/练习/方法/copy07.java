package 练习.方法;

import java.util.Scanner;

/**
 * ClassName: copy07
 * Package: 练习.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/117:44
 * @Version1.0
 */

/*要求
定义一个数组[10,20,30,40,50,60,70,80,90,100]
用另一个数组接收数组  从X倒y 不包含y
并且返回这个新数组
 */
public class copy07 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int a=0,b=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x：");
        a = sc.nextInt();
        System.out.println("请输入y：");
        b = sc.nextInt();

        System.out.println("a="+a+":b="+b);
        ergodic(copy(arr,a,b));


        System.out.println("程序结束");
    }
    public static int[] copy(int[] arr,int x,int y){
        int[] arr1 = new int[y-x];
        int index = 0;
        for(int i=x;i<y;i++){

            arr1[index] = arr[i-1];
             index++;

        }
        return arr1;
        }

        //遍历数组
        public static void ergodic(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print("["+arr[i]+"]");
            }
        }
    }
