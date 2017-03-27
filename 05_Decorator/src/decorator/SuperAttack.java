package decorator;

import decorator.function.Fight;

public class SuperAttack extends AbilityDecorator {
	NormalUnit unit;
	public SuperAttack(NormalUnit unit){
		this.unit=unit;
		description = "Im Super Attack";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return ""+unit.health;
	}
	
	public void attack(){
		System.out.println("���� ������ �մϴ�.");
		System.out.println("���� ü����: "+unit.health);
		System.out.println("-----------------------------");
		new Fight().fightSuperAttack(unit);
		System.out.println("-----------------------------");
		System.out.println("���� �� ü����: "+unit.health);
		
//		unit.attack(unit);
	}
	
}
