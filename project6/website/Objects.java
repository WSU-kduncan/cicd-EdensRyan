import java.util.*;
class Room extends Object {

  private String description;
  private Boolean key;
  private Boolean explored;
  private Room north;
  private Room south;
  private Room east;
  private Room west;
  private Room up;
  private Room down;
  private String inspect;
  private String inspectResult;
  private String retrieve;
    

public Room (String description, Boolean key, Boolean explored, Room north, Room east, Room south, Room west, Room up, Room down, String inspect, String inspectResult, String retrieve) {       
        this.description = (String) description;
        this.key = (Boolean) key;
        this.explored = (Boolean) explored;
        this.north = (Room) north;  
        this.east = (Room) east;
        this.south = (Room) south;
        this.west = (Room) west;
        this.up = (Room) up;
        this.down = (Room) down;
        this.inspect = (String) inspect;
        this.inspectResult = (String) inspectResult;
        this.retrieve = (String) retrieve; 
        }

        /*Getters*/
 public String getDescription() { 
        return description;
        }

 public Boolean getKey() { 
        return key;
        }

 public Boolean getExplored() { 
        return explored;
        }

 public Room getNorth() { 
        return north;
        }

 public Room getEast() { 
        return east;
        }

 public Room getSouth() { 
        return south;
        }

 public Room getWest() { 
        return west;
        }

 public Room getUp() { 
        return up;
        }

 public Room getDown() { 
        return down;
        }

  public String getInspect() { 
        return inspect;
        }

 public String getInspectResult() { 
        return inspectResult;
        }

 public String getRetrieve() { 
        return retrieve;
        }
/*Setters*/

 public void setExplored(Boolean explored) {
        this.explored = (Boolean) explored;
        }

public void setNorth(Room north) { 
      this.north = (Room) north;
      } 

public void setEast(Room east) { 
      this.east = (Room) east;
      } 

public void setSouth(Room south) { 
      this.south = (Room) south;
      } 

public void setWest(Room west) { 
      this.west = (Room) west;
      } 

public void setUp(Room up) { 
      this.up = (Room) up;
      } 

public void setDown(Room down) { 
      this.down = (Room) down;
      }      

public void setRetrieve(String retrieve) {
      this.retrieve = (String) retrieve;
}

public String toString(){
  String desc = description;
  return desc;
  }
} 

