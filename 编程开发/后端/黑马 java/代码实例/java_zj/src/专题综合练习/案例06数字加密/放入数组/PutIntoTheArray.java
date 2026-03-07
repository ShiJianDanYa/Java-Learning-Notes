package 专题综合练习.案例06数字加密.放入数组;

/**
 * ClassName: PutIntoTheArray
 * Package: 专题综合练习.案例06数字加密.放入数组
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/419:38
 * @Version1.0
 */

/*
    要求 ：把整数每一位数字都添加到数组中
    思路： 反向推导
        1.
 */
public class PutIntoTheArray {
    public static void main(String[] args) {
        //1计算数组的长度
        // 思路：循环除余10，直到商为0，计数器就是数字的位数
        int x = 123456789;
        //临时变量，用来记录x的值,
        //我的是方法，是传递的值，原值不变
        int gs = digit(x);


        //2创建动态数组
        int[] arr = new int[gs];
        //3.把整数上的每一位数字放入数组中
        System.out.println(x);
        int i = 0;
        while(x!=0){
            //对ge去余10，得到的就是个位数字
            int ge = x%10;
            //对10➗,得到商减去一位
            ge = ge/10;
            //把个位数字放入数组中
            arr[arr.length-1-i] = ge;
            ++i;

        }


    }
    //方法计算数字的位数
    public static int   digit(int x) {
        int count = 0;  //计数器
        while (x != 0) {
            x = x / 10;
            System.out.println(x);
            count++;
        }
        System.out.println("数字的长度为：" + count);
        return count;
    }
}
