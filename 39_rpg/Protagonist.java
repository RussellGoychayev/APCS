public class Protagonist{
	private String name;
	public int health = 1;
	public int damage;
	public boolean defense;
	
	
	public Protagonist(String name){
		this.name = name;
	}
	public boolean isAlive(){
	return (health>0);
	}
	
	public  void specialize(){
	damage=20;
	health= 100;
	defense=false;
	}
	public  void normalize(){
	damage=10;
	health=100;
	defense=true;
	}
	
	public boolean getDefense(){
	return defense;
	}
	
	public int getHealth(){
	return health;
	}
	public int attack(Monster m){
		m.health -= damage;
		return damage;
	}
	public String getName(){
		return name;
	}
}	
