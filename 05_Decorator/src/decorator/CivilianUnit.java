package decorator;

import behavior.attack.Punch;
import behavior.movement.Walk;
import behavior.weapon.Fist;

public class CivilianUnit extends NormalUnit {
	public CivilianUnit(){
		health=10;
		type="Civilian";
		
		attack = new Punch();
		movement = new Walk();
		weapon = new Fist();
	}
}
