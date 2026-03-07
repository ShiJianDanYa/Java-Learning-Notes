package 练习.字符串.金额转换06;

import java.util.Scanner;

/**
 * ClassName: convert
 * Package: 练习.字符串.金额转换06
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1119:21
 * @Version1.0
 */
    
    /*
    需求如下  金额转换
    1. 键盘录入一个金额  例如  123456789
    2. 把金额变成中文的大写形式  例如  壹亿贰仟叁佰肆拾伍万陆仟柒佰捌拾玖元整
    3. 键盘录入一个金额  例如  123456789.12
    1. 
    2.
    3. 
*/
public class convert {
    public static void main(String[] args) {
        //键盘录入一个金额  例如  123456789
        System.out.println("请输入一个金额");
        Scanner sc = new Scanner(System.in);
        int d;
        //快速用循环包围ctrl+alt+t组合键
        while (true) {
            d = sc.nextInt();
            //健壮性
            if(d>=0 && d<=9999999){
                break;

            }else{
                //输入有误
                System.out.println("输入有误");
            }
        }
        //分割转化
        String s = segmentation(d);
        //开始补零 七位 b补零的位数
        int b = 7;
        s = completion(s,b);
        //插入单位
        s = insertUnit(s);
        System.out.println(s);

    }

    //查表法   把数字和中文对应起来
    public static String convert(int d){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //返回
        return arr[d];
    }
    //切割数字并且逐个转化
    public static String segmentation(int d){
        String s = "";
        while(d!=0){
            //从右到左，获取个位
            //得到个位
            int ge = d%10;
            //去掉个位
            d = d/10;
            //顺序拼接
            s = convert(ge) + s;

        }
        return s;
    }
    //开始补零
    public static String completion( String s,int d){
        int count = 7-s.length();

        if (count > 0) {
            for(int i = 0; i < count; i++){
                s = "零" + s;
            }
        }else{
            //不需要补零
            return s;
        }
        return s;
    }
    //插入单位
    public static String insertUnit(String s){
        String s2 = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for(int i = 0; i < arr.length; i++){
            s2 = s2 + (s.charAt(i)+ arr[i]);
        }
        return s2;
    }
}
