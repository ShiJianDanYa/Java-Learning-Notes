package 数据安全.小狗;

/**
 * ClassName: Test
 * Package: 数据安全.小狗
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 20:49
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        dog d1 = new dog();
        //开始赋值
        d1.setName("小白");
        d1.setAge(2);
        //输出小狗信息
        System.out.println("小狗名字:"+d1.getName());
        System.out.println("小狗年龄:"+d1.getAge());
        //调用方法
        d1.eat();

    }
}
