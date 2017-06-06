package entity;

/**
 * 测试教师类的alt+enter
 *
 * @author Wangyapeng
 * @create 2017-06-06 17:21
 */

public class Teacher
{
    private int id;
    private String name;
    private String gender;
    private int age;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Teacher(int id, String name, String gender, int age)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
