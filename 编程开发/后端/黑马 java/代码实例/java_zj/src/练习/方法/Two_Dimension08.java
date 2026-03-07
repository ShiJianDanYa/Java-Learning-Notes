package 练习.方法;

/**
 * ClassName: Two_Dimension08
 * Package: 练习.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/521:33
 * @Version1.0
 */
    
    /*
    需求如下 计算每个季度的总营业额和全年营业额
    1.22,66,44
    2.77,33,88
    3.25,45,65
    4.11,66,99
*/
public class Two_Dimension08 {
    public static void main(String[] args) {
        int[][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        //计算每个季度的总营业额
        getTotal1(arr);
        //全年营业额全年营业额
        System.out.println("全年营业额为：" + getTotal2(arr));

        System.out.println("程序结束");
    }
    // 计算每个季度的总营业额
    public static void getTotal1(int[][] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            System.out.println("第" + (i+1) + "季度的总营业额为：" + total);
            total = 0;
        }
    }
    //全年营业额
    public static int getTotal2(int[][] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }
}
