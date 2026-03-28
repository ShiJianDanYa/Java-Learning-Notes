package 课堂代码.方法.二维数组03;

/**
 * ClassName: DTCSH
 * Package: 课堂代码.方法.二维数组03
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/521:21
 * @Version1.0
 */
    
    /*
    需求如下 二维数组的动态初始化
    格式
    数据类型[][] 数组名 = new 数据类型[行数][列数];
    简化格式
    数据类型[][] 数组名 = new 数据类型[行数][];
    元素访问
    数组名[行索引][列索引]
*/
public class DTCSH {
    public static void main(String[] args) {
        //二维数组动态初始化
        int[][] arr = new int[3][3];
        arr[0][0] = 9;
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
