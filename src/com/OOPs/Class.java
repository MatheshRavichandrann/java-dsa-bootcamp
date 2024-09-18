package com.OOPs;

public class Class {
    public static void main(String[] args) {
        int rno;
        String name;
        float marks;

        Student kunal = new Student();
        kunal.changeName("noKunal");
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student choppa = new Student(21, "luffy", 78);
        System.out.println(choppa.rno);
        System.out.println(choppa.name);
        System.out.println(choppa.marks);


        Student random = new Student(choppa);
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student random1 = new Student();

    }
}

class Student{
    int rno;
    String name;
    float marks;

    void changeName(String name){
        this.name = name;
    }

    Student(){
        // This is how you call a constructor from another constructor
        // internally: new Student (101, " Default", 89f);
      this(101, " Default", 89f);
    }

    // constructor overloading
    // Student zoro = new Student(27, "robin", 69.69f);
    // here, "this" will be replaced with robin
    Student(int rollno, String name, float marks){
        this.rno = rollno;
        this.name = name;
        this.marks = marks;

    }


    Student(Student other){
        this.rno = other.rno; // random.rno = choppa.rno
        this.name = other.name;
        this.marks = other.marks;


    }


}
