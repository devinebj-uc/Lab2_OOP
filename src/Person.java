import java.util.Calendar;

public class Person {
    static int YOB = 1890;
    public Person(String firstName, String lastName, int yob) {
    }

    public int getAge(int YOB){
        return calculateAge(YOB);
    }

    public int getYOB(int YOB){
        return YOB;
    }

    static int calculateAge(int YOB){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.getWeekYear();
        return currentYear - YOB;
    }

    public String fullName(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);

    }

    public static int setYOB(int YOB) {
        return YOB;
    }

    public static void ageValidation(int YOB){
        if (YOB < 1900) {
            throw new ExceptionInInitializerError("Min YOB is 1900");
        }
    }
}
