package 工具类.课堂练习.数组工具类;

/**
 * ClassName: arry
 * Package: 工具类.课堂练习.数组工具类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/17 - 14:38
 * @Version: v1.0
 *
 */
public class arry {
    public static void main(String[] args) {
        int[] arr = {10,20,50,34,100};
        //遍历数组
        TraverseTheArray.printArr(arr);
        //分割
        System.out.println();
        //获取平均分
        //System.out.println(AverageScore.getAverage(arr));
        double average = AverageScore.getAverage(arr);
        System.out.println(average);

        //强行创建私有化构造方法
        //TraverseTheArray s1 = new TraverseTheArray();
    }
}
