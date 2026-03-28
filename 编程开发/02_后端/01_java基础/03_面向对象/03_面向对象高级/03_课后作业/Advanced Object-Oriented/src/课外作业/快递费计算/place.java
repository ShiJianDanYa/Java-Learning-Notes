package 课外作业.快递费计算;

/**
 * ClassName: place
 * Package: 课外作业.快递费计算
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 14:23
 * @Version: v1.0
 *
 */
public class place extends Expressage{
    public place() {
    }
    public place(String singleNumber, int weight, String recipient) {
        super(singleNumber, weight, recipient);
    }
    @Override
    public int Calculate() {
        return (super.Calculate()+15);
    }
}
