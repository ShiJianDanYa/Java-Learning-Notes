package this和super关键字.同学;

/**
 * ClassName: Schoolmate
 * Package: this和super关键字.同学
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 10:36
 * @Version: v1.0
 *
 */
public class Schoolmate {
    String name;
    int age;

    public Schoolmate() {
        this("同学",18);
    }

    public Schoolmate(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

