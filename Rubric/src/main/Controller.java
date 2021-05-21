package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        ArrayList<StudentGrade> grades = new ArrayList<>();
        if(getRubricByName(rubricName) != null)
            grades = getRubricByName(rubricName).getGrades();
        return grades;
    }

    public int average(int[] numbers){
        int total = 0;
        for(int i =0; i < numbers.length; i++){
            total += numbers[i];
        }
        return total/numbers.length;
    }

    public int maxScore(int[] numbers){
        int max = numbers[0];
    
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }

    public int minScore(int[] numbers){
        List<Integer> list= new ArrayList<>();
        for (int j : numbers) {
            list.add(j);
        }
        Collections.sort(list);
        return list.get(0);
    }

    public double standardDeviation(int[] numbers){
        double sum = 0.0;
        double standardDeviation = 0.0;
        int length = numbers.length;

        for(double num : numbers) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
    
}


