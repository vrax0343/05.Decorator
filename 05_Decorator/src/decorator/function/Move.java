package decorator.function;

import check.MapLimitCheck;
import decorator.NormalUnit;

public class Move {
	public void moveOnce(NormalUnit tempUnit){
		System.out.print(tempUnit.type + " \t");
		
		tempUnit.weapon.useWeapon(tempUnit.attack);
		System.out.println();
		System.out.println("hi");
	}
	
	public NormalUnit moveSuperMove(NormalUnit unit,int locX, int locY){
		MapLimitCheck mlc = new MapLimitCheck();
		locX=mlc.check(locX);
		locY=mlc.check(locY);
		System.out.println("�� �ִ� ũ��� ���� ������ ��ǥ��: ("+locX+","+locY+")"+"�Դϴ�.");
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
		
		return unit;
	}
	
//	public NormalUnit moveOnce(NormalUnit tempUnit){
//		if (tempUnit.health < 1){ }
//		else{
//			Move move = new Move();
//			move.movee(tempUnit);
//		}
//		
//		return tempUnit;
//	}
}
