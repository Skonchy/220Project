package Salukify;
public class Main extends Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("Library");
		System.out.println(lib.root.getLabel());
		lib.root.addChild(new Node("Metal"));
		lib.root.addChild(new Node("Rock"));
		
		lib.root.getChildren();

	}

}
