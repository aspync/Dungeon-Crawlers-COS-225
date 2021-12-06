class Terrain{
  Terrain []directions;
  private String description;


  Terrain(String d){
    description = d;
    directions = new Terrain[4];
    for(int i = 0; i < 4; i++) directions[i] = null;
  }
  Terrain(){
    description = "A white terrain";
    directions = new Terrain[4];
    for(int i = 0; i < 4; i++) directions[i] = null;
  }
  void createTerrain(int dir, String desc){
    if(directions[dir] != null) return;
    Terrain temp = new Terrain(desc);
    directions[dir] = temp;
    int otherSide = (dir+2)%4;
    temp.directions[otherSide] = this;
  }
  String getDesc(){
    return description;
  }

  lava(int dir){
    description = "The room is entirely filled with lava.";
    if(direction[dir] != null) return;
    Terrain temp = new Terrain(desc);
    direction[dir] = temp;
    int otherSide = (dir+2)%4;
    temp.directions[otherSide] = this;



  }


}
