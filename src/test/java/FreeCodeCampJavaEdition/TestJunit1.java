package FreeCodeCampJavaEdition;

import org.junit.Test;
import org.junit.*;
import FreeCodeCampJavaEdition.basic.ReverseString;

public class TestJunit1 {
    ReverseString rs;
    Factorial ft;
   
    @Before
    public void setup() {
        rs = new ReverseString();
        fr = new Factorial();
    }
    
    @Test
    public void testReverseString() throws AssertionError {
        System.out.println("Testing Reverse String");
	    assert rs.reverseString("Hello") instanceof String;
        assert rs.reverseString("Hello").equals("olleH");
        
        assert rs.reverseString("Howdy").equals("ydwoH");
        assert rs.reverseString("Greetings from Earth").equals("htraE morf sgniteerG");
	    System.out.println("Reverse String Passed");  
    }
    
    @Test
    public void testFactorialize() throws AssertionError {
        System.out.println("Testing Factorialize");
        // return int
        assert Long.class.isInstance(factorialize(5));
    }
    
    /*public void testFactorialize()  throws AssertionError {
        
        
        
        //assert Float.class.isInstance(factorialize(5));
        // 5 return 120
        assert factorialize(5) == 120;
        // 10 return 3628800
        assert factorialize(10) == 3628800;
        // 20 return 2432902008176640000
        assert factorialize(20) == 2432902008176640000L;
        // 0 return 1
        assert factorialize(0) == 1;
        System.out.println("Factorialize passed");
    }*/
}
