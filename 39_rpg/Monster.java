public class Monster{

	public int health = 50;
	public int damage;
	
	
	public Monster(){
	health=100;
	damage=20;
	}
	
	public  boolean isAlive(){
	return (health>0);
	}

	public int getHealth(){
	return health;
	}
			
	public int attack(Protagonist p){
		if (p.getDefense()) {
		p.health -= damage-10;
		return damage-10;
		}
		else {p.health -= damage;
		return damage;
		}
	}
}
