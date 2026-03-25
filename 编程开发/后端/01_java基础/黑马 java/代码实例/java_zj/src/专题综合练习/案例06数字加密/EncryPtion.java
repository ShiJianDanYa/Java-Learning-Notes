package 专题综合练习.案例06数字加密;

/**
 * ClassName: EncryPtion
 * Package: 专题综合练习.案例06数字加密
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/416:00
 * @Version1.0
 */

/*
数字加密，某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
规则如下：先得到每位数，然后每位数都加上5,再对10求余
最后将所有数字反转，得到一串新数。

 */
public class EncryPtion {
    public static void main(String[] args) {
        int[] arr = {1,9,8,3};
        //加密
        System.out.println(encryption(arr));
    }
    public static int encryption(int[] arr) {
        //每位数都加上5
        encryption1(arr);
        //对10求余
        encryption2(arr);
        //反转
        encryption3(arr);
        //转化为int
        return encryption4(arr);
    }
    //方法1每位数加5
    public static int[] encryption1(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i]+5;
        }
        return arr;
    }
    //方法2对10求余
    public static int[] encryption2(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i]%10;
        }
        return arr;
    }
    //方法3反转
    public static int[] encryption3(int[] arr) {
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
    //方法4转化为int
    public static int encryption4(int[] arr) {
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num = num*10 + arr[i];
        }
        return num;
    }
}
