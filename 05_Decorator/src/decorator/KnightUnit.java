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
}
