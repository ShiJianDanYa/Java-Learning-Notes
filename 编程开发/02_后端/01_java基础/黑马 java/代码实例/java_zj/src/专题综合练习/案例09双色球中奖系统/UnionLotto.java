package 专题综合练习.案例09双色球中奖系统;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: UnionLotto
 * Package: 专题综合练习.案例09双色球中奖系统
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/511:13
 * @Version1.0
 */
    
    /*
    需求如下 双色球中奖系统
    1. 
    2.
    3. 
*/
public class UnionLotto {
    public static void main(String[] args) {
        //生成中奖号码
        int[] arr = createNumber();
        //打印中奖号码
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" ["+arr[i] + " ]");
        }
        //用户输入彩票号码
        int[] userInputNumber = userInputNumber();
        //遍历数组
        for (int i = 0; i < userInputNumber.length; i++) {
            System.out.print(" ["+userInputNumber[i] + " ]");
        }
        //开始判断中奖情况
        //红球中奖个数
        int redCount = 0;
        //蓝球中奖个数
        int blueCount = 0;
        //判断红球中奖个数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < userInputNumber.length - 1; j++) {
                if (arr[i] == userInputNumber[j]) {
                    redCount++;
                    //如果找到了，则跳出循环
                    break;
                }
            }

        }
        //判断蓝球中奖个数
        if (arr[arr.length - 1] == userInputNumber[userInputNumber.length - 1]) {
            blueCount++;
        }
        //判断中奖情况
        System.out.println("红球中奖个数：" + redCount);
        System.out.println("蓝球中奖个数：" + blueCount);


    }
    public static int[] userInputNumber(){
        //创建数组用于存储用户输入的彩票号码
        int[] arr = new int[7];
        //键盘输入红球号码
        Scanner sc = new Scanner(System.in);
        //判断并且输入红球号码
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int redNumber = sc.nextInt();
            //判断红球号码是否合法
            if (redNumber >= 1 && redNumber <= 33) {
                //判断红球号码是否重复
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("红球号码重复，请重新输入");
                }
            } else {
                System.out.println("红球号码不合法，请重新输入");
            }

        }
        //键盘输入蓝球号码
        System.out.println("请输入蓝球号码：");
        int blueNumber = sc.nextInt();
        //判断蓝球号码是否合法
        if (blueNumber >= 1 && blueNumber <= 16) {
            //判断蓝球号码是否重复
            if(blueNumber>=1 && blueNumber<=16){
                arr[arr.length - 1] = blueNumber;
            }else{
                System.out.println("蓝球号码不合法，请重新输入");
            }
        }
        return arr;
    }

    public static int[] createNumber() {
        //创建中奖号码
        int[] arr = new int[7];
        //红球1-33 不能重复
        //蓝球1-16 可以和红球重复
        //生成红球号码
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            //红球号码
            int redNumber = random.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码
            int blueNumber = random.nextInt(16) + 1;
            arr[arr.length - 1] = blueNumber;

            return arr;
    }
        //判断红球数组中是否有重复
        public static boolean contains ( int[] arr1, int redNumber){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == redNumber) {
                    return true;
                }
            }
            return false;
        }
    }

