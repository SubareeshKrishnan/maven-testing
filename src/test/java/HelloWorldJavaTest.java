

public class HelloWorldJavaTest {

//  Using SureFire - Default
    public void testHelloWorld() {

        HelloWorldJava helloWorldJava = new HelloWorldJava();
        assert("Hello World".equals(helloWorldJava.helloWorld()));

    }
}