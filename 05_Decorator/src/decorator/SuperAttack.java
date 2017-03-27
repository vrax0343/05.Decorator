package decorator;

import behavior.attack.AttackBehavior;
import decorator.function.Fight;

public class SuperAttack extends AbilityDecorator {
	public SuperAttack(NormalUnit unit){
		this.normalUnit=unit;
		description = "Im Super Attack";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "���������� �մϴ�";
	}
	
	public void attack(){
		System.out.println("���� ������ �մϴ�.");
		System.out.println("���� ü����: "+normalUnit.health);
		System.out.println("-----------------------------");
		NormalUnit nu = new Fight().fightSuperAttack(normalUnit);
		System.out.println("-----------------------------");
		System.out.println("���� �� ü����: "+normalUnit.health);
//		unit.attack(unit);
		normalUnit = nu;
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
//	

//	@Override
//	public void move(int x, int y) {
		// TODO Auto-generated method stub
//		normalUnit.move();
//		this.normalUnit = normalUnit;
		
//	}
}
