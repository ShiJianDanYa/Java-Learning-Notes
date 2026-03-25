package 练习.面向对象.用户界面02;

/**
 * ClassName: User
 * Package: 练习.面向对象.用户界面02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/611:25
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class User {
    //用户登录需要的属性变量
    private String name;
    private int password;
    private String email;
    private double gender;
    private int age;
    //空参构造方法
    public User(){}
    //有参构造方法
    public User(String name,int password,String email,double gender,int age){
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    //get和saet方法
    //生成方法快捷键：alt+insert
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGender() {
        return gender;
    }

    public void setGender(double gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
