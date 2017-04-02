package decorator;

import strategy.check.MapLimitCheck;
import strategy.unit.Unit;

public class SuperMove extends AbilityDecorator {
	Unit unit;
	
	public SuperMove(Unit unit) {
		super();
		this.unit = unit;
		System.out.println(unit.getType()+ "��(��) �̵��� ������ �߽��ϴ�");
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void fight(){
		unit.fight();
	}
	
	public void move2(int locX, int locY){
		System.out.println("("+locX+","+locY+")"+"���� ���� �̵��� �մϴ�.");
		System.out.println("���� ü����: "+unit.getHealth());
		System.out.println("���� ��ġ��: ("+unit.getLocationX()+","+unit.getLocationY()+")");
		
		System.out.println("-----------------------------");
		
		MapLimitCheck mlc = new MapLimitCheck();
		int x=mlc.check(locX);
		int y=mlc.check(locY);
		if(x!=locX || y!=locY)
			System.out.println("�� �ִ� ũ��� ���� ������ ��ǥ��: ("+locX+","+locY+")"+"�Դϴ�.");
		else
			System.out.println("��ǥ������: ("+locX+","+locY+")"+"�Դϴ�.");
		while(true){
			if((unit.health <1) || ((locX==unit.locationX)&&(locY==unit.locationY))){
				System.out.println("ü���� �����Ͽ� �̵��� �� �����ϴ�.");
				break;
			} 
			
			if(locX < unit.locationX) unit.locationX-=2;
			else if(locX > unit.locationX) unit.locationX+=2;
			else if(locY > unit.locationY) unit.locationY+=2;
			else if(locY < unit.locationY) unit.locationY-=2;
			unit.health -=1;
		}
		
		
//		unit=new Move().moveSuperMove(unit, locX, locY);
		System.out.println("-----------------------------");
		System.out.println("�̵� �� ü����: "+unit.getHealth());
		System.out.println("�̵� �� ��ġ��: ("+unit.locationX+","+unit.locationY+")");
		
//		unit.attack(unit);
	}
//
//
//
//	@Override
//	public String getDescription() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void prepare() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public TeamUnit attack() {
//		// TODO Auto-generated method stub
//		teamUnit.attack();
//		return teamUnit;
//	}



	
}
