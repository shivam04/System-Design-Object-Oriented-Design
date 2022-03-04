/**
 * Created by shivam.si on 04/03/22 1:02 pm
 */

public class Request {
    int currentFloor;
    int desiredFloor;
    Location location;
    Direction direction;

    public Request(int currentFloor, int desiredFloor, Location location, Direction direction) {
        this.currentFloor = currentFloor;
        this.desiredFloor = desiredFloor;
        this.location = location;
        this.direction = direction;
    }
}
