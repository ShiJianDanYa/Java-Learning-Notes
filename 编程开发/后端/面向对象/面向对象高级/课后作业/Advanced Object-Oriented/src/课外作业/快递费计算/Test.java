package 课外作业.快递费计算;

/**
 * ClassName: Test
 * Package: 课外作业.快递费计算
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 14:24
 * @Version: v1.0
 *
 */
public class Test {
    /*
    业务场景：
    快递公司需要计算运费，基础快递包含单号String、重量int、收件人String
    行为：计算快递费（计算规则每公斤10元，不需要考虑小数部分）
    额外还有两种由基础快递衍生出来的特殊情况

    同城速递：
    重新计算快递费，在原有的基础上+10元

    异地空运：
    重新计算快递费，在原有的基础上+15元
    */
    public static void main(String[] args) {
        //同城快递
        Local l = new Local("0123456854521", 52, "张三");
        //获取快递费
        System.out.println("单号是"+l.getSingleNumber());
        System.out.println("收件人："+l.getRecipient());
        System.out.println("重量是"+l.getWeight());
        System.out.println(l.Calculate());
        //异地快递
        place p = new place("0123456854521", 52, "王五");
        System.out.println("单号是"+p.getSingleNumber());
        System.out.println("收件人："+p.getRecipient());
        System.out.println("重量是"+p.getWeight());
        System.out.println(p.Calculate());
    }
}
