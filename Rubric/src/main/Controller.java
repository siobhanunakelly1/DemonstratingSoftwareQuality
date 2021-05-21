package main;
import java.util.ArrayList;

public class Controller {
    private ArrayList<Rubric> rubrics = new ArrayList<>();
    private ArrayList<StudentGrade> studentGrades = new ArrayList<>();

    public Controller(){

    }

    public Rubric createRubric(String subject){
        Rubric r = new Rubric(subject);
        rubrics.add(r);
        return r;
    }

    public ArrayList<Rubric> getAllRubrics(){
        return this.rubrics;
    }

    public Rubric getRubricByName(String name){
        for(Rubric r : this.rubrics){
            if(r.getSubject().equals(name))
                return r;
        }
        return null;
    }

    public Criterion addCriterionToRubric(String criterion, Rubric r){
        Criterion cr = new Criterion(criterion);
        r.addCriterion(cr);
        return cr;
    }

    public ArrayList<StudentGrade> getStudentGrades(){
        return this.studentGrades;
    }

    public StudentGrade createStudentGrade(String name, Rubric rubric){
        StudentGrade sg = new StudentGrade(name);
        rubric.addStudentGrade(sg);
        studentGrades.add(sg);
        return sg;
    }

    public void addScoreToGrade(StudentGrade sg, Criterion cr, int score){
        sg.addGrade(score, cr);
    }

    public ArrayList<StudentGrade> getStudentGradesForRubric(String rubricName){
        if(getRubricByName(rubricName) != null)
            return getRubricByName(rubricName).getGrades();
        return null;


    }
    
}


