package factory.af;

import behavior.attack.CantAttack;
import behavior.attack.CastFireball;
import behavior.attack.Punch;
import behavior.attack.SwingSword;
import behavior.movement.Fly;
import behavior.movement.Teleport;
import behavior.movement.Walk;
import behavior.weapon.Fist;
import behavior.weapon.NoWeapon;
import behavior.weapon.Staff;
import behavior.weapon.Sword;
import factory.af.unit.TeamUnit;
import function.GenerateRandomPosition;

public abstract class TeamFactoryStore {
	
	public abstract TeamUnit createTeamUnit(String type);
	
	public TeamUnit makeUnit(String type) {
//		TeamUnit teamUnit = toString(type);
		TeamUnit tempUnit = createTeamUnit(type);
		System.out.println("--- Making a " + tempUnit.getName() + " ---");
		tempUnit.prepare();
		tempUnit.print();
//		tempUnit.createTeamInfo();
//		
//		System.out.println("--- Making a "+team+"team\t"+type+" Unit ---");
//		if(type.equals("Citizen")){ 
//			tempUnit=new TeamUnit(new Punch(), new Walk(), new Fist(),
//					"Citizen"+unitCount[CITIZEN], GenerateRandomPosition.generate(), GenerateRandomPosition.generate(),10);
//			unitCount[CITIZEN]+=1;
//		}else if(type.equals("Knight")){
//			tempUnit=new TeamUnit(new SwingSword(), new Walk(), new Sword(),
//					"Knight"+unitCount[KNIGHT], GenerateRandomPosition.generate(), GenerateRandomPosition.generate(),30);
//			unitCount[KNIGHT]+=1;
//		}else if(type.equals("Mage")){
//			tempUnit=new TeamUnit(new CastFireball(), new Teleport(), new Staff(),
//					"Mage"+unitCount[MAGE], GenerateRandomPosition.generate(), GenerateRandomPosition.generate(),20);
//			unitCount[MAGE]+=1;
//		}else if(type.equals("Owl")){
//			tempUnit=new TeamUnit(new CantAttack(), new Fly(), new NoWeapon(),
//					"Owl", GenerateRandomPosition.generate(), GenerateRandomPosition.generate(),null);
//		}else{
//			System.out.println("Error");
//		}
//		
//		
//		pizza.prepare();
//		pizza.bake();
//		pizza.cut();
//		pizza.box();
//		return pizza;
		
		return tempUnit; 
	}
}
