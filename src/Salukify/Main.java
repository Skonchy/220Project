package Salukify;


import Salukify.Playlist;
import Salukify.Library;
import Salukify.Library.Node;

import java.util.Scanner;

public class Main {
	static String tempSong;
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		Library lib = new Library("Library");
		System.out.println(lib.root.getLabel());
		lib.addChild(new Library.Node("METAL"));
		lib.addChild(new Library.Node("ROCK"));
		
		/*lib.add("test song");
		lib.add("2nd test song");
		
		System.out.println(lib.root);
		System.out.println(((Node) lib.root.getChildren().elementAt(1)).getParent());
		System.out.println(lib.root.printChildren());
		
		lib.search("metal");
		lib.root.removeChild("metal");*/
		
		int choice = menu();
		while(choice != 0) {
			switch(choice) {
			case 1:
				System.out.println("Please enter the name of the song you want to find. 0 to exit.");
					String song = scan.next();
					if(!song.equalsIgnoreCase("0")) {
						lib.search(song);
					}else {
						System.exit(0);
					}
			case 2:
				System.out.println("Adding to Library..");
					lib.add();
					
				break;
			case 3:
				System.out.println("Please enter the name of the song you would like to remove from the Library. 0 to exit.");
				String rem = scan.nextLine();
				if(!rem.equalsIgnoreCase("0")) {
					//lib.remove(rem);
				}else {
					System.exit(0);
				}
				break;
			case 4:
				lib.explore();
				break;
			default: 
				System.out.println("Please make a selection within the bounds");
				break;
			}
			
		}
		System.exit(0);
		 scan.close();
	}
	
	public static int menu() {
		int selection;
		Scanner input = new Scanner(System.in);
		System.out.println("Salukify Menu: ");
		System.out.println("--------------------");
		System.out.println("1) Search for song");
		System.out.println("2) Add a song"); 
		System.out.println("3) Remove a song");
		System.out.println("4) Explore");
		System.out.println("0) Exit");
		selection = input.nextInt();
		return selection;
		}

}
