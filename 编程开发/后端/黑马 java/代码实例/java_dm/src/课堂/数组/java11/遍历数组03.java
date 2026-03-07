package 课堂.数组.java11;

/**
 * ClassName: 遍历数组03
 * Package: 课堂.数组.java11
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3119:54
 * @Version1.0
 */

/*
遍历数组
1. 遍历数组的元素
 */
public class 遍历数组03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //遍历数组的元素,利用循环
        //length:数组的长度，数组中元素的个数
        //格式 数组名.length
        for(int i = 0; i < arr.length; i++){
            System.out.println("元素"+(i+1)+"值为"+arr[i]);
        }

        System.out.println("程序结束");
    }
}
