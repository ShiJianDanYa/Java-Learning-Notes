package 工具类.课堂练习.数组工具类;

/**
 * ClassName: TraverseTheArray
 * Package: 工具类.课堂练习.数组工具类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/17 - 10:58
 * @Version: v1.0
 *
 */
public class TraverseTheArray {
    /*
    提供一个方法printArr，用于遍历数组。
    格式如下：[10，20，50，34，100]（只考虑整数数组）
    */
    //私有化构造方法
    private TraverseTheArray(){}
    //提供静态方法
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
                System.out.print(arr[i]+",");

        }
        System.out.print(arr[arr.length-1]);
        System.out.print("]");
    }
}
