package 专题综合练习.案例03开发验证码;

import java.util.Random;

/**
 * ClassName: VerificationCode
 * Package: 专题综合练习.案例03开发验证码
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/408:56
 * @Version1.0
 */

/*
 * 需求;实现随机产生一个5位的验证码
 * 验证码格式
 * 1. 长度为5
 * 2. 前4位是大写字母或者小写字母
 * 3. 最后一位是数字
 */
public class VerificationCode {
    public static void main(String[] args) {


            System.out.println(getCode()+" "+getCode()+" "+getCode()+" "+getCode()+" "+getCode2());
        }
        public static char getCode() {
            //如果要在一堆没什么规律的数据中随机抽取
            //可以把这些数据放到一个数组中
            //随机抽取一个索引
            char[] chs = new char[52];
            //把大写和小写字母放到数组中
            for(int i=0;i<chs.length;i++) {
                if (i < 26) {
                    //将数字强制转化为asll码表中的字母符号
                    chs[i] = (char) ('A' + i);
                } else {
                    chs[i] = (char) ('a' + i - 26);
                }
            }
            Random r = new Random();
            int sj1 = r.nextInt(chs.length);
            char code = chs[sj1];

            return code;

        }
        public static int getCode2() {
            Random r = new Random();
            int sj2 = r.nextInt(10);
            return sj2;
        }
    }
