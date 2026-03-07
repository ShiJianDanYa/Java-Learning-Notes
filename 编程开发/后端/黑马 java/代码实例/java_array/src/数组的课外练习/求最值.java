package 数组的课外练习;

/**
 * ClassName: 求最值
 * Package: 数组的课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/2 - 22:02
 * @Version: v1.0
 *
 */
public class 求最值 {
    /*需求：已知数组元素为{33，5，22，44,55}
    请找出数组中最大值并打印在控制台

    细节1：
    循环的开始条件，如果为。.请问：对结果有没有影响？对结果没有任何影响，只不过，循环多执行一次
    细节2:
    max的初始化值，能不能赋值为0？max的初始化值，不能赋值为0。
    max记录的值，一定要是数组里面的元素
    */

    static void main() {
        //数组静态化
        int[] arr = {100,9,22,44,55};
        //定以一个变量存储最大值
        int max = arr[0];
        //循环遍历找到最大值
        for (int i = 1; i < arr.length; i++) {
            //数组元素比最大值打交换两者位置
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //输出最大值
        System.out.println("数组最大值"+max);

    }
}
