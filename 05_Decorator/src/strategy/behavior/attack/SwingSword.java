package strategy.behavior.attack;

public class SwingSword implements AttackBehavior {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("������ �����մϴ�.");
	}

	@Override
	public String getAttackType() {
		// TODO Auto-generated method stub
		return "SwingSword";
	}

	
	@Override
	public AttackBehavior getAttackType2(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Sword")){
			
		}
		return new SwingSword();
	}
	
}
