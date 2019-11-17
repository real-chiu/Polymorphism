package src.model;

public class Human {
    public int age;
    public String intro;

    public Human (int age) {
        this.age = age;
        intro = "This is the default introdution";
    }

    public Human (int age, String intro) {
        this.age = age;
        this.intro = intro;
    }

    public int getAge () {
        return age;
    }

    public String getIntro () {
        return intro;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setIntro (String intro) {
        this.intro = intro;
    }
    public void doSomething () {
        System.out.println("Human doing something...");
    }
}
