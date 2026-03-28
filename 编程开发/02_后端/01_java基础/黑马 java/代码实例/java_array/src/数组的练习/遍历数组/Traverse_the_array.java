package 数组的练习.遍历数组;

/**
 * ClassName: Traverse_the_array
 * Package: 数组的练习.遍历数组
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/2 - 16:15
 * @Version: v1.0
 *
 */
public class Traverse_the_array {
    /*定义一个整数数组，里面存储任意数据，并将数组遍历并打印。*/
    public static void main(String [] args){
        //静态初始化 创建数组
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        //开始利用循环遍历数组并打印
        //获取数组长度 length 作用获取数组的长度
        //格式
        //数组名.length
        //此时 数组的长度为10 i的范围是0到9
        //arr.length 为 10
        //结束条件就是 i < arr.length
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
