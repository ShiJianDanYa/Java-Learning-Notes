package 综合项目.集合.学生管理系统;

import 练习.集合.手机04.cellphone;
import 练习.面向对象.用户界面02.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: userTest
 * Package: 综合项目.集合.学生管理系统
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1316:22
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class userTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建一个集合，来存储用户信息
        ArrayList<user> students = new ArrayList<>();
        wang:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登录\t2.注册\t3.忘记密码\t4.退出系统");
            String input = sc.next();

            //循环校验
            switch (input) {
                case "1" -> login(students);
                case "2" -> register(students);
                case "3" -> forgetPassword(students);
                case "4" -> {
                    break wang;
                }
                default -> {
                    System.out.println("输入的什么玩意？");
                }
            }
        }
    }

    //登录界面方法
    private static void login(ArrayList<user> students) {
        for (int i = 0; i < 3; i++) {

            //先输入用户名
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.next();
            //判断用户是否存在
            if (!sole(students, name)) {
                System.out.printf("用户%s不存在,请注册", name);
                return;
            }
            System.out.println("请输入密码");
            Scanner sc1 = new Scanner(System.in);
            String password = sc1.next();

            System.out.println("请输入验证码");
            //验证码
            while (true) {
                String yzm = authCode();
                System.out.println("生成验证码为" + yzm);

                Scanner sc2 = new Scanner(System.in);
                String shuchu = sc2.next();
                if (shuchu.equalsIgnoreCase(yzm)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误");
                    continue;
                }
            }
            //判断用户名和密码
            //密码判断  需要用户名和密码
            //封装思想 把需要的数据封装为一个对象
            //以后传递参数的时候就需要,传递一个整体粗需要管零散的数据
            user useInfo = new user(name, password, null, null);
            boolean jg = checKUserInfo(students, useInfo);
            if (jg) {
                System.out.println("登录成功,可以使用系统");
                //创建对象 调用方法 启动学生管理系统
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                System.out.println("登录失败,用户名或密码错误");
                System.out.println("第" + i + "次登录,你还剩余" + (2 - i) + "次机会");
            }
        }
    }

    //判断用户名和密码是否相等
    private static boolean checKUserInfo(ArrayList<user> students, user useInfo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(useInfo.getName()) && students.get(i).getPassword().equals(useInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    //生成验证码
    private static String authCode() {
        //随机数字符串
        String sjs = "null";
        //创建一个长度为5的字符数组
        //char[] arr = new char[5];
        //生成一个随机数 是否没2整除来判断是大小写
        Random r = new Random();
        // 创建一个StringBuilder
        StringBuilder zf = new StringBuilder();

        for (int i = 0; i <= 4; i++) {
            int sj = r.nextInt(11);
            int ds = r.nextInt(26);
            if (sj / 2 == 0) {
                //是大写字母
                zf.append((char) (ds + 65));
            } else {
                zf.append((char) (ds + 97));
                //是小写字母
            }
        }
        //最后一位是数字随机数字,在和随机索引交换位置
        //变为字符数组
        //toString 转为字符串 toCharArray 转为字符数组
        char[] arr = zf.toString().toCharArray();

        int sz = r.nextInt(10);
        int wz = r.nextInt(5);
        //随机数字赋值
        arr[arr.length - 1] = (char) (48 + sz);
        //交换位置
        //中间值
        char zj = '$';
        zj = arr[wz];
        arr[wz] = arr[arr.length - 1];
        arr[arr.length - 1] = zj;
        //随机数生成完成
        sjs = new String(arr);
        return sjs;
    }


    //注册界面方法
    private static void register(ArrayList<user> students) {
        //用户对象，用来存储用户信息
        user user = new user();
        //开始判断用户信息
        // 开发细节 先验证格式是否正确，再验证是否唯一
        //因为在以后所有的数据，都是存在数据库中，如果我们要校验，需要使用到网络资源。
        //用户名
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名");
            String input = sc.next();
            //开始判断用户名是否合法
            //判断是否唯一
            if (sole(students, input)) {
                System.out.println("输入用户id不唯一");
                continue;
            }
            //判断长度是否合法
            if (Length(input)) {
            } else {
                System.out.println("长度不合法");
                continue;
            }
            //判断组合是否合法
            if (figure(input)) {
            } else {
                continue;
            }
            //用户名没问题开始添加
            user.setName(input);
            break;
        }

        while (true) {
            //开始判断密码
            System.out.println("请输入密码");
            String pass1 = sc.next();
            System.out.println("请再次输入密码，并且两次密码一致");
            String pass2 = sc.next();

            if (pass(pass1, pass2)) {
                //密码添加到用户对象中
                user.setPassword(pass1);
                break;
            } else {
                System.out.printf("两次密码不一致");
                continue;
            }
        }
        //身份证，开始添加
        while (true) {
            String pass = sc.nextLine();
            System.out.println("请输入身份证号");
            System.out.println("身份证号为18为，且前17位必须为数字，第18为数字或大小写x");
            String number = sc.next();
            //是否合法
            if (pdLength(number, 18)) {
                if (identityCard(number)) {
                    user.setNumber(number);
                    break;
                }
                System.out.println("前17不为数字，或第18不为数字或大小写x");
            } else {
                System.out.println("长度不合法");
                continue;
            }
        }
        //手机号判断
        while (true) {
            System.out.println("请输入手机号");
            System.out.println("非0开头，长度为11");
            String cellphone = sc.next();
            //开始判断
            //0是否为纯数字
            if (pureDigital(cellphone)) {
                //是否为0开头
                if (!(zero(cellphone))) {
                    //判断长度是否为11
                    if (pdLength(cellphone, 11)) {
                        user.setCellphone(cellphone);
                        break;
                    } else {
                        System.out.println("长度是11");
                    }

                } else {
                    System.out.println("手机号码不能以0开头");
                }
            } else {
                System.out.println("号码只能是纯数字");
            }
        }
        //用户对象进入集合
        students.add(user);
        System.out.println("用户注册完成");
        //开始遍历
        printList(students);
    }
    //遍历 方法

    private static void printList(ArrayList<user> students) {
        for (int i = 0; i < students.size(); i++) {
            user user = students.get(i);
            System.out.println("姓名" + user.getName() + "密码" + "\t" + user.getPassword() + "\t" + "身份证号码" + user.getNumber() + "\t" + "手机号码" + user.getCellphone());
        }
    }

    //纯数字判断
    private static boolean pureDigital(String cellphone) {
        for (int i = 0; i < cellphone.length(); i++) {
            if (!(cellphone.charAt(i) >= '0' && cellphone.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    //判断长度
    private static boolean pdLength(String nu, int cd) {
        if (nu.length() == cd) {
            return true;
        }
        System.out.println("长度不合法");
        return false;
    }

    //身份证号判断
    private static boolean identityCard(String number) {
        //是否是0开头
        if (zero(number)) {
            return false;
        }
        //判断前17为是否为数字
        for (int i = 0; i < number.length() - 1; i++) {
            char ch = number.charAt(i);

            if (!(ch >= '0' && ch <= '9')) {
                System.out.print("前17位非数字");
                return false;
            }
        }
        //最后一位
        char endch = number.charAt(number.length() - 1);
        /*if((endch >= '0' && endch <= '9') || (endch == 'X')  || (endch == 'x'))
        {
            return true;
        }else{
            System.out.println("最后一位，必须由数字或大小写X组成");
        }
        return false;*/
        if ((endch >= '0' && endch <= '9') || (endch == 'X') || (endch == 'x')) {
            return true;
        }
        System.out.println("最后一位，必须由数字或大小写X组成");
        return false;
    }

    //判断是否是0开头
    private static boolean zero(String number) {
        //==比得是地址值，但我们要比的是内容
        //所以必须有字符数组创建字符串在比较
        // number.charAt(0)
        char[] chars = new char[1];
        chars[0] = number.charAt(0);
        String zf = new String(chars);
        //String bj = "0";
        if (zf.equals("0")) {
            return true;
        }
        return false;
    }

    //判断两次密码输入是否一致 一致返回true，不一致返回false
    private static boolean pass(String pass1, String pass2) {
        if (pass1.equals(pass2)) {
            return true;
        }
        return false;
    }

    //判断是否是纯数字  false不合法  true输入合法
    private static boolean figure(String Name) {
        //循环遍历判断，用户名字符，如果有一个字符不是字母或者数字，那么就返回false
        //输入用户名不合法
        //sum计数器
        int sum = 0;
        for (int i = 0; i < Name.length(); i++) {
            char c = Name.charAt(i);
            if (!(c > '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
                System.out.println("必须由，大写字母，小写字母，数字组成");
                return false;
            }
            if (c >= '0' && c <= '9') {
                sum++;
            }


        }
        if (sum == Name.length()) {
            System.out.println("不能是纯数字");
            return false;
        }

        return true;

    }

    //判断长度，是否合法  合法true ，不合法false
    private static boolean Length(String length) {
        //长度获取写在前面，只用获取一次，提高代码效率
        int cd = length.length();
        if (cd > 3 && cd < 15) {
            return true;
        }
        return false;
    }

    //判断是否不唯一   相同true 不同 false
    private static boolean sole(ArrayList<user> students, String Name) {
        for (int i = 0; i < students.size(); i++) {
            String mz = students.get(i).getName();
            if (mz.equals(Name)) {
                return true;
            }
        }
        return false;

    }

    //忘记密码界面
    private static void forgetPassword(ArrayList<user> students) {
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        //判断用户名是否存在
        if (sole(students, pass)) {
            System.out.println("请输入身份证号码");
            String number = sc.next();
            System.out.println("请输入手机号码");
            String cellphone = sc.next();
            // 打包数据
            user user = new user(pass, null, number, cellphone);
            //开始判断
            if (retrieve(user, students)) {
                System.out.println("密码修改成功");
            } else {
                System.out.println("密码修改失败");
            }

        } else {
            System.out.println("用户名不存在，未注册");
        }

    }

    //找回判断  账户中身份证号和手机号是否相同
    private static boolean retrieve(user user, ArrayList<user> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(user.getName())) {
                if (!(students.get(i).getNumber().equalsIgnoreCase(user.getNumber()) && students.get(i).getCellphone().equals(user.getCellphone()))) {
                    System.out.println("密码修改失败，身份证或手机号码输入有误");
                    return false;

                } else {
                    while (true) {
                        System.out.println("请输入修改的密码");
                        Scanner sc = new Scanner(System.in);
                        String password1 = sc.next();
                        System.out.println("请再次输入修改的密码");
                        String password2 = sc.next();
                        if (password1.equals(password2)) {
                            students.get(i).setPassword(password1);
                            System.out.println("修改成功密码为" + password1);
                            break;
                        } else {
                            System.out.println("两次密码输入不一致");
                            continue;
                        }
                    }
                }
            }
        }
        return true;
    }
}
