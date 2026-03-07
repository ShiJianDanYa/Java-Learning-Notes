package 综合项目.集合.学生管理系统;

import 练习.集合.手机04.cellphone;

/**
 * ClassName: user
 * Package: 综合项目.集合.学生管理系统
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1316:18
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class user {
    //用户类 属性：用户名、密码、身份证号码、手机号码
    //用户名
    private String name;
    //密码
    private String password;
    //身份证号码
    private String number;
    //手机号码
    private String cellphone;
    //空参构造
    public user(){

    }
    //全参构造
    public user(String name, String password, String number, String cellphone) {
        this.name = name;
        this.password = password;
        this.number = number;
        this.cellphone = cellphone;

    }
    //构造方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
