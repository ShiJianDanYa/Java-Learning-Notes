package 练习.字符串.敏感词替换09;

/**
 * ClassName: SensitiveWords
 * Package: 练习.字符串.敏感词替换09
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1120:44
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class SensitiveWords {
    public static void main(String[] args) {
        // 获取敏感词
        String mgc = "你好我日你妈奥 我日你 日你妈 我日你 ";
        //敏感词替换
        mgc= mgc.replace("日你妈","爱你老妈");
        //进阶玩法
        // 敏感词库
        String[] zhk = {"日你妈", "你妈", "日你", "你日"};
        //循环敏感词库 替换敏感词
        for (int i = 0; i < zhk.length; i++) {
            mgc = mgc.replace(zhk[i], "****");
        }
        //打印结果
        System.out.println(mgc);


            }
        }
