package Salukify;
import java.util.Vector;
import java.util.Scanner;
import java.util.Iterator;

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
		int where = 0;
		while(currentNode.children.isEmpty() == false) {
			System.out.println("You are in " + currentNode.getLabel());
			System.out.println(currentNode.getLabel() + " has children :" + currentNode.printChildren());
			System.out.println("Enter the integer you want to go to:  0 exits");
			where = input.nextInt();
			//while(where.toUpperCase() != currentNode.children.elementAt(i).getLabel().toUpperCase() && i < currentNode.children.size()-1) {
				//i++;
			//}
			if(where == 0) {
				return;
			}
			where = where - 1;
				currentNode = currentNode.children.get(where);
		}
		System.out.println("Press 1 to play this song. Press 9 to delete this song.");
		where = input.nextInt();
		if(where == 1) {
			System.out.println("This feature is coming soon!");
		}
		if(where == 9) {
			this.root.remove();
		}
	}//end explore
	
	/*public void add(String label) {
		String genre = "";
		Scanner input = new Scanner(System.in);
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
		
		System.out.println("What is the name of the artist for this song?");
		String artist = input.nextLine().toUpperCase();
		if(currentNode.children.isEmpty() == true){
			currentNode.addChild(new Node(artist));
		}
		currentNode.children.contains(
	}*/
	
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
				currentNode.addChild(new Node(genre));
			}
		}
		//Plan set currentNode to the new genre
		currentNode = search(genre);
		
		i = 0;
		System.out.println("Who is the artist?");
		String artist = input.nextLine().toUpperCase();
		if(currentNode.getChildren().isEmpty()) {
			currentNode.addChild(new Node(artist));
		}
		while(i < currentNode.children.size() - 1) {
			if(artist == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else {
				i++;
			}
			if(artist != currentNode.children.elementAt(i).getLabel()) {
				currentNode.addChild(new Node(artist));
			}
		}
		currentNode = search(artist);
		
		i = 0;
		System.out.println("What is the album?");
		String album = input.nextLine().toUpperCase();
		if(currentNode.children.isEmpty()) {
			currentNode.addChild(new Node(album));
		}
		while(i < currentNode.children.size() - 1) {
			if(album == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else {
				i++;
			}
			if(album != currentNode.children.elementAt(i).getLabel()) {
				currentNode.addChild(new Node(album));
			}
		}
		
		currentNode = search(album);
		
		i = 0;
		System.out.println("What is the title of the song");
		String song = input.nextLine().toUpperCase();
		if(currentNode.children.isEmpty()) {
			currentNode.addChild(new Node(song));
		}
		while(i < currentNode.children.size() - 1) {
			if(song == currentNode.children.elementAt(i).getLabel()) {
				currentNode = currentNode.children.elementAt(i);
			}else {
				i++;
			}
			if(song != currentNode.children.elementAt(i).getLabel()) {
				currentNode.addChild(new Node(song));
			}
		}
		
		input.close();
	}//End add

	/*public Node search(String label){
		Node result = null;
		if(this.root.getLabel() == label){
			result = root;
		}
		else if(!this.root.children.isEmpty()){
			int i = 0;
			while(this.root.children.elementAt(i).getLabel() != label & i < this.root.children.size() - 1){
				i++;
			}
			result = root.children.elementAt(i);
		}
		return result;
	}//end search*/

	public Node search(String label){
		Node result = null;
		Node currentNode = this.root;
		if(currentNode.getLabel().equalsIgnoreCase(label)){
			result = currentNode;
		}
		else if(currentNode.children.isEmpty() == false){
			int i = 0;
			while(currentNode.children.get(i).getLabel().equalsIgnoreCase(label) == false) {
				++i;
				if(i <= currentNode.children.size() - 1) {
					break;
				}
			}
			if(currentNode.getLabel().equalsIgnoreCase(label)){
				result = currentNode;
			}
			i = 0;
			currentNode = currentNode.children.get(i);
			while(currentNode.children.get(i).getLabel().equalsIgnoreCase(label) == false) {
				++i;
				if(i <= currentNode.children.size() - 1) {
					break;
				}
			}
			if(currentNode.getLabel().equalsIgnoreCase(label)){
				result = currentNode;
			}
			i = 0;
			currentNode = currentNode.children.get(i);
			while(currentNode.children.get(i).getLabel().equalsIgnoreCase(label) == false) {
				++i;
				if(i <= currentNode.children.size() - 1) {
					break;
				}
			}
			if(currentNode.getLabel().equalsIgnoreCase(label)){
				result = currentNode;
			}
			i = 0;
			currentNode = currentNode.children.get(i);
			while(currentNode.children.get(i).getLabel().equalsIgnoreCase(label) == false) {
				++i;
				if(i <= currentNode.children.size() - 1) {
					break;
				}
			}
			if(currentNode.getLabel().equalsIgnoreCase(label)){
				result = currentNode;
			}
		}
		if(result == null) {
			System.out.println("The song you searched for is not in the Library");
		}
		return result;
	}//end search*/

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
		
		public static class Node implements Iterator{
			private Node parent;
			private String label; 
			private int position = 0;
			private Vector<Node> children;
			
			public Node(String label) {
				this.parent = null;
				this.label = label.toUpperCase();
				this.children = new Vector<Node>();
			}
			
			public void setLabel(String data) {
				this.label = data.toUpperCase();
			}
			public String getLabel() {
				return this.label;
			}
			public void setParent(Node child) {
				child.parent = this;
			}
			
			public void addChild(Node node) {
				boolean dupe = false;
				for(int i = 0; i < this.children.size(); i++) {
					if(this.children.get(i).getLabel().equalsIgnoreCase(node.getLabel())) {
						dupe = true;
					}
				}
				if(dupe == false) {
					this.setParent(node);
					this.children.add(node);
				}
				else {
					System.out.println("This node already exists");
				}
			}//end addChild
			
			public String printChildren() {
				String result = "\n";
				if(this.children.isEmpty() == false) {
					for(int i = 0; i <= this.children.size() - 1; i++) {
						result = result + this.children.get(i).getLabel() + " \n";
					}
				}
				else {
					result = result + "This node has no children.";
				}
				return result;
			}//end printChildren
			
			public Node getFirstChild() {
				return (Node) this.getChildren().get(0);
			}
			
			
			public Vector<Node> getChildren() {
				return this.children;
			}
			
			public Node getParent() {
				return this.parent;
			}
			
			public void remove() {
				this.label = null;
				this.children = null;
				System.out.println("Song removed!");
			}//end remove
			
			private void removeChild(String label) {
				if(this.hasChildren()) {
					int i=0;
					while(((Node) this.getChildren().get(i)).getLabel() != label) {
						i++;
					}
					
				}
			}//end removeChild
			
			public boolean hasChildren() {
				return this.getChildren().isEmpty();
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				boolean result = false;
				if(position < this.getChildren().size()) {
					result = true;
				}
				return result;
			}

			@Override
			public Node next() {
				// TODO Auto-generated method stub
				Node result = null;
				if(this.hasNext()) {
					result = (Node) this.getChildren().get(position++);
				}
				return result;
			}
			
		}//end Node
}
