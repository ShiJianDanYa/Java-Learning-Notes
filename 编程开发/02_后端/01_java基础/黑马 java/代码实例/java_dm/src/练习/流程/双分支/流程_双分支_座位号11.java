package 练习.流程.双分支;

import java.util.Scanner;

/**
 * ClassName: 流程_双分支_座位号11
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2913:17
 * @Version1.0
 */
    /*
    影院选座 奇数左边 偶数右边
    影院座位1到100
     */
public class 流程_双分支_座位号11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入座位号");
        int zw = sc.nextInt();
        //开始判断座位号
        if(zw<=100 && zw>=1){
        if(zw%2 == 0){
            System.out.println("右边");
        }else{
            System.out.println("左边");
        }
        }else{
            System.out.println("座位号错误");
        }
        }

    }
