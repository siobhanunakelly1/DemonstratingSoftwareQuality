package main;
import java.util.ArrayList;

public class Rubric {
    private String subject;
    private ArrayList<Criterion> criteria = new ArrayList<>();
    private ArrayList<StudentGrade> grades = new ArrayList<>();

    public Rubric(String subject){
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Criterion> getCriteria() {
        return criteria;
    }

    public void setCriteria(ArrayList<Criterion> criteria) {
        this.criteria = criteria;
    }

    public void addCriterion(Criterion criterion){
        this.criteria.add(criterion);
    }

    public ArrayList<StudentGrade> getGrades() {
        return grades;
    }

    public StudentGrade getGradeByName(String name){
        for(StudentGrade sg : this.grades){
            if(sg.getStudentName().equals(name))
                return sg;
        }
        return null;
    }

    public void setGrades(ArrayList<StudentGrade> grades) {
        this.grades = grades;
    }

    public void addStudentGrade(StudentGrade sg){
        grades.add(sg);
    }

}
