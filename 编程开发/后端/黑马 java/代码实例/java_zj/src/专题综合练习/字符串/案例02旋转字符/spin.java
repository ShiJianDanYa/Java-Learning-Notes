package 专题综合练习.字符串.案例02旋转字符;

/**
 * ClassName: spin
 * Package: 专题综合练习.字符串.案例02旋转字符
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1210:51
 * @Version1.0
 */
    
    /*
    需求如下
    A的旋转操作就是将A最左边的字符移动到最右边。
    例如，若A=‘abcde'，在移动一次之后结果就是'bcdea"
    如果在若干次调整操作之后，A能变成B，那么返回True。
    如果不能匹配成功，则返回false
*/
public class spin {
    public static void main(String[] args) {
        //定义两个字符串
        String A = "abcde";
        String B = "ABC";
        //旋转字符串
        A = rotate(A);
        System.out.println(A);
        //循环旋转并且比较
        if(check(A,B)){
            System.out.println("可以匹配");
        }else{
            System.out.println("不可以匹配");
        }

    }
    //旋转方法
    public static String rotate(String str){
        //如果我们看到要修改字符串的内容
        //可以有两个办法：
        //1.用substring进行截取，把左边的字符截取出来拼接到右侧去
        //2.可以把字符串先变成一个字符数组，然后调整字符数组里面数据，
        // 最后再把字符数组变成字符串。
        //截取思路
        //先获取最左边的字符
        //str.substring(0,1);
        char c = str.charAt(0);
        //获取剩余字符
        String str2 = str.substring(1);
        //开始拼接
        String str3 = str2 + c;
        return str3;


    }
    //比较方法
    public static boolean check(String A,String B){
        //定义一个变量，用来记录旋转次数
        for (int i = 0; i <A.length() ; i++) {
            //旋转字符串
            A = rotate(A);
            if(A.equals(B)){
                return true;
            }
        }
        return false;
    }
}
