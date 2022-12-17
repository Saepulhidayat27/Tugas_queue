/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugas_queue;

/**
 *
 * @author UMI DIAN
 */
public class Tugas_queue {

   public static void main(String[] args) {
        Employee janeJones = new Employee("saepul", "Hidayat", 270504);
        Employee johnDoe = new Employee("Agus", "Aditya", 460217);
        Employee marySmith = new Employee("Surya", "Bayu", 3322);
        Employee mikeWilson = new Employee("Syahrul", "Hidayat", 050527);
        Employee billEnd = new Employee("Sadiah", "End", 240904);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        
        System.out.println("Add to Queue \n");
        queue.printQueue();

        queue.remove();
        queue.remove();
        System.out.println("Remove 2 Data from Queue \n");
        queue.printQueue();

        System.out.println("Peek Data From Queue \n");
        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();

        queue.add(mikeWilson);

        System.out.println("Print Queue \n");
        queue.printQueue();
    }
}
