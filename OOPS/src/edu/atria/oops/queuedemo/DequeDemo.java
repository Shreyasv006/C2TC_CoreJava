package edu.atria.oops.queuedemo;

import java.util.*;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> que=new LinkedList<>();
		que.addFirst(4);
		que.offerFirst(3);
		que.addFirst(2);
		que.offerLast(1);
		que.addLast(4);
		que.offerLast(3);
		que.addLast(2);
		que.offerFirst(1);
		
		System.out.println(que);
		System.out.println(que.removeFirst());
		System.out.println(que);
		System.out.println(que.peekFirst());
		System.out.println(que.pollLast());
		System.out.println(que);
		


	}

}
