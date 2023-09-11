package TestCode;

import ProductionCode.Volvo;
import org.junit.Before;
import org.junit.Test;

public class TestVolvo {

    @Before
    public void init()
    {
        Volvo car = new Volvo();
    }

    @Test
    void isEmptyTest_bothSensorsNoisy_returnsError()
    {
        //Arrange – setup the testing objects and prepare the prerequisites for your test.
        Boolean sensor1_result = true;
        Boolean sensor2_result = true;


        //Act – perform the actual work of the test.
        // Assert – verify the result.

    }

}
