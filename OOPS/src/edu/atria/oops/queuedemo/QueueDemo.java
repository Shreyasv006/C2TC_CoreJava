package edu.atria.oops.queuedemo;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> que=new LinkedList<>();
		que.add(4);
		que.offer(3);
		que.add(2);
		que.offer(1);
		
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que);
		

	}

}
