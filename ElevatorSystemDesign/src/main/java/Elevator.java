import java.util.PriorityQueue;

/**
 * Created by shivam.si on 04/03/22 1:03 pm
 */

public class Elevator {
    int currentFloor;
    Direction direction;
    PriorityQueue<Request> upQ;
    PriorityQueue<Request> downQ;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
        this.direction = Direction.IDLE;
        upQ = new PriorityQueue<>((a,b) -> a.desiredFloor - b.desiredFloor);
        downQ = new PriorityQueue<>((a,b) -> b.desiredFloor - a.desiredFloor);
    }

    public PriorityQueue<Request> getUpQ() {
        return upQ;
    }

    public void setUpQ(PriorityQueue<Request> upQ) {
        this.upQ = upQ;
    }

    public PriorityQueue<Request> getDownQ() {
        return downQ;
    }

    public void setDownQ(PriorityQueue<Request> downQ) {
        this.downQ = downQ;
    }

    public void addUpRequest(Request upRequest) {
        if(Location.OUTSIDE == upRequest.location) {
            upQ.offer(new Request(upRequest.currentFloor, upRequest.currentFloor, Location.OUTSIDE, Direction.UP));
            System.out.println("Added up request going to floor " + upRequest.currentFloor + ".");
        }
        upQ.offer(upRequest);
        System.out.println("Added up request going to floor " + upRequest.desiredFloor + ".");
    }

    public void addDownRequest(Request downRequest) {
        if(Location.OUTSIDE == downRequest.location) {
            downQ.offer(new Request(downRequest.currentFloor, downRequest.currentFloor, Location.OUTSIDE, Direction.DOWN));
            System.out.println("Added down request going to floor " + downRequest.currentFloor + ".");
        }
        downQ.offer(downRequest);
        System.out.println("Added down request going to floor " + downRequest.desiredFloor + ".");
    }

    public void run() {
        while (!upQ.isEmpty() || !downQ.isEmpty()) {
            processRequests();
        }

        System.out.println("Finished all requests.");
        this.direction = Direction.IDLE;
    }

    private void processRequests() {
        if (this.direction == Direction.UP || this.direction == Direction.IDLE) {
            processUpRequest();
            processDownRequest();
        } else {
            processDownRequest();
            processUpRequest();
        }
    }

    private void processUpRequest() {
        while(!upQ.isEmpty()) {
            Request upRequest = upQ.poll();
            this.currentFloor = upRequest.desiredFloor;
            System.out.println("Up -> Elevator stopped at floor " + this.currentFloor + ".");
        }
        if (!downQ.isEmpty()) {
            this.direction = Direction.DOWN;
        } else {
            this.direction = Direction.IDLE;
        }
    }

    private void processDownRequest() {
        while(!downQ.isEmpty()) {
            Request downRequest = downQ.poll();
            this.currentFloor = downRequest.desiredFloor;
            System.out.println("Down -> Elevator stopped at floor " + this.currentFloor + ".");
        }
        if (!upQ.isEmpty()) {
            this.direction = Direction.UP;
        } else {
            this.direction = Direction.IDLE;
        }
    }

}
