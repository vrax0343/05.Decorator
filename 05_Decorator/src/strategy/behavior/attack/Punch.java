package strategy.behavior.attack;

public class Punch implements AttackBehavior {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("�ָ����� �����մϴ�.");
	}

	@Override
	public String getAttackType() {
		// TODO Auto-generated method stub
		return "Punch";
	}
	
	@Override
	public AttackBehavior getAttackType2(String type) {
		// TODO Auto-generated method stub
		return new Punch();
	}

}
