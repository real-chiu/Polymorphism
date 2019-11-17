package src.model;

public class Student extends Human {

    public Student (int age) {
        super(age);
    }

    public Student (int age, String intro) {
        super(age, intro);
    }

    @Override
    public void doSomething () {
        System.out.println("I am overrided and now I, as a student, will do something!");
    }
}
