package Salukify;
import java.util.Vector;

public class Library {
	public Node root;
	
	public Library() {
		root = new Node("Library");
	}
	public Library(String label) {
		root = new Node(label);
	}
		
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
				this.label = data;
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
