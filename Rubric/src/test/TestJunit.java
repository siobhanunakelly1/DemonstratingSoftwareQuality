package test;

import main.Controller;
import main.Criterion;
import main.Rubric;
import main.StudentGrade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestJunit {

    @Test
    public void testCreateRubric(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Maths");
        assertEquals("Maths", r.getSubject());

    }

    @Test
    public void testAddCriterion(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Maths");
        Criterion cr = new Criterion("Algebra");
        r.addCriterion(cr);
        assertTrue(r.getCriteria().contains(cr));
    }

    @Test
    public void testGetAllRubricsEmpty(){
        Controller c = new Controller();
        assertTrue(c.getAllRubrics().isEmpty());
    }

    @Test
    public void testGetAllRubricsSingle(){
        Controller c = new Controller();
        c.createRubric("Maths");
        assertEquals(1, c.getAllRubrics().size());
        assertEquals("Maths", c.getAllRubrics().get(0).getSubject());
    }

    @Test
    public void testGetAllRubricsMultiple(){
        Controller c = new Controller();
        c.createRubric("Maths");
        c.createRubric("English");
        c.createRubric("Irish");
        assertEquals(3, c.getAllRubrics().size());
        assertEquals("Irish", c.getAllRubrics().get(2).getSubject());
    }


    @Test
    public void testGetRubricByName(){
        Controller c = new Controller();
        Rubric m = c.createRubric("Maths");
        Rubric e = c.createRubric("English");
        Rubric i = c.createRubric("Irish");
        assertEquals(e, c.getRubricByName("English"));
    }

    @Test
    public void testGetRubricByNameNotExisting(){
        Controller c = new Controller();
        c.createRubric("Maths");
        c.createRubric("English");
        c.createRubric("Irish");
        assertEquals(null, c.getRubricByName("French"));
    }

    @Test
    public void testAddCriterionToRubric(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Maths");
        Criterion cr = c.addCriterionToRubric("Geometry", r);
        assertTrue(r.getCriteria().contains(cr));
    }

    @Test
    public void testCreateStudentGrade(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Art");
        StudentGrade sg = c.createStudentGrade("Mary", r);
        for(StudentGrade studentGrade : c.getRubricByName("Art").getGrades()){
            if(studentGrade.getStudentName().equals("Mary")){
                assertEquals(studentGrade, sg);
            }
        }

    }
    
    @Test
    public void testAddScoreToGrade(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Spanish");
        Criterion cr = c.addCriterionToRubric("Grammar",r);
        StudentGrade sg = c.createStudentGrade("Sarah", r);
        c.addScoreToGrade(sg, cr, 75);
        StudentGrade studentGrade = c.getRubricByName("Spanish").getGradeByName("Sarah");
        assertEquals(75, studentGrade.getGradeByCriterionName("Grammar").getScore());
    } 
}
