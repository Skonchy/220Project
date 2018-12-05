package Salukify;
import java.util.Vector;
import java.util.Scanner;

public class Library {
	public Node root;
	
	public Library() {
		root = new Node("Library");
	}
	public Library(String label) {
		root = new Node(label);
	}
	
	public void explore() {
		Node currentNode = this.root;
		String where;
		Scanner input = new Scanner(System.in);
		int i = 0;
		currentNode.getChildren();
		if(!currentNode.children.isEmpty()) {
			System.out.println("You are in " + currentNode.getLabel());
			System.out.println(currentNode.getLabel() + " has children " + currentNode.printChildren());
			System.out.println("Where would you like to go?");
			where = input.next();
			while(where.toUpperCase() != currentNode.children.elementAt(i).getLabel().toUpperCase()) {
				i++;
			}
			if(where.toUpperCase() == currentNode.children.elementAt(i).getLabel().toUpperCase()) {
				currentNode = currentNode.children.elementAt(i);
				System.out.println("You are in " + currentNode.getLabel());
			}
			System.out.println(currentNode.getLabel() + " has no children.");
		}
		input.close();
	}//end explore
	
	public void add() {
		Scanner input = new Scanner(System.in);
		Node currentNode = this.root;
		int i = 0;
		String genre;
		System.out.println("What genre is the song you wish to add?");
		genre = input.nextLine().toUpperCase();
		if(currentNode.children.isEmpty()) {
			this.addChild(new Node(genre));
		}
		while(i < currentNode.children.size() - 1) {
			if(genre == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else {
				i++;
			}
			if(genre != currentNode.children.elementAt(i).getLabel()) {
				this.addChild(new Node(genre));
			}
		}
		//Plan set currentNode to the new genre
		currentNode = search(genre);
		
		i = 0;
		System.out.println("Who is the artist?");
		String artist = input.nextLine().toUpperCase();
		if(currentNode.children.isEmpty()) {
			this.addChild(new Node(artist));
		}
		while(i < currentNode.children.size() - 1) {
			if(artist == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else {
				i++;
			}
			if(artist != currentNode.children.elementAt(i).getLabel()) {
				this.addChild(new Node(artist));
			}
		}
		currentNode = search(artist);
		
		i = 0;
		System.out.println("What is the album?");
		String album = input.nextLine().toUpperCase();
		if(currentNode.children.isEmpty()) {
			this.addChild(new Node(album));
		}
		while(i < currentNode.children.size() - 1) {
			if(album == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else {
				i++;
			}
			if(album != currentNode.children.elementAt(i).getLabel()) {
				this.addChild(new Node(album));
			}
		}
		
		currentNode = search(album);
		
		i = 0;
		System.out.println("What is the title of the song");
		String song = input.nextLine().toUpperCase();
		if(currentNode.children.isEmpty()) {
			this.addChild(new Node(song));
		}
		while(i < currentNode.children.size() - 1) {
			if(song == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else {
				i++;
			}
			if(song != currentNode.children.elementAt(i).getLabel()) {
				this.addChild(new Node(song));
			}
		}
		
		input.close();
	}//End add

	public Node search(String label){
		Node result = null;
		if(this.root.getLabel() == label){
			result = root;
		}
		else if(!this.root.children.isEmpty()){
			int i = 0;
			while(this.root.children.elementAt(i).getLabel() != label & i < this.root.children.size()){
				i++;
			}
			result = root.children.elementAt(i);
		}
		return result;
	}//end search

	public void addChild(Node node) {
		boolean dupe = false;
		for(int i = 0; i < this.root.children.size(); i++) {
			if(this.root.children.elementAt(i).getLabel() == node.getLabel()) {
				dupe = true;
			}
		}
		if(dupe == false) {
			this.root.children.add(node);
			node.parent = this.root;
		}
		else {
			System.out.println("This node already exists");
		}
	}//end addChild
		
		public static class Node{
			private Node parent;
			private String label;
			private Vector<Node> children;
			
			public Node(String label) {
				this.parent = null;
				this.label = label;
				this.children = new Vector<Node>();
			}
			
			public void setLabel(String data) {
				this.label = data.toUpperCase();
			}
			public String getLabel() {
				return this.label;
			}
			
			public void addChild(Node node) {
				boolean dupe = false;
				for(int i = 0; i < children.size(); i++) {
					if(children.elementAt(i).getLabel() == node.getLabel()) {
						dupe = true;
					}
				}
				if(dupe == false) {
					children.add(node);
				}
				else {
					System.out.println("This node already exists");
				}
			}//end addChild
			
			public String printChildren() {
				if(!this.children.isEmpty()) {
					for(int i = 0; i < this.children.size() - 1; i++) {
						return this.children.elementAt(i).getLabel();
					}
				}
				return "This node has no children";
			}//end printChildren
			
			public Vector<Node> getChildren() {
				return this.children;
			}
			
			public Node getParent() {
				return this.parent;
			}
			public void setParent(Node node) {
				this.parent = node;
			}
			
			public void remove(Node node) {
				if(parent != null) {
					parent.removeChild(node);
				}
			}//end remove
			
			private void removeChild(Node node) {
				if(children.contains(node)) {
					children.removeElement(node);
				}
			}//end removeChild
			
		}//end Node
	
}
