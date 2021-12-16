package genericsAndCollections.advancedCollections.queueExample;



/*
        Sometimes we need to process items in a First-In, First-Out (FIFO) order.

        Queues are data structures that allow us to process items in a First-In, First-Out (FIFO) order.
        The first item placed in a queue is also the first one removed from the queue.

        An everyday example is a line at the grocery story, where the first customer to arrive at
        the checkout counter should be the first person to leave the store.
        There are many analogous cases in computer programs, such as when we have a list of
        processes and need to execute them in the order they arrive.

        Some key points about Queues in Java:

        - Queue is an interface that implements the Collection interface
        - We put newly added elements at the end of the queue
        - We pop elements off the front of the queue*/


import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {

    public static void main(String[] args) {

        Queue<String> queueCustomers = new LinkedList<>();

        queueCustomers.add("Luis");
        queueCustomers.add("Bon");
        queueCustomers.add("Emmi");
        queueCustomers.add("Evi");
        queueCustomers.add("Mum");
        queueCustomers.add("Dad");

        while (!queueCustomers.isEmpty()) {
            System.out.println("Customer " + queueCustomers.poll() + " is being served." );
        }

    }


}
