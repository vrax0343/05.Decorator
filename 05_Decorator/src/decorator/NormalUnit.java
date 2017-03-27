package decorator;

import behavior.attack.AttackBehavior;
import behavior.movement.MovementBehavior;
import behavior.weapon.WeaponBehavior;
import decorator.function.Fight;

public abstract class NormalUnit {
	public String description = "Unknown Unit";
	public int health,locationX,locationY=0;
	public String type="";
	
	public AttackBehavior attack = null;
	public MovementBehavior movement = null;
	public WeaponBehavior weapon=null;
	
	Fight fight = new Fight();
	
	public String getDescription() {
		return description;
	}
	
	public void attack(){
		new Fight().fightOnce(this);
		System.out.println("hi");
	}
	
	public void move(int x, int y){
		
	}

 

}
