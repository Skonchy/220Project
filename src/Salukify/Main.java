package Salukify;

import Salukify.Playlist;
import Salukify.Library;

public class Main {
	static String tempSong;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library("Library");
		System.out.println(lib.root.getLabel());
		lib.root.addChild(new Library.Node("METAL"));
		lib.root.addChild(new Library.Node("ROCK"));
		
		//lib.root.getChildren();
		menu();
		

	}
	
	public static void menu() {
		System.out.println("Salukify Menu: ");
		System.out.println("--------------------");
		System.out.println("1) Search for song");
		System.out.println("2) Add a song");
		System.out.println("3) Remove a song");
		System.out.println("4) Expolre");
		System.out.println("Please enter a number: 0 exits");

		//Needs a scanner for user input!!
		
		int choice = -1;
		while(choice != 0) {
			switch(choice) {
			case 0:
				break;
			case 1:
				//Search
				System.out.println("What song would you like to search for?");
				//Set user input to tempSong;
				//Use search method
				//DECISION REQUIRED:  might return path or boolean
				break;
			
			case 2 :
				//Add
				System.out.println("Provide information to add song to library.");
				//ask for all necessary info to step through 
				// adds non-existing nodes to the vector list of that level
				// enter that node
				//  steps down and adds next info until done
				//NOTE: toUpperCase so no repeats?
				
				break;
			case 3:
				//Remove
				System.out.println("What song would you like to remove from the library?");
				//User input set to tempSong;
				//search for existence of song Note: use search method?
				//remove the song
				tempSong= null;
				break;
			case 4:
				//Exploring
				//Basically lib.root.getChildren();
				break;
				
			}
		}
	}

}
