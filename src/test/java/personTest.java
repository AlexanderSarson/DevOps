import logic.Person;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class personTest {

    Person person;

    @Before
    public void setUp(){
        person = new Person("alex",20);
    }
    @Test
    public void getName() {
        String expected = "alex";
        String result = person.getName();
        assertEquals(expected,result);
    }

    @Test
    public void setName() {
        String expected = "lasse";
        person.setName(expected);
        String result = person.getName();
        assertEquals(expected,result);
    }

    @Test
    public void getAge() {
        int expected = 20;
        int result = person.getAge();
        assertEquals(expected,result);
    }

    @Test
    public void setAge() {
        int expected = 25;
        person.setAge(expected);
        int result = person.getAge();
        assertEquals(expected,result);
    }
    
}