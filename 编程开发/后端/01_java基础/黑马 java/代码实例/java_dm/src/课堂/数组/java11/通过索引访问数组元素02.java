package 课堂.数组.java11;

/**
 * ClassName: 通过索引访问数组元素02
 * Package: 课堂.数组.java11
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3119:40
 * @Version1.0
 */

/*
 */
public class 通过索引访问数组元素02 {
    //利用索引访问数组元素
    //格式：数组名[索引]
    //索引：数组中元素的编号，从0开始，最大索引是数组的长度-1
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        //获取数组中 0 索引对应的元素值
        System.out.println(arr[0]);
        //把数据存储到 数组中 1 索引对应的元素值
        //格式：数组名[索引] = 具体数据/变量;
        arr[1] = 60;
        System.out.println(arr[1]);
        System.out.println("程序结束");
    }
}
