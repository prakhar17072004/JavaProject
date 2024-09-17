package composition;

public class Engine {
  int hp;
  public void start() {
	  System.out.println("Start the engine");
  }
  Engine(){
	  System.out.println("no argumentt cosntructo of engine");
  }
  Engine(int hp){
	  this.hp=hp;
  }
}
