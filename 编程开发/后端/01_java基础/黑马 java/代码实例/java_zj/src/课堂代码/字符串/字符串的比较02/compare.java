package 课堂代码.字符串.字符串的比较02;

/**
 * ClassName: compare
 * Package: 课堂代码.字符串.字符串的比较
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/916:47
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class compare {
    public static void main(String[] args) {
        //比较字符串是否相等
        String str1 = "abc";
        String str2 = new String("aBc");
        //==比较的是地址
        if(str1 == str2){
            System.out.println("str1 == str2");
        }else{
            System.out.println("str1 != str2");
        }
        //equals比较的是内容
        if(str1.equals(str2)){
            System.out.println("str1 == str2");
        }else{
            System.out.println("str1 != str2");
        }
        //忽略大小写
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("str1 == str2");
        }else{
            System.out.println("str1 != str2");
        }


        }

}
