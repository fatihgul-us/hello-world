package ReplitOdev.Soru1;

public class Student {
    private String name="Mehmet";
    private int age=30;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return "Student name is "+name +
                "\nSteven is " +age +" years old";
    }
}
