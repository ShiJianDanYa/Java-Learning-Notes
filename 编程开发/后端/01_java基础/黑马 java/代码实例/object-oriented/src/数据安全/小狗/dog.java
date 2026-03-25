package 数据安全.小狗;

/**
 * ClassName: dog
 * Package: 数据安全.小狗
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 20:22
 * @Version: v1.0
 *
 */
public class dog {
    /*小狗有属性：姓名、年龄。行为：吃骨头
            实现以下需求
    要求1：小狗的年龄：0～15岁
    要求2：打印小狗所有的信息：小白，2岁
    要求3：调用吃骨头的方法打印效果：2岁的小白，正在吃骨头*/
    private String name;
    private int age;
    //提供get/set方法
    //name
    //value:表示将来要赋的值 小白
    public void setName(String value){
        //小狗名字属性赋值
    name = value;
    }
    public String getName(){
        return name;
    }
    //age
    //num:表示将来要赋的值 2
    public void setAge(int num){
        //给小狗年龄判断,并对其进行赋值
        if(num<=15&&num>=0){
            age = num;
        }else{
            System.out.println("输入年龄有误 正确范围0～15岁");
        }
    }
    public int getAge(){
        return age;
    }
    //行为
    public void eat(){
        System.out.println(age+"岁的"+name+"在吃骨头");
    }

}
