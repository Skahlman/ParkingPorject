package TestCode;

import ProductionCode.Volvo;
import org.junit.*;

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
        Assert.assertEquals(result,false);
    }

}
