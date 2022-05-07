import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testHelloWorld() {
        System.out.println("junit5 ran successfully!!");
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.helloWorld());
    }
}