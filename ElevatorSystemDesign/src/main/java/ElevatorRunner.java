import java.util.PriorityQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by shivam.si on 04/03/22 1:38 pm
 */

public class ElevatorRunner {
    Elevator elevator;


    private static class RequestProcessor implements Runnable {
        Elevator elevator;
        private boolean stop;

        public RequestProcessor(Elevator elevator) {
            this.elevator = elevator;
            stop = false;
        }

        public void setStop(boolean stop) {
            this.stop = stop;
        }

        @Override
        public void run() {
            while(stop == false) {
                Request upRequest1 = new Request(elevator.currentFloor, 5, Location.INSIDE, Direction.UP);
                Request upRequest2 = new Request(elevator.currentFloor, 3, Location.INSIDE, Direction.UP);

                Request downRequest1 = new Request(elevator.currentFloor, 1, Location.INSIDE, Direction.DOWN);
                Request downRequest2 = new Request(elevator.currentFloor, 2, Location.INSIDE, Direction.DOWN);
                Request downRequest3 = new Request(4, 0, Location.OUTSIDE, Direction.DOWN);

                elevator.addUpRequest(upRequest1);
                elevator.addUpRequest(upRequest2);

                elevator.addDownRequest(downRequest3);

                elevator.addDownRequest(downRequest1);
                elevator.addDownRequest(downRequest2);
                try {
                    Thread.sleep(1000); //just for test
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Elevator elevator = new Elevator(0);
        RequestProcessor requestProcessor = new RequestProcessor(elevator);
        Thread thread = new Thread(requestProcessor);
        thread.start();
        int k = 0;
        while(true) {
            elevator.run();
            //If idle then wait for some time say at night when no one uses elevator we can relax system i.e don't call elevator.run() continuously
            Thread.sleep(3000);
            k++;

            if(k==3)
                break; //just for test
        }
        requestProcessor.setStop(true);
    }
}
