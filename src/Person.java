public class Person implements IPerson{
    protected String id;
    protected String name;
    protected int age;

    public Person(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void input() {

    }

    @Override
    public void display() {

    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}
