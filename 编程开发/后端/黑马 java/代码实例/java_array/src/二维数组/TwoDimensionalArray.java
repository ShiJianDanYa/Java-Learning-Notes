package 二维数组;

/**
 * ClassName: TwoDimensionalArray
 * Package: 二维数组
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 11:30
 * @Version: v1.0
 *
 */
public class TwoDimensionalArray {
    public static void main(String[] args){
        /*
        第一排：张无忌 赵敏 周芷若
        第二排：张三丰 宋远桥 殷梨亭
        第三排：灭绝 陈昆 玄冥二老 金毛狮王
        第四排：杨逍 纪晓芙
        */
        //二维数组静态初始化
        String[][] names = new String[][]{
                {"张无忌","赵敏","周芷若"},
                {"张三丰","宋远桥","殷梨亭"},
                {"灭绝","陈昆","玄冥二老"},
                {"杨逍","纪晓芙",""}
        };
        //二维数组动态初始化
        String[][] arr2 = new String[3][5];
        //二维数组的访问
        //数组名[行索引]
        String[] arr3 = names[2];
        //遍历数组
        for(int i = 0;i < arr3.length;i++){
            System.out.println(arr3[i]);
        }
        System.out.println("--------------------------------");
        //数组名[行索引][列索引]
        //输入的和你实际上认为的是相差1,可以理解为+1
        String name = names[0][1];
        System.out.println(name);
        System.out.println("--------------------------------");
        //数组的长度 数组名.length
        System.out.println(names.length);
        System.out.println(names[0].length);
        System.out.println("--------------------------------");
        //遍历二维数组(静态初始化不规则)
        for(int i = 0;i < names.length;i++){
            for(int j =0;j< names[i].length;j++){
                System.out.print(names[i][j]);
            }
            System.out.println();
        }

    }
}
