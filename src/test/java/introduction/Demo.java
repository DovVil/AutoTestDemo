package introduction;

import org.testng.Assert;
import org.testng.annotations.Test;   //   kolkas butent sita biblioteka

import java.time.LocalTime;

public class Demo {
    // paleidimui reikia anotacijos
//    @Test   // cia yra anotacija
//    public void test01(){   /// testu pavadinimai buna ilgi, is mazosios
//
//    }

    @Test
    public void testIfNumber4IsEven(){
        //duomenys
        int actualInput = 4;
        int expectedResult = 0;
        int actualResult;
        //testo veiksmas
        actualResult = actualInput % 2;
        //palyginimas , visada privalo buti assertai testo gale
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIfNumber5IsNotEven(){
        //duomenys
        int actualInput = 5;
        int expectedResult = 1;
        int actualResult;
        //testo veiksmas
        actualResult = actualInput % 2;
        //palyginimas , visada privalo buti assertai testo gale
        Assert.assertTrue(actualResult == expectedResult, "Actual: " + actualResult +
                " Expected: " + expectedResult);
    }

    @Test
    public void testIfTimeNowIsNot19Hour(){
        //duomenys
        int notExpectedTime = 19;
        int actualTime;
        //test veiksmas
        actualTime = LocalTime.now().getHour();
        //palyginimas
        Assert.assertFalse(notExpectedTime == actualTime,"NotExpected: " + notExpectedTime +
                " Actual: " + actualTime);
    }
}
