package 子类属性赋值传递;

/**
 * ClassName: MemoryStructure
 * Package: 子类属性赋值传递
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 15:51
 * @Version: v1.0
 *
 */
public class MemoryStructure {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.name = "张三";
        //请问结果如何
        z.show();
    }
}

class Fu{
    String name;
}

class Zi extends Fu{
    String name;

    public void show(){
        System.out.println(name+","+super.name);
    }
}