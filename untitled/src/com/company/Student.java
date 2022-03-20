package com.company;

public class Student {
    String name;
    int stuNo;

    Course course1;
    Course course2;
    Course course3;
    double average;

    public Student(String name,int stuNo,Course course1,Course course2,Course course3){
        this.name=name;
        this.stuNo=stuNo;

        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.average=0.0;
    }

    public void addBulkExamNote(int note1,int quiz1,int note2,int quiz2,int note3,int quiz3){
        if(note1>=0 && note1<=100){
            this.course1.note = note1;
        }
        if(quiz1>=0 && quiz1<=100){
            this.course1.quiz=quiz1;
        }
        if(note2>=0 && note2<=100){
            this.course2.note = note2;
        }
        if(quiz2>=0 && quiz2<=100){
            this.course2.quiz=quiz2;
        }
        if(note3>=0 && note3<=100){
            this.course3.note = note3;
        }
        if(quiz3>=0 && quiz3<=100){
            this.course3.quiz=quiz3;
        }
    }

    public void printNote(){
        System.out.println("Lesson: "+this.course1.name+", Exam Result : "+this.course1.note);
        System.out.println("Lesson: "+this.course2.name+", Exam Result : "+this.course2.note);
        System.out.println("Lesson: "+this.course3.name+", Exam Result: "+this.course3.note);

        System.out.println("Lesson: "+this.course1.name+", Exam Result : "+this.course1.quiz);
        System.out.println("Lesson: "+this.course2.name+",Exam Result : "+this.course2.quiz);
        System.out.println("Lesson: "+this.course3.name+", Exam Result : "+this.course3.quiz);
    }

    public void calcAverageWithQuizNote(){
        this.course1.lastNote=(this.course1.quiz*this.course1.quizRate)+(this.course1.note*(1-course1.quizRate));
        this.course2.lastNote=(this.course2.quiz*this.course2.quizRate)+(this.course2.note*(1-this.course2.quizRate));
        this.course3.lastNote=(this.course3.quiz*this.course3.quizRate)+(this.course3.note*(1-this.course3.quizRate));
        calcAverage();

    }

    public void calcAverage(){
        this.average=(this.course1.lastNote+this.course2.lastNote+course3.lastNote)/3.0;
        System.out.println("Average : "+ average);

    }

    public boolean isPass(){
        if (average<55){
            System.out.println("Failed");
            return false;
        } else
            System.out.println("Passed");

        return true;
    }
}