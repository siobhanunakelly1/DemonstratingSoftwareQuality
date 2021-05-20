package main;
import java.util.ArrayList;

public class Controller {
    private ArrayList<Rubric> rubrics = new ArrayList<>();

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

    
}


