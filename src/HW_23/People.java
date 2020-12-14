package HW_23;

public class People implements Comparable<People>{
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People - "+name+" {" +
                "age='" + age + '\'' +
                ", Sex=" + sex +
                "}";
    }

    @Override
    public int compareTo(People o) {
        return name.compareTo(o.name);
    }
}
