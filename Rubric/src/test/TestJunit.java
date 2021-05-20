package test;

import main.Controller;
import main.Rubric;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

    @Test
    public void testCreateRubric(){
        Controller c = new Controller();
        Rubric r = c.createRubric("Maths");
        assertEquals("Maths", r.getSubject());

    }
    
}
