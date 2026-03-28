package this关键字;

/**
 * ClassName: Test
 * Package: 面向对象基础.课外练习.学生信息
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 15:33
 * @Version: v1.0
 *
 */
public class Test {
    /*
    在校学生有属性：姓名、年龄、身高、体重。行为：学习。
    实现以下需求
    要求1：大一新生，张三，18岁，183cm，60kg，刚进大学努力学习。
    要求2：大二期间张三体重增加了10kg
    要求3：大三期间张三减肥成功，身高增加2cm，体重减少3kg
    要求4：打印大学毕业之后，张三的所有信息
    */
    public static void main(String[] args){
        //创建对象
        student s = new student();
        //开始赋值
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);
        s.study();
        System.out.println("张三的信息：");
        System.out.println("姓名："+s.getName());
        System.out.println("年龄："+s.getAge());
        System.out.println("身高："+s.getHeight());
        System.out.println("体重："+s.getWeight());
        //大二期间增加体重
        //s.gainWeight(10);
        //其实有更简单的写法，直接s.setWeight(s.getWeight()+10);
        s.setWeight(s.getWeight()+10);
        System.out.println("张三的体重"+s.getWeight());
        //年龄增加
        s.setAge(s.getAge()+1);
        //大三期间 减肥 加身高
        /*s.clossOfWeight(3);
        s.gainHeight(2);*/
        s.setWeight(s.getWeight()-3);
        s.setHeight(s.getHeight()+2);
        //年龄增加
        s.setAge(s.getAge()+1);
        //打印大学毕业之后，张三的所有信息 有隐藏信息 年龄呢不增加吗
        //大四年龄增加
        s.setAge(s.getAge()+1);
        //毕业后在加一
        s.setAge(s.getAge()+1);
        System.out.println("张三的信息：");
        System.out.println("姓名："+s.getName());
        System.out.println("年龄："+s.getAge());
        System.out.println("身高："+s.getHeight());
        System.out.println("体重："+s.getWeight());
    }
}
