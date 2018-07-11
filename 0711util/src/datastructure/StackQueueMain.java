package datastructure;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		//Stack - LIFO
		Stack <String> stack = new Stack<>();
		stack.push("C");
		stack.push("C++");
		stack.push("Python");
		stack.push("Java");
		//데이터가 역순으로 리턴됩니다. - 제거되면서 리턴
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//우선순위 큐 만들기 - 저장 순이 아닌 크기순으로 리턴
		PriorityQueue <String>	queue =
				new PriorityQueue<>();
		queue.add("Oracle");
		queue.add("MySQL");
		queue.add("MSSQL");
		queue.add("Mongo DB");
		queue.add("Casndra");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
