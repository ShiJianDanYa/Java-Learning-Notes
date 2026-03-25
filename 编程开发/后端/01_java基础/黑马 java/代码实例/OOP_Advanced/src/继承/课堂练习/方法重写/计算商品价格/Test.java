package 继承.课堂练习.方法重写.计算商品价格;

/**
 * ClassName: Test
 * Package: 继承.课堂练习.方法重写.计算商品价格
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/19 - 16:08
 * @Version: v1.0
 *
 */
public class Test {
    /*
    某电商项目售卖智能设备，智能设备包括：手机，笔记本电脑，平板
    1，所有的智能设备有以下属性：商品名，商品价格
    行为：计算商品价格：
        [0～1000）元，不打折
        [1000～5000）元，9折
        [5000～10000）元，8折
        超出10000元，7折
    2，手机享受额外补贴，在原有的基础上基础打9折。
    3，笔记本电脑和平板电脑没有不享受额外补贴。
    */
    public static void main(String[] args){
        //创建对象计算价格
        //笔记本
        NotebookComputer nc = new NotebookComputer();
        nc.name = "机械革命";
        nc.price=7649.15;
        //计算价格
        double v = nc.calculatePrice();
        //笔记本电脑的价格
        System.out.println("笔记本电脑的品牌:"+nc.name+"\n 笔记本电脑的原价"+nc.price+"\n优惠后价格"+v);

        //平板
        TabletComputer tc = new TabletComputer();
        tc.name = "苹果";
        tc.price = 8563 ;
        //计算价格
        double v1 = tc.calculatePrice();
        //平板电脑的价格
        System.out.println("平板电脑的品牌:"+tc.name+"\n 平板电脑的原价"+tc.price+"\n优惠后价格"+v1);

        //手机
        MobilePhone mp = new MobilePhone();
        //属性赋值
        mp.name="华为";
        mp.price=9000;
        //计算价格
        double v2 = mp.calculatePrice();
        System.out.println("手机的品牌:"+mp.name+"\n 手机的原价"+mp.price+"\n优惠后价格"+v2);




    }
}
