import transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private String name;
    private int number;

    private Queue<T> queue = new LinkedList<>();

    public ServiceStation(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void addTransportToQueue(T transport){
        queue.offer(transport);
    }

    public void makeAllInspections(){
        T transport = queue.poll();
        if (transport != null){
            System.out.println("Проведен тех.осмотр " + transport.getBrand() + transport.getModel());
            makeAllInspections();
        } else {System.out.println("В очереди никого нет");}
    }

    public int getQueueSize(){
        return queue.size();
    }
}
