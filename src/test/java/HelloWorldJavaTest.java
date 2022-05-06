

public class HelloWorldJavaTest {

//  Using SureFire - Default
    public void TestHelloWorld() {

        HelloWorldJava helloWorldJava = new HelloWorldJava();
        assert("Hello World".equals(helloWorldJava.helloWorld()));

    }
}