package 专题综合练习.案例08抽奖方式;

import java.util.Random;

/**
 * ClassName: DrawaLotteryOrRaffle
 * Package: 专题综合练习.案例08抽奖方式
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/508:47
 * @Version1.0
 */
    
    /*
    需求如下 抽奖系统 两种实现方式 一个大v直播抽啊经
    奖品是现金🧧，分别有{2,588,888,1000,10000}五个奖金
    请用代码模拟抽奖。打印出每个奖项，
    1.奖项的出现顺序要随机且不重复。
*/
public class DrawaLotteryOrRaffle {
    //随机不重复怎么实现？
    //用一个数组存储已经抽取得的奖项，然后再随机抽取，如果已经抽取得了，就重新抽取。
    public static void main(String[] args) {
        //定义数组，表示奖池
        int[] arr = {2, 588, 888, 1000, 10000};
        //定义数组，存储已经被抽取的奖项
        int[] arr2 = new int[arr.length];

        getLottery(arr, arr2);


        System.out.println("程序结束");
    }

    public static void getLottery(int[] arr, int[] arr2) {
        //定义变量，表示奖项
        int lottery = 0;
        //定义变量，表示奖项是否重复
        boolean flag = false;

        Random r = new Random();
        //开始抽奖5次
        for (int i = 0; i < 5;) {
            //随机抽取奖项
            lottery = arr[r.nextInt(arr.length)];
            //开始获取奖项
            int prize = lottery;
            //判断奖项是否重复,重复重新抽取，不重复有效奖项
            if(!contains(arr2,lottery)){
                //添加抽取的奖项到数组中
                arr2[i] = prize;
                i++;
            }
        }
        //输出奖项
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    //判断奖项是否重复
    //重复 true 不重复 false
    public static boolean contains(int[] arr, int lottery) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == lottery) {
                return true;
            }
        }
        return false;
    }
}
