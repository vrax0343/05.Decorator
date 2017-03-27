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
		System.out.println("("+locX+","+locY+")"+"���� ���� �̵��� �մϴ�.");
		System.out.println("���� ü����: "+unit.health);
		System.out.println("���� ��ġ��: ("+unit.locationX+","+unit.locationY+")");
		
		System.out.println("-----------------------------");
		this.unit=new Move().moveSuperMove(unit, locX, locY);
		System.out.println("-----------------------------");
		System.out.println("�̵� �� ü����: "+unit.health);
		System.out.println("�̵� �� ��ġ��: ("+unit.locationX+","+unit.locationY+")");
		
//		unit.attack(unit);
	}
	
}
