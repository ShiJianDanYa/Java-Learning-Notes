package 练习.集合.用户查找03;

/**
 * ClassName: user
 * Package: 练习.集合.用户查找
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1310:16
 * @Version1.0
 */
    
    /*
     1，main方法中定义一个集合，存入三个用户对象。
    用户属性为：id，username，password
    2，要求：定义一个方法，根据id查找对应的用户信息。
    如果存在，返回true
    如果不存在，返回false
*/
public class user {
    private int id;
    private String username;
    private String password;
    public user()
    {

    }
    public user(int id, String username, String password)
    {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
