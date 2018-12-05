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
		lib.addChild(new Library.Node("POP"));
		lib.addChild(new Library.Node("RAP"));
		lib.addChild(new Library.Node("Indie"));
		lib.root.getChildren().get(0).addChild(new Library.Node("Beartooth"));
		lib.root.getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Aggressive"));
		lib.root.getChildren().get(0).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Aggressive"));
		lib.root.getChildren().get(0).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Hated"));
		lib.root.getChildren().get(0).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Loser"));
		
		lib.root.getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Disgusting"));
		lib.root.getChildren().get(0).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("The Lines"));
		lib.root.getChildren().get(0).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Beaten in Lips"));
		lib.root.getChildren().get(0).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Body Bag"));
		
		lib.root.getChildren().get(0).addChild(new Library.Node("Metallica"));
		lib.root.getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Master of Puppets"));
		lib.root.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Battery"));
		lib.root.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Master of Puppets"));
		lib.root.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("The Thing That Should Not Be"));
		
		lib.root.getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Metallica"));
		lib.root.getChildren().get(0).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Enter Sandman"));
		lib.root.getChildren().get(0).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Sad but True"));
		lib.root.getChildren().get(0).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("The Unforgiven"));
		
		lib.root.getChildren().get(1).addChild(new Library.Node("Queen"));
		lib.root.getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Queen"));
		lib.root.getChildren().get(1).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Keep Yourself Alive"));
		lib.root.getChildren().get(1).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Doing Alright"));
		lib.root.getChildren().get(1).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Liar"));
	
		lib.root.getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Queen II"));
		lib.root.getChildren().get(1).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Procession"));
		lib.root.getChildren().get(1).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Father to Son"));
		lib.root.getChildren().get(1).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Seven Seas of Rhye"));
		
		lib.root.getChildren().get(1).addChild(new Library.Node("Guns N Roses"));
		lib.root.getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Appetite for Destruction"));
		lib.root.getChildren().get(1).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Welcome to the Jungle"));
		lib.root.getChildren().get(1).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Paradise City"));
		lib.root.getChildren().get(1).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Sweet Child O' Mine"));
	
		lib.root.getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Use Your Illusion II"));
		lib.root.getChildren().get(1).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Civil War"));
		lib.root.getChildren().get(1).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Knockin' on Heaven's Door"));
		lib.root.getChildren().get(1).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Estranged"));
		
		lib.root.getChildren().get(2).addChild(new Library.Node("Beyonce"));
		lib.root.getChildren().get(2).getChildren().get(0).addChild(new Library.Node("Dangerously in Love"));
		lib.root.getChildren().get(2).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Crazy in Love"));
		lib.root.getChildren().get(2).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Me, Myself and I"));
		lib.root.getChildren().get(2).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("The Closer I Get to You"));
		
		lib.root.getChildren().get(2).getChildren().get(0).addChild(new Library.Node("Lemonade"));
		lib.root.getChildren().get(2).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Pray You Catch Me"));
		lib.root.getChildren().get(2).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Hold Up"));
		lib.root.getChildren().get(2).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Daddy Lessons"));
		
		lib.root.getChildren().get(2).addChild(new Library.Node("Ariana Grande"));
		lib.root.getChildren().get(2).getChildren().get(1).addChild(new Library.Node("Dangerous Woman"));
		lib.root.getChildren().get(2).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Dangerous Woman"));
		lib.root.getChildren().get(2).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Let Me Love You"));
		lib.root.getChildren().get(2).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Bad Decisions"));
		
		lib.root.getChildren().get(2).getChildren().get(1).addChild(new Library.Node("Sweetener"));
		lib.root.getChildren().get(2).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("God is a Woman"));
		lib.root.getChildren().get(2).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Sweetener"));
		lib.root.getChildren().get(2).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Breathin"));
		
		
		lib.root.getChildren().get(3).addChild(new Library.Node("Drake"));
		lib.root.getChildren().get(3).getChildren().get(0).addChild(new Library.Node("Thank Me Later"));
		lib.root.getChildren().get(3).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Fire Works"));
		lib.root.getChildren().get(3).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Over"));
		lib.root.getChildren().get(3).getChildren().get(0).getChildren().get(0).addChild(new Library.Node("Up All Night"));
		
		lib.root.getChildren().get(3).getChildren().get(0).addChild(new Library.Node("Scorpion"));
		lib.root.getChildren().get(3).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Survival"));
		lib.root.getChildren().get(3).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("Nonstop"));
		lib.root.getChildren().get(3).getChildren().get(0).getChildren().get(1).addChild(new Library.Node("God's Plan"));
		
		lib.root.getChildren().get(3).addChild(new Library.Node("Eminem"));
		lib.root.getChildren().get(3).getChildren().get(1).addChild(new Library.Node("Recovery"));
		lib.root.getChildren().get(3).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Won't Back Down"));
		lib.root.getChildren().get(3).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("No Love"));
		lib.root.getChildren().get(3).getChildren().get(1).getChildren().get(0).addChild(new Library.Node("Love the Way You Lie"));
		
		lib.root.getChildren().get(3).getChildren().get(1).addChild(new Library.Node("Kamikaze"));
		lib.root.getChildren().get(3).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Lucky You"));
		lib.root.getChildren().get(3).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Kill Shot"));
		lib.root.getChildren().get(3).getChildren().get(1).getChildren().get(1).addChild(new Library.Node("Kamikaze"));
		
		
		/*System.out.println(lib.root);
		System.out.println(((Node) lib.root.getChildren().elementAt(1)).getParent());
		System.out.println(lib.root.printChildren());
		
		lib.search("metal");
		lib.root.removeChild("metal");*/
		
		String choice = menu();
		while(choice != "5") {
			switch(choice) {
			case "1":
				System.out.println("Please enter the name of the song you want to find. 0 to return.");
					String song = scan.next();
					if(!song.equalsIgnoreCase("0")) {
						if(lib.search(song) != null) {
							System.out.println("The location of your song is " + lib.search(song).getLabel());
						}
						break;
					}
			case "2":
					lib.add();
					break;
			case "3":
				System.out.println("Please navigate to the song through Explore. 0 to return.");
				String rem = scan.nextLine();
				if(!rem.equalsIgnoreCase("0")) {
					//lib.remove(rem);
				}else {
					break;
				}
				break;
			case "4":
				lib.explore();
				break;
			case "5":
				System.exit(0);
			default: 
				System.out.println("Please make a selection within the bounds\n");
				choice=menu();
				break;
			}
			choice = menu();
			}
		System.exit(0);
		}

	
	public static String menu() {
		String selection;
		Scanner input = new Scanner(System.in);
		System.out.println("Salukify Menu: ");
		System.out.println("--------------------");
		System.out.println("1) Search for song");
		System.out.println("2) Add a song"); 
		System.out.println("3) Remove a song");
		System.out.println("4) Explore");
		System.out.println("5) Exit");
		selection = input.next();
		return selection;
		}

}