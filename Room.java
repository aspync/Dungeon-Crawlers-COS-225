class Room{
  private String description;
  private String environment;
  private Boolean bossRoom;
  //get key check

  public Entity Monster = null;
  //public Item key = null;

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
      description = "You are at the start";
    }
    else if(environment.equals("end")){
      description = "You have reached the end";
    }
    else if(environment.equals("Sphinx")){
      description = "";
      Monster = new Sphinx();
    }
    else{
      description = "Invalid Room Type";
    }
  }


  String getDesc(){
    return description;
  }

  String getEnvironment(){
    return environment;
  }

  @Override
public String toString() {
    return description;
}

}
