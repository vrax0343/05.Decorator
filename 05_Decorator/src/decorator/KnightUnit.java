package decorator;

import behavior.attack.SwingSword;
import behavior.movement.Walk;
import behavior.weapon.Sword;

public class KnightUnit extends NormalUnit {
	public KnightUnit() {
		type = "Knight";
		health = 30;
		
		attack = new SwingSword();
		movement = new Walk();
		weapon = new Sword();
	}
	public void attack(){ 
		System.out.println("노말 공격");
	}
	public void move(int x, int y){
		System.out.println("노말 이동");
	}
}
