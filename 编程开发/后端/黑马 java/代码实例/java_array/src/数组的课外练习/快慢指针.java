package 数组的课外练习;

/**
 * ClassName: 快慢指针
 * Package: 数组的课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/3 - 10:53
 * @Version: v1.0
 *
 */
public class 快慢指针 {
    public static void main(String[] args) {
        //给定 递增有序数组 去除其中重复元素
        int[] arr={1,1,2,2,2,2,3,3,3};
        //定义 指针 快慢指针
        int slow=0,fast = 1;
        //利用循环 不断找 不重复的元素
        while(fast < arr.length){
            //判断 快慢指针指向的元素是否相等
            if(arr[slow] != arr[fast]){
                //只有在相等时慢指针才+1
                slow++;
                //快指针的值赋值给慢指针
                arr[slow] = arr[fast];
            }
            //无论否相等，都让快指针+1
            fast++;
        }
        //输出结果
        for (int i = 0; i <= slow; i++) {
            System.out.println(arr[i]);
        }
    }
}
