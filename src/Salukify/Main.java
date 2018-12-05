package Salukify;


import Salukify.Playlist;
import Salukify.Library;
import Salukify.Library.Node;

import java.util.Scanner;

public class Main {
	static String tempSong;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("Library");
		System.out.println(lib.root.getLabel());
		lib.addChild(new Library.Node("METAL"));
		lib.addChild(new Library.Node("ROCK"));
		
		System.out.println(lib.root);
		System.out.println(((Node) lib.root.getChildren().elementAt(1)).getParent());
		lib.root.printChildren();
		//menu();
		lib.explore();
		

	}
	
	public static void menu() {
		System.out.println("Salukify Menu: ");
		System.out.println("--------------------");
		System.out.println("1) Search for song");
		System.out.println("2) Add a song"); 
		System.out.println("3) Remove a song");
		System.out.println("4) Explore");
		System.out.println("Please enter a number: 0 exits");

		//Needs a scanner for user input!!
		String choice = scan.next();
		while(choice != "0") {
			switch(choice) {
			case "0":
				System.out.println("Thank you for using Salukify");
				System.exit(0);
				break;
			case "1":
				//Search
				System.out.println("What song would you like to search for?");
				//Set user input to tempSong;
				String tempSong = scan.nextLine();
				//Use search method
				//DECISION REQUIRED:  might return path or boolean
				break;
			
			case "2" :
				//Add
				//lib.add()
				/*if(root.children.elementAt(i) == scan,next()) {
					Node currentNode = root.children.elementAt(i)
				}*/
				//ask for all necessary info to step through 
				// adds non-existing nodes to the vector list of that level
				// enter that node
				//  steps down and adds next info until done
				//NOTE: toUpperCase so no repeats?
				
				break;
			case "3":
				//Remove
				System.out.println("What song would you like to remove from the library?");
				//User input set to tempSong; --This should be taken care of in the nesting
				//search for existence of song Note: use search method?
				//remove the song
				//remove(search(scan.next()));
				
				break;
			case "4":
				//Exploring
				//Basically lib.root.getChildren();
				break;
				
			}
		}
	}

}
