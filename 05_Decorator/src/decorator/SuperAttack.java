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
		System.out.println("각성 공격을 합니다.");
		System.out.println("현재 체력은: "+unit.health);
		System.out.println("-----------------------------");
		new Fight().fightSuperAttack(unit);
		System.out.println("-----------------------------");
		System.out.println("공격 후 체력은: "+unit.health);
		
//		unit.attack(unit);
	}
	
}
