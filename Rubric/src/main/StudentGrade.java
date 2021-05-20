package main;

import java.util.ArrayList;

public class StudentGrade {
    private String studentName;
    private ArrayList<Grade> grades = new ArrayList<>();

    public StudentGrade(String name){
        this.studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }


    

}
