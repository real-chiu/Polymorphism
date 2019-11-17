package src.model;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Question 1
        System.out.println("Question 1:---------------------\n");
        // Here you can see the Human/Student constuctor has been overloaded
        // overloading can be performed either in parentClass/subclass
        Human shyHuman = new Human(20);
        Human outgoingHuman = new Human(20, "I am a very outgoing Human!!!\n");
        Student shyStudent = new Student(20);
        Student outgoingStudent = new Student(20, "I am a very outgoing Student!!!\n");
        System.out.println("Shy human said: " + shyHuman.getIntro());
        System.out.println("Outoging human said: " + outgoingHuman.getIntro());
        System.out.println("Shy student said: " + shyStudent.getIntro());
        System.out.println("Outoging student said: " + outgoingStudent.getIntro());

        // Here you can see that both shy and outgoing student has overrided the Human doSomething method
        shyHuman.doSomething();
        outgoingHuman.doSomething();
        shyStudent.doSomething();
        outgoingStudent.doSomething();

        //Question 2
        System.out.println("Question 2:---------------------\n");
        Printer printer = new Printer();
        ColorPrinter colorPrinter = new ColorPrinter("Colorful");
        BlackWhitePrinter blackAndWhitePrinter = new BlackWhitePrinter("Black and White");
        System.out.println(printer.getIdentity());
        System.out.println(colorPrinter.getIdentity());
        System.out.println(blackAndWhitePrinter.getIdentity());
        printer.printing();
        colorPrinter.printing();
        blackAndWhitePrinter.printing();
    }
}
