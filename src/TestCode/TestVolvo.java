package TestCode;

import ProductionCode.Volvo;
import org.junit.*;
import static org.junit.Assert.*;

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
    @Test
    public void TestwhereIs(){

        Volvo car = new Volvo();
        int position_integer = car.position;
        assertEquals("The position of the car is: " + position_integer, car.WhereIs());

    }

    @Test
    public void TestMoveForward(){

        Volvo car = new Volvo();
        int position_integer = car.position;
        position_integer = position_integer + 1;
        assertEquals(position_integer, car.MoveForward());

    }
    @Test
    public void TestBackward(){

        Volvo car = new Volvo();
        int position_integer = car.position;
        position_integer = position_integer -1;
        assertEquals(position_integer, car.MoveBackward());

    }

}
