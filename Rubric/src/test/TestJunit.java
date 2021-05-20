package test;

import main.Controller;
import main.Criterion;
import main.Rubric;

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

    
}
