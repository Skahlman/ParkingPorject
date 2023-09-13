package ProductionCode;

public class Volvo implements Car {

    public int position;
    public int sensors_result = 0;
<<<<<<< HEAD
    public boolean parked;
=======
    public boolean[] parking_situation;
>>>>>>> c231ae7 (moveforward return bool array)


    public Volvo(){
        this.position = 0;
        this.parking_situation = new boolean[500];
    }
    @Override
    public boolean[] MoveForward() {
        this.position++;
        parking_situation[position] = isEmpty(); // sets the position to empty or not empty
        return parking_situation;
    }

    @Override
    public Boolean isEmpty() {

        if (sensors_result == 200)
            return false;
        else
            return true;
    }



    @Override
    public int MoveBackward() {
        this.position = this.position - 1;
        return this.position;
    }

    @Override
    public void Park() {
        parked = true;
    }

    @Override
    public void UnPark() {
        parked = false;
    }

    public void setSensors(int value) {
        sensors_result = value;
    }


    @Override
    public String WhereIs() {
        return "The position of the car is: " + position;
    }

    public boolean isParked(){

        return parked;
    }
}
