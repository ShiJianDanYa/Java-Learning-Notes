package ch06变量.课堂练习;

/**
 * ClassName: 变量_上下车01
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2709:23
 * @Version1.0
 */
/*
一开始没有乘客
1. 上去一位  +1
2. 上去两位，下来一位  +1
3. 上去两位，下来一位 +1
4.下去一位 -1
5.上来一位 +1
 */
public class 变量_上下车01 {
    public static void main(String[] args){
        //一开始没有乘客
        int a = 0;
        //上去一位  +1
        a = a + 1;
        //上去两位，下来一位  +1
        a = a + 1;
        //上去两位，下来一位  +1
        a = a + 1;
        //下去一位 -1
        a = a - 1;
        //上来一位 +1
        a = a + 1;
        System.out.println("公交车上人员现存数量为"+a
        );
    }
}
