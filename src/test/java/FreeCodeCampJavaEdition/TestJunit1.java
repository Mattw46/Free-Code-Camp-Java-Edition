package FreeCodeCampJavaEdition;

import org.junit.Test;
import org.junit.*;
import FreeCodeCampJavaEdition.basic.ReverseString;

public class TestJunit1 {
    ReverseString rs;
   
    @Before
    public void setup() {
        rs = new ReverseString();
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
}
