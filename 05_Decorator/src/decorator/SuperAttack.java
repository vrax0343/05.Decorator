package decorator;

import strategy.unit.Unit;

public class SuperAttack extends AbilityDecorator {
	Unit unit;
	public SuperAttack(Unit unit){
		this.unit=unit;
		System.out.println(unit.getType()+ "��(��) ������ ������ �߽��ϴ�");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "���������� �մϴ�";
	}
	
	
	
	public void fight(){
		int tempHealth = unit.getHealth();
		System.out.println("���� ������ �մϴ�.");
		if(tempHealth <= 0){
			System.out.println("!! ü���� �����Ͽ� ������ ������ �� �����ϴ�. !!");
			System.out.println(unit.getType());
		}else{
		
			System.out.println("���� ü����: "+tempHealth);
			System.out.println("-----------------------------");
			unit.fight();
			unit.fight();
			unit.setHealth(tempHealth-1);
	//		new Fight().fightSuperAttack(teamUnit);
			System.out.println("-----------------------------");
			System.out.println("���� �� ü����: "+unit.getHealth());
	//		return teamUnit;
		}
	}
	
	public void move2(int locX, int locY){
		unit.move2(locX, locY);
	}
//
//	@Override
//	public void prepare() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	public void move(int x, int y){
//		teamUnit.move(x, y);
//	}

}
