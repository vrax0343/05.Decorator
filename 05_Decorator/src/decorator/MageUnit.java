package decorator;

import behavior.attack.CastFireball;
import behavior.movement.Teleport;
import behavior.weapon.Staff;

public class MageUnit extends NormalUnit {
	public MageUnit(){
		health=20;
		type="Mage";
		
		attack = new CastFireball();
		movement = new Teleport();
		weapon = new Staff();
	}
	public void attack(){ 
		System.out.println("노말 공격");
	}
	public void move(){
		System.out.println("노말 이동");
	}
}
