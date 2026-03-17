package 工具类.课堂练习.数组工具类;

/**
 * ClassName: AverageScore
 * Package: 工具类.课堂练习.数组工具类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/17 - 11:05
 * @Version: v1.0
 *
 */
public class AverageScore {
    /*提供一个方法getAverage，用于返回平均分。（只考虑整数数组）*/
    //提供静态方法

    private AverageScore() {
    }
    public static double getAverage(int[] array){
        //定义变量统计总数据
        int sum = 0;
        //开始遍历累加数据
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        //平均数就一定是整数吗,还有可能是小数
        return sum*1.0/array.length;
    }
}
