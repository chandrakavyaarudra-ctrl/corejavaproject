package com.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo1 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<>();
		
		//offer : Inserts the specified element into this queue if it is possible to do so immediately
		//without violating capacity restrictions. When using a capacity-restricted queue, 
		//this method is generally preferable to add, which can fail to insert 
		//an element only by throwing an exception.
//		q1.offer(1);
//		q1.offer(3);
//		q1.offer(4);
//		q1.offer(2);
//		q1.offer(5);
		System.out.println(q1);
		
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		
//add:Inserts the specified element into this queue if it is possible to do so immediately 
		//without violating capacity restrictions, 
		//returning true upon success and throwing an IllegalStateException 
		//if no space is currently available.
		
		//remove()-> if the queue is empty, but trying to remove the elements from the queue 
		//then will get NoSuchElementException 
		Queue<Integer> q = new LinkedList<>();
		q.add(2);
		q.add(22);
		q.add(10);
		q.add(7);
		q.add(56);
		
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.element());
		System.out.println(q);
		
	}

}
