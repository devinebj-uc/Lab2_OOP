import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;
    private String firstName = "firstName";
    private String lastName = "lastName";
    private int YOB = 1994;

    @BeforeEach
    void setup() {
        person = new Person(firstName, lastName, YOB);
    }

    @Test
    void getFullName() {
        assertEquals(firstName+" "+lastName, person.fullName());
    }

    @Test
    void setYOB() throws Exception {
        person.setYOB(YOB);
        assertEquals(YOB, person.getYOB());
    }

    @Test
    void calculateAge() {
        assertEquals(10, Person.calculateAge(2009));
    }

    @Test
    void getAge() {
        assertEquals(25, person.getAge());
    }

    @Test
    void ageValidation() throws ExceptionInInitializerError {
        ExceptionInInitializerError thrown =
                assertThrows(ExceptionInInitializerError.class,
                        () -> person.setYOB(1890),
                        "Min YOB is 1900");

        assertEquals("Min YOB is 1900", thrown.getMessage());
    }
}