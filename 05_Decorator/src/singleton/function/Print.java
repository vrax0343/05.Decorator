package singleton.function;

import java.util.ArrayList;
import java.util.Iterator;

import strategy.unit.Unit;

public class Print {
	
	static Unit tempUnit = null;
	static Iterator<Unit> iterator = null;
	public static void printOne(Unit unit){
		tempUnit = unit;
		
		if(unit.getType().equals("Owl")){
			System.out.println("-�û��� �����Դϴ�-");
			System.out.println(
					"["+tempUnit.getType()+" / "+tempUnit.getLocationX()+" / "+tempUnit.getLocationY()+
					" / "+tempUnit.getMovementType()+ " / "+tempUnit.getHealth()+"]"
					);
		}
		else{
			System.out.println("-���� �����Դϴ�-");
			System.out.println(
					"["+tempUnit.getType()+" / "+tempUnit.getLocationX()+" / "+tempUnit.getLocationY()+
					" / "+tempUnit.getAttackType()+" / "+tempUnit.getWeaponType()+" / "+tempUnit.getMovementType()+
					" / "+tempUnit.getHealth()+"]"
					);
		}
		System.out.println();
	}
	
	public static void printListByType(ArrayList<Unit> unitList){
		if(unitList == null || unitList.size() == 0 ){
			System.out.println(">> ���� ����Ʈ�� ����ֽ��ϴ�. <<");
		}else{
			iterator = unitList.iterator();
			System.out.println("-����Ʈ�� ��ϵ� ���� ����Դϴ�-");
			while(iterator.hasNext()){
				tempUnit=iterator.next();
				System.out.println("["+tempUnit.getType()+"]");
			}
		}
		System.out.println();
		
	}
//	ArrayList<SingletonUnit> unitList=null;
//	Iterator<SingletonUnit> iterator = null;
//	public Print(ArrayList<SingletonUnit> unitList){ 
//		iterator = unitList.iterator();
//	}
//	
//	public void printOne(String type){
//		boolean result = false;
//		while(iterator.hasNext()){
//			SingletonUnit tempUnit = iterator.next();
//			String tempType = tempUnit.getType();
//			
//			if(tempType.contains(type)){
//				System.out.println(tempUnit.toString());
//				result=true;
//				return;
//			}
//			
//		}
//		if (result==false)
//			System.out.println("��� ����");
//	}
//	public void printAll() {
//		// TODO Auto-generated method stub
//		int i = 1;
//		while(iterator.hasNext()){
//			SingletonUnit tempUnit = iterator.next();
//			System.out.println("---"+i+"��° ������ " + tempUnit.getType()+"�Դϴ�.---");
//			System.out.print("Type: "+tempUnit.getType() + "\t"+
//					"Health: " + tempUnit.getHealth() + "\t"+
//					"Location X,Y: " + tempUnit.getLocationX()+","+tempUnit.getLocationY()+"\t"+
//					"WeaponType: " + tempUnit.getWeaponType() + "\t"+
//					"MovementType: " + tempUnit.getMovementType() + "\t"+
//					"AttackType: " + tempUnit.getAttackType() + "\n");
//			
//			i++;
//		}
//		if(i==1)
//			System.out.println("���� ������ �������� �ʽ��ϴ�.");
//	}
}
