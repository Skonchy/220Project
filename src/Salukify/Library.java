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
		Scanner input = new Scanner(System.in);
		int i = 0;
		this.root.getChildren();
		while(!currentNode.children.isEmpty()) {
			System.out.println("Where would you like to go?");
		//INPUT
			while(input.next().toUpperCase() != currentNode.children.elementAt(i).getLabel().toUpperCase()) {
				i++;
			}
			if(input.next().toUpperCase() == currentNode.children.elementAt(i).getLabel().toUpperCase()) {
				currentNode = currentNode.children.elementAt(i);
			}
			System.out.println(currentNode.getLabel() + " has no children.");
		}
		input.close();
	}//end explore
	
	public void add(String label) {
		Scanner input = new Scanner(System.in);
		Node currentNode = this.root;
		int i = 0;
		System.out.println("What genre is the song you wish to add?");
		String genre = input.next();
		if(currentNode.children.isEmpty()) {
			this.addChild(new Node(genre));
		}
		while(i < currentNode.children.size() - 1) {
			if(genre == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else if(genre != currentNode.children.elementAt(i).getLabel()){
				i++;
			}
		}
		if(genre != currentNode.children.elementAt(i).getLabel()) {
			this.addChild(new Node(input.next()));
		}
		i = 0;
		System.out.println("Who is the artist?");
		String artist = input.next();
		if(currentNode.children.isEmpty()) {
			this.addChild(new Node(artist));
		}
		while(i < currentNode.children.size()) {
			if(artist == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else if(artist != currentNode.children.elementAt(i).getLabel()){
				i++;
			}
		}
		if(artist != currentNode.children.elementAt(i).getLabel()) {
			this.addChild(new Node(artist));
		}
	}

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
			
			public void getChildren() {
				if(!children.isEmpty()) {
					for(int i = 0; i < this.children.size(); i++) {
						System.out.println(this.children.elementAt(i).getLabel());;
					}
				}
				if(children.isEmpty()) {
					System.out.println("This node has no children");
				}
			}//end getChildren
			
			public Node getParent(Node node) {
				return node.parent;
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
