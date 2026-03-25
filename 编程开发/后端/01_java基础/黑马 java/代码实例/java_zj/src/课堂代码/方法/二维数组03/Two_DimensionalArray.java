package 课堂代码.方法.二维数组03;

/**
 * ClassName: Two_DimensionalArray
 * Package: 课堂代码.方法.二维数组03
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/521:01
 * @Version1.0
 */
    
    /*
    需求如下 二维数组的静态初始化
       格式
       数据类型[][] 数组名 = new 数据类型[行数][列数] = {{元素1,元素2,...},{元素1,元素2,...},...};
       简化格式
       数据类型[][] 数组名 = {{元素1,元素2,...},{元素1,元素2,...},...};
       元素访问
       数组名[行索引][列索引]
       二维数组遍历
       for(int i=0;i<数组名.length;i++){   //外层循环控制行数
           for(int j=0;j<数组名[i].length;j++){  //内层循环控制列数
               数组名[i][j];}
*/
public class Two_DimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //一般情况下，为了便于遍历二维数字写法如下
        //数组元素需要逗号隔开，最后一个元素后面不需要逗号
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //元素的获取
        //表示获二维数组中第一个一维数组地址
        System.out.println(arr[0]);
        System.out.println(arr[0][1]);
        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("["+arr[i][j]+"]");
            }
            System.out.println();
        }

        System.out.println("程序结束");
    }
}
