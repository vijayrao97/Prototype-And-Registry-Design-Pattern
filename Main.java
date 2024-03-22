package PrototypeAndRegistry;

public class Main {

    public static void fillRegistry(studentRegistry sr){
        iStudent is = new iStudent();
        is.name = "abc";
        is.university = "Mumbai";
        sr.setRegister("iStudent",is);

        Student s1 = new Student();
        s1.name = "xyz";
        s1.university = "Delhi";
        sr.setRegister("Student",s1);

        System.out.println("Registry added.");

    }

    public static void main(String[] args){
        studentRegistry sr = new studentRegistry();
        fillRegistry(sr);
        Student s1 = sr.getRegister("Student");
        Student is = sr.getRegister("iStudent");
        System.out.println("Debug");
    }
}
