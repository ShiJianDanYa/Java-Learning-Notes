package 数组的课外练习;

import java.util.Random;

/**
 * ClassName: 去除重复_2
 * Package: 数组的课外练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 19:37
 * @Version: v1.0
 *
 */
public class 去除重复_2 {
    {
        //动态初始化
        int[] arr = new int[10];
        //随机数生成
        Random random = new Random();

        for (int i = 0; i < arr.length;) {
            int data = random.nextInt(3);
            // flag判断是否有重复数据
            boolean flag = true;
            //循环遍历 已有数据 是否与添加数据 重复
            for(int j = 0; j < i; j++)
            {
                if(arr[j] == data ){
                    flag = false;
                }
            }
            //只有当没有重复时才会添加
            if(flag | data == 0){
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
