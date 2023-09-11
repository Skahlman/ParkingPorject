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
    }

    public void setSensor2(int i) {
    }

    @Override
    public String WhereIs() {
        return "The position of the car is: " + position;
    }
}
