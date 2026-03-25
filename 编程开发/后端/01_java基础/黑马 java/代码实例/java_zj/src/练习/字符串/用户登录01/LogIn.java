package 练习.字符串.用户登录01;

/**
 * ClassName: LogIn
 * Package: 练习.字符串.用户登录01
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/916:58
 * @Version1.0
 */
    
    /*
    需求：已知正确的用户名和密码，
    请用程序实现模拟用户登录
    总共给三次机会，登录之后，给出相应的提示
*/
public class LogIn {
    public static void main(String[] args) {
        String username = "abc";
        String password = "123";
        int count = 0;
        for (int i = 0; i < 3; i++) {

            System.out.println("请输入用户名：");
            String inputUsername = new java.util.Scanner(System.in).nextLine();
            System.out.println("请输入密码：");
            String inputPassword = new java.util.Scanner(System.in).nextLine();
            //判断用户名密码是否正确
                if(compare(inputUsername,username) && compare(inputPassword,password))
                {
                System.out.println("登录成功");
                break;
                }else{
                    if(count == 2){
                        System.out.println("您的账号已被锁定");
                        break;
                    }else{
                        System.out.println("登录失败");
                        count++;
                        System.out.println("您还有"+(3-count)+"次机会");

                    }
                }
            }
    }
    //字符串比较
    public static boolean compare(String str1, String str2){
        return str1.equals(str2);
    }public static boolean check(String username,String password){
        if(username.equals("abc") && password.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
