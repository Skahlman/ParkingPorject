package ProductionCode;

public class Volvo implements Car {

    private int position;
    public int sensor1_result;
    public int sensor2_result;

    public Volvo(){
        this.position = 0;
    }
    @Override
    public int MoveForward() {
        return 0;
    }

    @Override
    public Boolean isEmpty() {

    return false;
    }



    @Override
    public void MoveBackward() {

    }

    @Override
    public void Park() {

    }

    @Override
    public void UnPark() {

    }

    public void setSensor1(int i) {
        sensor1_result = i;
    }

    public void setSensor2(int i) {
        sensor2_result = i;
    }

    @Override
    public String WhereIs() {
        return "The position of the car is: " + position;
    }
}
