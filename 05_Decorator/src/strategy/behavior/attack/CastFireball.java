package strategy.behavior.attack;

public class CastFireball implements AttackBehavior {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("���̾� ���� �����մϴ�.");
	}

	@Override
	public String getAttackType() {
		// TODO Auto-generated method stub
		return "CastFireball";
	}
	
	@Override
	public AttackBehavior getAttackType2(String type) {
		// TODO Auto-generated method stub
		return new CastFireball();
	}

}
