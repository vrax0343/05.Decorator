package decorator;

import behavior.attack.AttackBehavior;
import behavior.movement.MovementBehavior;
import behavior.weapon.WeaponBehavior;
import decorator.function.Fight;
import function.GenerateRandomPosition;

public abstract class NormalUnit {
	public String description = "Unknown Unit";
	public int health=0;
	public String type="";
	public int locationX,locationY= GenerateRandomPosition.generate();
	
	public AttackBehavior attack = null;
	public MovementBehavior movement = null;
	public WeaponBehavior weapon=null;
	
	Fight fight = new Fight();
	
	public String getDescription() {
		return description;
	}
	
	

	public AttackBehavior getAttack() {
		return attack;
	}

	public void setAttack(AttackBehavior attack) {
		this.attack = attack;
	}

	public MovementBehavior getMovement() {
		return movement;
	}

	public void setMovement(MovementBehavior movement) {
		this.movement = movement;
	}
	
	public abstract void attack();
	public abstract void move(int x, int y);



 

}
