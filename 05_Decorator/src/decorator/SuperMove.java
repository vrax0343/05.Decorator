package decorator;

import decorator.function.Fight;
import decorator.function.Move;

public class SuperMove extends AbilityDecorator {
	public SuperMove(NormalUnit unit){
		this.normalUnit=unit;
		description = "Im Super Move";
	}
	
	
	
	public void move(NormalUnit normalUnit, int locX, int locY){
		System.out.println("("+locX+","+locY+")"+"���� ���� �̵��� �մϴ�.");
		System.out.println("���� ü����: "+this.normalUnit.health);
		System.out.println("���� ��ġ��: ("+normalUnit.locationX+","+normalUnit.locationY+")");
		
		System.out.println("-----------------------------");
		this.normalUnit=new Move().moveSuperMove(normalUnit, locX, locY);
		System.out.println("-----------------------------");
		System.out.println("�̵� �� ü����: "+normalUnit.health);
		System.out.println("�̵� �� ��ġ��: ("+normalUnit.locationX+","+normalUnit.locationY+")");
		
//		unit.attack(unit);
	}
	public void move(int locX, int locY){
		System.out.println("("+locX+","+locY+")"+"���� ���� �̵��� �մϴ�.");
		System.out.println("���� ü����: "+normalUnit.health);
		System.out.println("���� ��ġ��: ("+normalUnit.locationX+","+normalUnit.locationY+")");
		
		System.out.println("-----------------------------");
		normalUnit=new Move().moveSuperMove(normalUnit, locX, locY);
		System.out.println("-----------------------------");
		System.out.println("�̵� �� ü����: "+normalUnit.health);
		System.out.println("�̵� �� ��ġ��: ("+normalUnit.locationX+","+normalUnit.locationY+")");
		
//		unit.attack(unit);
	}



	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void attack() {
		// TODO Auto-generated method stub
		normalUnit.attack();
	}



	
}
