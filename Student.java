package PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    int id;
    int age;
    String name;
    String university;

    public Student(){}

    public Student(Student s){
        this.age = s.age;
        this.id = s.id;
        this.name = new StringBuilder(s.name).toString();
        this.university = new StringBuilder(s.university).toString();
    }

    public Student copy(){
        Student s1 = new Student(this);
        return s1;
    }

}
