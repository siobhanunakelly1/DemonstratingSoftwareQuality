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

    public Rubric getRubricByName(String name){
        for(Rubric r : this.rubrics){
            if(r.getSubject().equals(name))
                return r;
        }
        return null;
    }

    
}


