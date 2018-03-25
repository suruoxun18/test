package test;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestTriangle {
    public static Triangle cal = new Triangle();
    @Test 
     public void testTriangle(){  
        cal.triangle(5, 5, 5);
        assertEquals(1, cal.getReuslt());
        cal.triangle(5, 5, 6);
        assertEquals(2, cal.getReuslt());
        cal.triangle(3, 4, 5);
        assertEquals(3, cal.getReuslt());
        cal.triangle(12, 5, 5);
        assertEquals(0, cal.getReuslt());
        cal.triangle(10, 5, 5);
        assertEquals(0, cal.getReuslt());
        cal.triangle(11, 5, 5);
        assertEquals(0, cal.getReuslt());
        cal.triangle(-1, 5, 5);
        assertEquals(4, cal.getReuslt());
        }
    
}