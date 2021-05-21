package test;

import main.Controller;
import main.Criterion;
import main.Rubric;
import main.StudentGrade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class TestJunit {

    @Test
    public void testCreateRubric(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Law");

        assertEquals("Law", r.getSubject());
    }

    @Test
    public void testAddCriterion(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Science");
        Criterion cr = new Criterion("Chemistry");
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
        c.createRubric("Engineering");

        assertEquals(1, c.getAllRubrics().size());
        assertEquals("Engineering", c.getAllRubrics().get(0).getSubject());
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

        assertNull(c.getRubricByName("French"));
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

        assertNotNull(c.getRubricByName("Art").getGradeByName("Mary"));
    }
    
    @Test
    public void testAddScoreToGrade(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Spanish");
        Criterion cr = c.addCriterionToRubric("Grammar",r);
        StudentGrade sg = c.createStudentGrade("Sarah", r);
        c.addScoreToGrade(sg, cr, 75);

        assertEquals(75, sg.getGradeByCriterionName("Grammar").getScore());
    } 

    @Test
    public void testGetStudentGradesForRubricSingle(){
        Controller c = new Controller();
        Rubric s = c.createRubric("Spanish");
        Criterion cr = c.addCriterionToRubric("Grammar", s);
        StudentGrade sg = c.createStudentGrade("Sarah", s);
        c.addScoreToGrade(sg, cr, 75);

        assertEquals(1, c.getStudentGradesForRubric("Spanish").size());
    } 

    @Test
    public void testGetStudentGradesForRubricMultiple(){
        Controller c = new Controller();
        Rubric rubric1 = c.createRubric("Spanish");
        c.createStudentGrade("Sarah", rubric1);
        c.createStudentGrade("John", rubric1);

        Rubric rubric2 = c.createRubric("Philosophy");
        c.createStudentGrade("Mary", rubric2);

        Rubric rubric3 = c.createRubric("Geography");
        
        assertEquals(2, c.getStudentGradesForRubric("Spanish").size());
        assertEquals(1, c.getStudentGradesForRubric("Philosophy").size());
        assertEquals(0, c.getStudentGradesForRubric("Geography").size());
    } 

    @Test
    public void testGetStudentGradesForRubricNull(){
        Controller c = new Controller();
        Rubric rubric1 = c.createRubric("Spanish");
        c.createStudentGrade("Sarah", rubric1);
        c.createStudentGrade("John", rubric1);

        assertTrue(c.getStudentGradesForRubric("Portuguese").isEmpty());
    } 


}
