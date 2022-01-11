package introjunit;

//import org.junit.Test;

//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertThat;

public class GentlemanTest {
    //@Test
    public void testCheck(){
        Gentleman gentleman=new Gentleman();
        String greeting=gentleman.sayHello("John Doe");
       // assertThat(greeting,equalTo("Hello John Doe"));
    }

    //@Test
    public void testCheck2(){
        Gentleman gentleman=new Gentleman();
        String greeting=gentleman.sayHello("Anonymous");
        //assertThat(greeting,equalTo("Hello Anonymous"));
    }
}
