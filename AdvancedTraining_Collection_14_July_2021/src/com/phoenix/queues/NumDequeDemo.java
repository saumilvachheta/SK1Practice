package com.phoenix.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Deque<Integer> deq = new LinkedList<Integer>();
		Deque<Integer> deq = new ArrayDeque<Integer>();
		deq.add(100);
		deq.add(100);
		deq.addFirst(150); 
		deq.addFirst(180); 
		deq.addLast(120);
		deq.addLast(130);
		
		System.out.println("Front of deq : " + deq.peek());
		System.out.println("First element of deq : " + deq.peekFirst());
		System.out.println("Last element of deq : " + deq.peekLast());
		
		System.out.println(); 
		
		System.out.println("Polling Element : " + deq.poll());
		System.out.println("Polling First Element : " + deq.pollFirst());
		System.out.println("Polling Last Element : " + deq.pollLast());
	}

}
