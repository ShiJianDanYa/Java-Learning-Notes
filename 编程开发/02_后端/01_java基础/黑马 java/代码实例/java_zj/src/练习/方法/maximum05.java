package 练习.方法;

/**
 * ClassName: maximum05
 * Package: 练习.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/116:20
 * @Version1.0
 */

/*
设计一个方法，求数组中的最大值，并返回最大值。
 */
public class maximum05 {
    public static void main(String[] args) {

        int[] arr = {1,2,99,4,5};
        System.out.println(maximun(arr));

    }
    public static int maximun(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
