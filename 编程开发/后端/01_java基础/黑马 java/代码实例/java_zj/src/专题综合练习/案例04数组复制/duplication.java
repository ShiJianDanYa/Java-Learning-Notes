package 专题综合练习.案例04数组复制;

/**
 * ClassName: duplication
 * Package: 专题综合练习.案例04数组复制
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/410:56
 * @Version1.0
 */

/*
要求
把一个数组中的元素拷贝到另一个数组中
 */
public class duplication {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 4, 5};
        System.out.println(arr);
        int[] arr2 = fz(arr);
        ergodic(arr2);
        System.out.println(arr2);

        System.out.println("程序结束");
    }
    public static int[] fz(int[] arr){
        //创建一个新数组，元素个数与原数组相同
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    public static void ergodic(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("["+arr[i]+"]");
        }
    }
}
