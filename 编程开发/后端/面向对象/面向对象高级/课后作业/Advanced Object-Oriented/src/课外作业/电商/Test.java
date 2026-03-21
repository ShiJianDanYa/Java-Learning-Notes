package 课外作业.电商;

/**
 * ClassName: Test
 * Package: 课外作业.电商
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 11:55
 * @Version: v1.0
 *
 */
public class Test {
    /*
    业务场景：
    某电商平台需要管理商品，基础商品包含名称、价格行为：showlnfo（展示所有的属性
    要求子类按照要求，扩展特有属性

    电子产品：
    增加品牌、型号
    行为：打印名称，价格，品牌，型号等所有属性

    服装：
    增加尺寸、颜色
    行为：打印名称，价格，尺寸，颜色等所有属性
    */
    public static void main(String[] args) {
        //电子产品对象
        ElectronicProducts ep = new ElectronicProducts("MacBook Pro", 9999.9, "Apple", "M1");
        ep.showlnfo();
        System.out.println("--------------------------------------------------");
        //服装对象
        Clothing cl = new Clothing("T恤", 19.9, "MMX", "红色");
        cl.showlnfo();
    }
}
