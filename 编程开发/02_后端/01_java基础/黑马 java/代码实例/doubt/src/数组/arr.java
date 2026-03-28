package 数组;

/**
 * ClassName: arr
 * Package: 数组
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 21:54
 * @Version: v1.0
 *
 */
public class arr {
    public static void main(String[] args) {
        byte a =1;
        short b =2;
        int[] arr = new int[]{a,b};

        for(int i =0;i<arr.length;++i){
            System.out.println(arr[i]);
        }
    }
}
