package 课堂.运算符.自增自减运算符;

/**
 * ClassName: auto
 * Package: 课堂.运算符.java07
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2721:38
 * @Version1.0
 */

public class auto {
    public static void main(String[] args) {
        //自增自减 两者在单独一行没有区别
        // 但是在表达式中，自增自减在前面，先自增自减，再参与运算
        //自增自减在后面，先参与运算，再自增自减
    int a = 10;
    ++a;
    System.out.println(a);
    a = 10;
    a++;
    System.out.println(a);
    a = 10;
    a--;
    System.out.println(a);
    a = 10;
    --a;
    System.out.println(a);
    System.out.println("=============================");
    //++--在前 先自增自减，再参与运算
    int w = 10;
    int b = ++w;
    System.out.println(w);
    System.out.println(b);
    //++--在后 先参与运算，再自增自减
    int c = w++;
    System.out.println(w);
    System.out.println(c);

    }
}
