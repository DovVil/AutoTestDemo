package introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class AutoTest15skaidre {

    @Test
    public void testIfNumber995IsDividableByNumber3() {
        //duomenys
        int actualInput = 995;
        int expectedResult = 0;
        int actualResult;
        //testo veiksmas
        actualResult = actualInput % 3;
        //palyginimas , visada privalo buti assertai testo gale
        Assert.assertEquals(actualResult, expectedResult, "Actual: " + actualResult +
                " Expected: " + expectedResult);
    }

    @Test
    public void testIfTodayIsThursday(){
        //duomenys
        DayOfWeek expectedDay = DayOfWeek.THURSDAY;
        boolean todayIsThursday;
        //test veiksmas
        DayOfWeek actualDay = LocalDate.now().getDayOfWeek();

        todayIsThursday = expectedDay == actualDay;

        //palyginimas
        Assert.assertTrue(todayIsThursday,String.format("Expected: %s, Actual: %s", expectedDay, actualDay));
    }

    @Test
    public void testWaitFor5seconds(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void testCountOfEvenNumbersBetween1And10() {

        int expectedEvenCount = 4;
        int actualEvenCount = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                actualEvenCount++;
            }
        }

        Assert.assertEquals(actualEvenCount, expectedEvenCount);
    }


}
