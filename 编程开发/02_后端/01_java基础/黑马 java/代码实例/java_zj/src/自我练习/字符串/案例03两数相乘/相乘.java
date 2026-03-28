package 自我练习.字符串.案例03两数相乘;

/**
 * ClassName: 相乘
 * Package: 自我练习.字符串.案例03两数相乘
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1215:21
 * @Version1.0
 */
    
    /*
    需求如下
    给定两个以字符串形式表示的非负整数num1和num2，
    返回num1和num2的乘积，它们的乘积也表示为字符串形式。
    注意：需要用已有的知识完成。
*/
public class 相乘 {
    public static void main(String[] args) {
        //验证字符转数字
        char num = '9';
        int a = num-'0';
        //两个字符串
        String num1 = "111";
        String num2 = "222";
        //字符串 转 字节数组，在转化为数组
        int num3 = stringToByteArray(num1);
        int num4 = stringToByteArray(num2);
        //相乘
        int num5 = num3*num4;
        //转化为字符串
        String num6 = num5+"";
        //输出
        System.out.println(num6);

    }
    //字符串转字符数组
    public static int stringToByteArray(String str){
        //char[] arr = char[str.length()];
        char[] arr =new char[str.length()];
        //遍历存储
        //分割字符串
        for(int i=0;i<str.length();i++){
            //charAt()获取字符串中的字符位置0到字符串长度-1
            arr[i] = str.charAt(i);
        }
        //开始转化为数字
        int num = 0;
        for(int i=0;i<arr.length;i++){
            num = num*10 + (arr[i]-'0');
        }
        //返回数字
        return num;

    }
}
