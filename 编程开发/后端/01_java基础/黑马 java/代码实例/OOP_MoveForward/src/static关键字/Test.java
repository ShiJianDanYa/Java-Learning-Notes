package static关键字;

/**
 * ClassName: Test
 * Package: static关键字
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/15 - 09:57
 * @Version: v1.0
 *
 */
public class Test {
    /*
    关于static需要重点掌握的内容：
            1.静态变量，被当前类所有的对象共享
                共享：
                    赋值只要赋值一次
                    只要有一个对象修改了静态变量，其他对象再次访问的时候就是修改之后的结果了
            2.调用方式
                方式一:类名调用(推荐)
                方式二:对象名调用
    */
    public static void main(String[] args) {
        //可以通过对象名调用,但是不推荐
        //stu1.teacher="晓雯老师";
        //studen这个类的所有对象的teacher的都是晓雯老师
        student.teacher="晓雯老师";
        //创建第一个对象
        student stu1 = new student();
        //赋值
        stu1.setName("小诗诗");
        stu1.setAge(18);
        //创建第二个对象
        student stu2 = new student();
        //赋值
        stu2.setName("小丹丹");
        stu2.setAge(20);
        System.out.println(stu2.teacher);
        //开始修改
        stu2.teacher="阿伟老师";
        //打印全部
        System.out.println("名字"+stu1.getName()+"\t 身高"+ stu1.getAge()+"\t 老师"+stu1.teacher);
        System.out.println("名字"+stu2.getName()+"\t 身高"+ stu2.getAge()+"\t 老师"+stu2.teacher);
    }
}
