package decorator;

import decorator.function.Fight;
import decorator.function.Move;

public class SuperMove extends NormalUnit {
	NormalUnit unit;
	public SuperMove(NormalUnit unit){
		this.unit=unit;
		description = "Im Super Move";
	}
	
	public void move(int locX, int locY){
		System.out.println("("+locX+","+locY+")"+"으로 각성 이동을 합니다.");
		System.out.println("현재 체력은: "+unit.health);
		System.out.println("현재 위치는: ("+unit.locationX+","+unit.locationY+")");
		
		System.out.println("-----------------------------");
		this.unit=new Move().moveSuperMove(unit, locX, locY);
		System.out.println("-----------------------------");
		System.out.println("이동 후 체력은: "+unit.health);
		System.out.println("이동 후 위치는: ("+unit.locationX+","+unit.locationY+")");
		
//		unit.attack(unit);
	}
	
}
