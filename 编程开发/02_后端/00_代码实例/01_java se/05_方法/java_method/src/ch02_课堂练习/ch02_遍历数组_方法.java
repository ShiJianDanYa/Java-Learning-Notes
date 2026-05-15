package ch02_课堂练习;

/**
 * ClassName: 遍历数组_方法
 * Package: 课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 11:05
 * @Version: v1.0
 *
 */
public class ch02_遍历数组_方法 {
    /*定义一个方法遍历数组
    遍历格式如下：
    [1, 2, 3, 4, 5]*/
    public static void main(String [] args){
        //定义数组
        int [] arr = {1,2,3,4,5};
        printArray(arr);

    }
    //没有返回值的，不需要吧结果返回上面的调用处此时返回值类型void
    public  static void printArray(int [] arr){
        //打印[符号
        System.out.print("[");
        //打印数组元素
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+",");
        }
        //打印]符号
        System.out.print(arr[arr.length-1]);
        System.out.print("]");
    }

}
