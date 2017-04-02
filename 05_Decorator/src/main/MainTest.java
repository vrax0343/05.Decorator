package main;

import decorator.SuperAttack;
import decorator.SuperMove;
import factory.af.unit.TeamUnit;
import factory.fm.*;
import observer.function.FindUnit;
import singleton.unit.SingletonUnit;
import strategy.unit.Citizen;
import strategy.unit.Knight;
import strategy.unit.Mage;
import strategy.unit.Unit;


public class MainTest {
	
	public static void main(String[] args){		
		
		
		
		System.out.println("=======================================================");
		System.out.println("1. û��, ����, �߸������� �������� �����Ѵ�.");
		System.out.println("=======================================================");
		
		SingletonUnit singletonUnit = SingletonUnit.getInstance();
		singletonUnit.addUnit(new Citizen());
		singletonUnit.addUnit(new Knight());
		singletonUnit.addUnit(new Mage());
		
		System.out.println();
		
		factory.af.TeamFactoryStore btf = new factory.af.BlueTeamFactory();
		factory.af.TeamFactoryStore rtf = new factory.af.RedTeamFactory();
		Unit bu,ru= null;
		
		bu = btf.makeUnit("Mage");
		System.out.println(bu);
		bu = btf.makeUnit("Civilian");
		System.out.println(bu);
		Unit buk = btf.makeUnit("Knight");
		System.out.println(buk);

		
		ru = rtf.makeUnit("Mage");
		System.out.println(ru);
		ru = rtf.makeUnit("Civilian");
		System.out.println(ru);
		Unit ruk = rtf.makeUnit("Knight");
		System.out.println(ruk);
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("2. û���� ��簡 ����(������) �ߴ�. ");
		System.out.println("=======================================================");
		buk = new SuperAttack(buk);
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("3. û���� ��簡 �����Ѵ�.");
		System.out.println("=======================================================");
		buk.fight();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("4. ������ ��簡 ����(�̵���) �ߴ�.");
		System.out.println("=======================================================");
		ruk = new SuperMove(ruk);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. ������ ��簡 100, 100���� �̵��Ѵ�.");
		System.out.println("=======================================================");
		ruk.move2(100, 100);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. �߸��� ��簡 ����(������, �̵��� ���)�ߴ�.");
		System.out.println("=======================================================");
		Unit nuk= FindUnit.findOneByType(singletonUnit.getUnitList(), "Knight1");
		
		
		nuk = new SuperMove(nuk);
		nuk = new SuperAttack(nuk);
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("7. �߸��� ��簡 100, 100���� �̵��Ѵ�.");
		System.out.println("=======================================================");
		nuk.move2(100, 100);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("8. �߸��� ��簡 �����Ѵ�.");
		System.out.println("=======================================================");
		nuk.fight();
		System.out.println();

	
	}
}
