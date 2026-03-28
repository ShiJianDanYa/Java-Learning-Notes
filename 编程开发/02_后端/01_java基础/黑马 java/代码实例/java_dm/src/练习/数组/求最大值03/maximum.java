package 练习.数组.求最大值03;

/**
 * ClassName: maximum
 * Package: 练习.课堂.数组.求最大值03
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3122:58
 * @Version1.0
 */

/*
要求
已知数组元素为{33,5,22,44,55}
其求最大值
 */
public class maximum {
    public static void main(String[] args) {
        int[] arr = {33,999,22,44,55};
        //最大值默认为第一个元素
        //为什么不能写0，无法保证数组中是否有数字大于0
        int max = arr[0];
        //所以循环从2个开始，依次比较
        //如果发现有比max更大的，就重新赋值给max
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("数组的最大值为"+max);
    }
}
