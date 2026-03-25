package 数组的练习.数组的访问;

/**
 * ClassName: Array_element_access
 * Package: 数组的练习.数组的访问
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/2 - 11:32
 * @Version: v1.0
 *
 */
public class Array_element_access {
    public static void main(String[] args) {
        /*数组中元素的访问：
        1.获取数据
        2.修改数据*/
        //利用静态初始化创建数组
        int [] ageArr = {19,20,25};
        //获取数组中的元素
        //从索引获取，索引特点：索引从0开始，连续加一，中间不间断
        //获取索引0的数据
        System.out.println(ageArr[0]);
        //修改数据
        //格式 arr[索引] = 修改的数据
        //注意 ：一旦修改完毕，原来数据就被覆盖了
        ageArr [0] = 18;
        System.out.println(ageArr[0]);
    }
}
