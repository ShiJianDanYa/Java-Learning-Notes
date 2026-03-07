package 数组的课外练习;

import java.util.Random;

/**
 * ClassName: 去除重复
 * Package: 数组的课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/2 - 22:40
 * @Version: v1.0
 *
 */
public class 去除重复 {
    /*需求：获取10个1-100之间的随机数并存入到数组当中，
    要求保证数据是唯一的

    需求：先获取10个0-100之间的随机数并存入到数组当中,
    要求保证数据是唯一的
    */
    public static void main(String[] args){
        //动态初始化
        int[] arr = new int[10];
        //随机数生成
        Random random = new Random();

        for (int i = 0; i < arr.length;) {
            int data = random.nextInt(10)+1;
            // flag判断是否有重复数据
            boolean flag = true;
            //循环遍历 已有数据 是否与添加数据 重复
            for(int j = 0; j < i; j++)
            {
                if(arr[j] == data ){
                    flag = false;
                    //跳出内循环，break语句只能跳出它所在的那一层循环，无法直接跳出多层嵌套循环
                    break;

                }
            }
            //只有当没有重复时才会添加
            if(flag){
                arr[i] = data;
                //只有生成一个满足要求的随机数，索引才会自增
                i++;
            }
            System.out.println("随机的元素是"+data);
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
