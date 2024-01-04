import java.io.Serializable;

public class Worker implements Serializable {
    int id;
    String Name;
    int age;

    public Worker(int id, String name, int age) {
        this.id = id;
        Name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

}
