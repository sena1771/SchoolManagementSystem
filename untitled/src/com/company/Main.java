package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher teacher= new Teacher("Erdal","2133233","Turkish");
        Teacher teacher1= new Teacher("Sena","122","Math");
        Teacher teacher2= new Teacher("Feyza","32542","Science");


        Course turkish=new Course("Turkish","TR","TR",0.47);
        turkish.addTeacher(teacher);

        Course math=new Course("Math","MAT","MAT",0.14);
        math.addTeacher(teacher1);

        Course science= new Course("Science","Science","Sci",0.35);
        science.addTeacher(teacher2);

        Student student = new Student("ali",12,turkish,math,science);
        student.addBulkExamNote(100,17,99,11,77,300);
        student.printNote();
        student.calcAverageWithQuizNote();
        System.out.println(student.isPass());


        Student student1= new Student("veli",22,turkish,math,science);
        student1.addBulkExamNote(45,40,88,42,22,43);
        student1.printNote();
        student1.calcAverageWithQuizNote();
        System.out.println(student1.isPass());


    }
}

