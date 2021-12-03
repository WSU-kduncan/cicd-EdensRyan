//import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Boolean quit = false;

// Create the room objects. Each exit begins as null to avoid refrencing a room that doesn't exist.

    Room entrance = new Room ("A grassy room with a simple path running through it. A budda statue sits off to the side. To the south the path seems to end at a giant bell. There is a door to the NORTH.", false, false, null, null, null, null, null, null, "inspect bell", "As you look closer at the bell you realize that there is a secret door behind it leading to the SOUTH.", "help"); 

    Room elevator1 = new Room ("A simple elevator. The display indicates it is connected only to this floor and the floor above.", false, false, null, null, null, null, null, null, "nothing", "You closely examine the nothing and see within it... everything.", "help"); 

     Room elevator1Up = new Room ("A simple elevator. The display indicates it is connected only to this floor and the floor below.", false, false, null, null, null, null, null, null, "nothing", "You closely examine the nothing and see within it... everything.", "help"); 

    Room room2 = new Room ("I don't know I just needed to put something real quick", false, false, null, null, entrance, null, null, null, "nothing", "You closely examine the nothing and see within it... everything.", "help");

  entrance.setNorth(room2);
  entrance.setSouth(elevator1);
  elevator1.setUp(elevator1Up);
  elevator1Up.setDown(elevator1);
  room2.setSouth(entrance);

  Room player = entrance;

  System.out.println(player);
  
  while (quit == false){
      String userCommand = in.nextLine(); 
      if (userCommand == "North" && player.getNorth() != null){
       player = player.getNorth();
       System.out.println(player);
       System.out.println("I love my wife");
      }
      else if(userCommand == "Quit"){
        quit = true;
        System.out.println("Shutting down");
      }
  }
     
} 
}
