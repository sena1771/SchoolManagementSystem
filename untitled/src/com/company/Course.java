package com.company;

public class Course {
    Teacher newTeacher;
    String name,code,prefix;
    int note=0;
    int quiz=0;
    double quizRate;
    double lastNote=0.0;
    Course(String name,String code,String prefix,double quizRate){
 this.name=name;
 this.code=code;
 this.prefix=prefix;
this.quizRate=quizRate;
    }
    void addTeacher(Teacher t){
if(this.prefix.equals(t.branch)){
this.newTeacher=t;
System.out.println("New information added");

}

    }
    void printTeacher(){
if(newTeacher!=null){
    System.out.println("Teacher of the "+this.name+"class");
}


    }
}
