class Room{
  Room []directions;
  private String description;
  private String environment;
  private Boolean bossRoom;
  //get key check



  Room(String e){
    environment = e;
    if(environment.equals("lava")){
      description = "The room is filled with lava";
    }
    else if(environment.equals("tundra")){
      description = "The cold rages on in the Tundra";
    }
    else if(environment.equals("desert")){
      description = "Sand surrounds you, no water in sight in the Desert";
    }
    else if(environment.equals("swamp")){
      description = "The swamp smells particularly bad";
    }
    else if(environment.equals("clouds")){
      description = "Up in the air, in the Clouds";
    }
    else if(environment.equals("forest")){
      description = "Trees surround you, its hard to tell where you are headed";
    }
    else if(environment.equals("wall")){
      description = "A wall stands in your way";
      //Figure out how to auto send backwards
    }
    else if(environment.equals("tunnel")){
      description = "This hallway is quite dark.. wait no.. it's a tunnel";
    }
    else if(environment.equals("stone")){
      description = "Stepping stones lead into the darkness..";
    }
    else if(environment.equals("Gate")){
      description = "A large gate stands before you";
    }
    else if(environment.equals("start")){
      description = "You started here";
    }
    else if(environment.equals("end")){
      description = "You have reached the end";
    }
    else{
      description = "Invalid Room Type";
    }
    directions = new Room[4];
    for(int i = 0; i < 4; i++) directions[i] = null;
  }

  Room(){
    description = "Blank room";
    directions = new Room[4];
    for(int i = 0; i < 4; i++) directions[i] = null;
  }

  void createRoom(int dir, String enviro){
    if(directions[dir] != null) return;
    Room temp = new Room(enviro);
    directions[dir] = temp;
    int otherSide = (dir+2)%4;
    temp.directions[otherSide] = this;
  }

  void createBossRoom(int dir, String enviro, Boolean boss){
    if(directions[dir] != null) return;
    Room temp = new Room(enviro);
    directions[dir] = temp;
    int otherSide = (dir+2)%4;
    temp.directions[otherSide] = this;

    //How to represent the boss is

  }


  String getDesc(){
    return description;
  }

  String getEnvironment(){
    return environment;
  }

  Boolean getBoss(){
    return bossRoom;
  }

  @Override
public String toString() {
    return description;
}

}
