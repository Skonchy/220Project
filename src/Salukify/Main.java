package Salukify;

import Salukify.Playlist;
import Salukify.Library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("Library");
		System.out.println(lib.root.getLabel());
		lib.root.addChild(new Library.Node("Metal"));
		lib.root.addChild(new Library.Node("Rock"));
		
		//lib.root.getChildren();
		
		

	}
	
	public void menu() {
		
	}

}
