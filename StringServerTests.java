import static org.junit.Assert.*;
import org.junit.*;

import java.net.URI;

public class StringServerTests {

    @Test
    public void test1TwoQueries() {
    Handler test1Handler = new Handler();
    URI test1arg1 = new URI("http://localhost:4000/add-message?s=test1FirstLine");
    URI test1arg2 = new URI("http://localhost:4000/add-message?s=test1SecondLine");
    testHandler1.handleRequest(test1arg1);
    assertEquals("test1FirstLine" + "\n" + "test2SecondLine",
            testHandler1.handleRequest(test1arg2));
    }

}