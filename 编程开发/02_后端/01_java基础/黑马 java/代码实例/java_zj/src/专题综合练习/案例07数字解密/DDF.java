package 专题综合练习.案例07数字解密;

/**
 * ClassName: DDF
 * Package: 专题综合练习.案例07数字解密
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/422:57
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class DDF {
    public static void main(String[] args) {
        int[] arr = {8,3,4,6};
        //开始翻转数组
        int[] newArr = reverse(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }
        System.out.println("======================");
        //数字解密
        int[] newArr1 = digit(newArr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print("("+newArr[i]+")");
        }
        //每位数字减5
        System.out.println("======================");
        int[] newArr2 = digit1(newArr1);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print("("+newArr[i]+")");
        }

         System.out.println("程序结束");
    }

    //我的解法翻转数组并且返回新数组
    //其实应该翻转数组并且返回原数组
        public static int[] reverse(int[] arr){
        /*int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length-1-i];
        }*/
            for (int i = 0,j=arr.length-1; i < j; i++,j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        return arr;
    }
    //对十取余
    //对十取整
    public static int[] digit(int[] arr){
        //对数字进行判断0-4就是加10，5-9就是不变
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0 && arr[i]<=4){
                arr[i] = arr[i]+10;
            }
        }
        return arr;
    }
    //开始每位减5
    public static int[] digit1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]-5;
        }
        return arr;
    }
}
