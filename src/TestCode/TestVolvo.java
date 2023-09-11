package TestCode;

import ProductionCode.Volvo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestVolvo {

    @Before
    public void init()
    {

    }

    @Test
    public void isEmptyTest_returnsNotEmpty()
    {
        //Arrange – setup the testing objects and prepare the prerequisites for your test.

        Volvo car = new Volvo();
        car.setSensor1(200);
        car.setSensor2(200);

        //Act – perform the actual work of the test.
        Boolean result = car.isEmpty();

        // Assert – verify the result.
        assertEquals(result,false);
    }

    void TestwhereIs(){

        Volvo car = new Volvo();
        int position_integer = car.position;
        assertEquals("The position of the car is: " + position_integer, car.WhereIs());





    }

}
