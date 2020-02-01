import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private static Person person;
    private String firstName = "firstName";
    private String lastName = "lastName";
    private static int YOB = 1994;

    @BeforeEach
    void setup() {
        person = new Person(firstName, lastName, YOB);
    }

    @Test
    void getFullName() {
        assertEquals(firstName+" "+lastName, person.fullName(firstName,lastName));
    }

    @Test
    void setYOB() throws Exception {
        Person.setYOB(YOB);
        assertEquals(YOB, person.getYOB(YOB));
    }

    @Test
    void calculateAge() {
        assertEquals(11, Person.calculateAge(2009));
    }

    @Test
    void getAge() {
        assertEquals(26, person.getAge(YOB));
    }

    @Test
    void ageValidation() throws ExceptionInInitializerError {
        ExceptionInInitializerError thrown =
                assertThrows(ExceptionInInitializerError.class, () -> Person.setYOB(1890), "Min YOB is 1900");
        assertEquals("Min YOB is 1900", thrown.getMessage());
    }
}