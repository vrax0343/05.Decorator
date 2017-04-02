package strategy.main;

import strategy.behavior.attack.*;
import strategy.behavior.weapon.*;
import strategy.behavior.movement.*;
import strategy.unit.*;

public class TestDrive {
	
	public static void main(String[] args){		
		Unit citizen	= new Citizen();
		Unit knight		= new Knight();
		Unit mage		= new Mage();
		
		System.out.println("=======================================================");
		System.out.println("1. ���� ���� �� �⺻ ���� ���");
		System.out.println("=======================================================");
		
		System.out.println(citizen.toString());		
		System.out.println(knight.toString());
		System.out.println(mage.toString());
		
		System.out.println("=======================================================");
		System.out.println("2. �ù� +10/-10 �̵� �� ���� ���");
		System.out.println("=======================================================");
		citizen.move(10, -10);
		citizen.fight();
		
		System.out.println("=======================================================");
		System.out.println("3. ��� +30/+40 �̵� �� ���� ���");
		System.out.println("=======================================================");
		knight.move(30, 40);
		knight.fight();
		
		System.out.println("=======================================================");
		System.out.println("4. ������ +30/+40 �̵� �� ���� ���");
		System.out.println("=======================================================");
		mage.move(30, 40);
		mage.fight();
		
		System.out.println("=======================================================");
		System.out.println("5. ��簡 ���� �Ҿ���� �Ǽ����� ���ƿԴ�");
		System.out.println("=======================================================");
		
		knight.setWeapon(new Fist());
		knight.setAttack(new Punch());
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. �ù��� ����� ��ġ�� �̵����");
		System.out.println("=======================================================");
		System.out.print("���� �ù��� ��ġ: ");
		citizen.getLocation();
		System.out.print("���� ����� ��ġ: ");
		knight.getLocation();
		
		System.out.println("---�ù��� �̵��մϴ�---");
		citizen.setLocation(knight.getLocationX(), knight.getLocationY());
		
	
		System.out.println("=======================================================");
		System.out.println("7. �ù��� ���� �ֿ���. ������ ���ݸ��");
		System.out.println("=======================================================");
		
		citizen.setWeapon(new Sword());
		citizen.setAttack(new SwingSword());
		citizen.fight();
		
		System.out.println("=======================================================");
		System.out.println("8. ��� -200, -200 �̵����");
		System.out.println("=======================================================");
		knight.move(-200, -200);
		
		System.out.println("=======================================================");
		System.out.println("9. �� ������ ���� ���");
		System.out.println("=======================================================");
		
		System.out.println(citizen.toString());		
		System.out.println(knight.toString());
		System.out.println(mage.toString());
		
		
	}
}
