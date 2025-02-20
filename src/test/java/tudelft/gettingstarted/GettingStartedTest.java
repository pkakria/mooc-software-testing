package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }
//
    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
    //added some more test cases-
    @Test
    public void addFiveToMinus100() {
        int result = new GettingStarted().addFive(-100);
        Assertions.assertEquals(-95,result);
    }
    @Test
    public void addFiveToMinus5() {
        int result = new GettingStarted().addFive(-5);
        Assertions.assertEquals(0,result);
    }
    @Test
    public void addFiveToMinus55() {
        int result = new GettingStarted().addFive(-55);
        Assertions.assertEquals(-50,result);
    }
}
