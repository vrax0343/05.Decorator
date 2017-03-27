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
		return "각성공격을 합니다";
	}
	
	public void attack(){
		System.out.println("각성 공격을 합니다.");
		System.out.println("현재 체력은: "+normalUnit.health);
		System.out.println("-----------------------------");
		NormalUnit nu = new Fight().fightSuperAttack(normalUnit);
		System.out.println("-----------------------------");
		System.out.println("공격 후 체력은: "+normalUnit.health);
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
