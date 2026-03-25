package 练习.数组.交换数组05;

/**
 * ClassName: exchange
 * Package: 练习.课堂.数组.交换数组05
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3123:42
 * @Version1.0
 */

/*
定义一个数组，
存入12345按要求交换数组中元素的位置，
12345 交换前：
54321 交换后：
 */
public class exchange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int  temp = 0;
        //12345
        //假设数组长度为5，则交换次数为5/2=2次
        //交换次数为数组长度的一半，所以循环条件为i<arr.length/2
        //长度为5    i是前面 j是后面
        //i是   i=0  i=1  i=2  i=3  i=4  i=5
        //j是   5     4    3    2    1    0
        //结论交换数组中第i个元素和第(length-1)-i个元素
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[arr.length - 1-i];
            arr[arr.length - 1-i] = arr[i];
            arr[i] = temp;
        }
        //输出交换后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" ["+arr[i]+" ]");
        }
    }
}
