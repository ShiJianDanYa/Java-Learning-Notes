package 课外作业.快递费计算;

/**
 * ClassName: Local
 * Package: 课外作业.快递费计算
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 14:20
 * @Version: v1.0
 *
 */
public class Local extends Expressage{
    public Local() {
    }
    public Local(String singleNumber, int weight, String recipient) {
        super(singleNumber, weight, recipient);
    }
    @Override
    public int Calculate() {
        return super.Calculate()+10;
    }
}

