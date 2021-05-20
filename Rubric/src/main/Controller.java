package main;
import java.util.ArrayList;

public class Controller {
    private ArrayList<Rubric> rubrics = new ArrayList<>();

    public Controller(){

    }

    public Rubric createRubric(String subject){
        return new Rubric(subject);
    }

    

    
}


