package 课外作业.菜品介绍;

/**
 * ClassName: Test
 * Package: 课外作业.菜品介绍
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 11:16
 * @Version: v1.0
 *
 */
public class Test {
    /*
    业务场景：
    餐厅菜品系统的继承体系构建
    热菜：
    属性：菜名、价格、口味、烹饪时间
    行为：菜品介绍（如："热菜水煮鱼，价格88元，口味麻辣，烹饪时间20分钟，适合重口味食客”）
    凉菜：
    属性：菜名、价格、口味、保质期
    行为：菜品介绍（如："凉菜拍黄瓜，价格10元，口味酸辣，保质期30分钟，适合所有食客”）
    */
    public static void main(String[] args) {
        //热菜
        HotDishes hd = new HotDishes();
        hd.setDishName("麻辣牛排");
        hd.setPrice(18.9);
        hd.setTaste("麻辣");
        hd.setTime(10);
        hd.dishIntroduction();
        System.out.println("-----------------------------------------------");
        //凉菜
        ColdDishes cd = new ColdDishes();
        cd.setDishName("🧊");
        cd.setPrice(8.9);
        cd.setTaste("冰");
        cd.dishIntroduction();
        System.out.println("-----------------------------------------------");


    }
}
