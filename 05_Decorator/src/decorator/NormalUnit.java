package decorator;

import behavior.attack.AttackBehavior;
import behavior.movement.MovementBehavior;
import behavior.weapon.WeaponBehavior;
import decorator.function.Fight;
import function.GenerateRandomPosition;
import function.Move;

public abstract class NormalUnit {
	public String description = "Unknown Unit";
	public int health=0;
	public String type="";
	public int locationX,locationY= GenerateRandomPosition.generate();
	
	public AttackBehavior attack = null;
	public MovementBehavior movement = null;
	public WeaponBehavior weapon=null;
	
	Fight fight = new Fight();
	
	public abstract void attack();
//	public abstract void move(int x, int y);
	
	public void move(int x,int y){
		new decorator.function.Move().moveOnce(this, x, y);
	}
	
	public int getLocationX() {
		return locationX;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public int getLocationY() {
		return locationY;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	
	



 

}
