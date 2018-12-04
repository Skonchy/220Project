package Salukify;
import java.util.Vector;

public class Playlist<T> {
	private Vector<T> queue;
	public Playlist() {
		queue = new Vector<T>();
	}
	public Playlist(int initialCapacity) {
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
