package ProductionCode;

public class Volvo implements Car {

    private int position;

    public Volvo(){
        this.position = 0;
    }
    @Override
    public int MoveForward() {
        return 0;
    }

    @Override
    public void isEmpty() {

    }

    /**

     Description

     Pre-condition: Should not be in the beg

     Post-condition:

     Test-cases:

     */

    /**
     Description
     Moves the car one 1 meter backwards

     Pre-condition:

     Post-condition:

     Test-cases:

     */
    @Override
    public void MoveBackward() {

    }

    @Override
    public void Park() {

    }

    @Override
    public void UnPark() {

    }

    @Override
    public String WhereIs() {
        return "The position of the car is: " + position;
    }
}
