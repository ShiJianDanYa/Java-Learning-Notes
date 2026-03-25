package 二维数组练习;

/**
 * ClassName: Disorganize
 * Package: 二维数组练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 14:38
 * @Version: v1.0
 *
 */
public class Disorganize {
    //一个二维不规则数组打乱顺序
    public static void main(String[] args){
        //静态创建不规则二维数组
        //二维数组静态初始化
        String[][] names = new String[][]{
                {"张无忌","赵敏","周芷若"},
                {"张三丰","宋远桥","殷梨亭"},
                {"灭绝","陈昆","玄冥二老"},
                {"杨逍","纪晓芙",""}
        };
        //打乱顺序方法
        String[][] arr = disorganizeArray(names);
        //遍历数组
        printArray(arr);

    }
    //遍历数组方法
    public static void printArray(String[][] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    //打乱顺序方法
    public static String[][] disorganizeArray(String[][] arr){
        //循环数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //生成随机行索引
                int newRow = (int)(Math.random()*arr.length);
                //生成随机列索引
                int newCol = (int)(Math.random()*arr[i].length);
                //开始随机交换
                //临时变量保存当前位置数据
                String temp = arr[i][j];
                arr[i][j] = arr[newRow][newCol];
                arr[newRow][newCol] = temp;
            }
        }
        return arr;
    }
}
