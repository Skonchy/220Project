package Salukify;
import java.util.Vector;

public class Queue<T> {
	private Vector<T> queue;
	public Queue() {
		queue = new Vector<T>();
	}
	public Queue(int initialCapacity) {
		queue = new Vector<T>(initialCapacity);
	}
	
	public T getFront() {
		T front =null;
		if(!isEmpty()) 
			front = queue.get(0);
		return front;
	}
	
	public void enqueue(T newEntry) {
		queue.add(newEntry);
	}
	public T dequeue() {
		T front =null;
		if (!isEmpty())
			front = queue.remove(0);
		return front;
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}

}
