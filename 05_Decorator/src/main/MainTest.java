package main;

import factory.fm.*;
import observer.function.FindUnit;
import singleton.function.Print;
import singleton.unit.SingletonUnit;
import strategy.unit.Citizen;
import strategy.unit.Knight;
import strategy.unit.Mage;
import strategy.unit.Unit;


public class MainTest {
	
	public static void main(String[] args){		
		
		
		
		System.out.println("=======================================================");
		System.out.println("1. �߸� ���� �������� �����Ѵ�. (�⺻ �������)");
		System.out.println("=======================================================");
		
		
		SingletonUnit singletonUnit = SingletonUnit.getInstance();
		singletonUnit.addUnit(new Citizen());
		singletonUnit.addUnit(new Knight());
		singletonUnit.addUnit(new Mage());
		
		System.out.println();
		
		factory.af.TeamFactoryStore btf = new factory.af.BlueTeamFactory();
		factory.af.TeamFactoryStore rtf = new factory.af.RedTeamFactory();
		Unit bu,ru= null;
		
		
		System.out.println("=======================================================");
		System.out.println("2. �߻� ���丮������ �̿��Ͽ� û�������� �������� �����Ѵ�. (�⺻ �������)");
		System.out.println("=======================================================");
		
		
		bu = btf.makeUnit("Mage");
		System.out.println(bu);
		bu = btf.makeUnit("Civilian");
		System.out.println(bu);
		bu = btf.makeUnit("Knight");
		System.out.println(bu);

		
		System.out.println("=======================================================");
		System.out.println("3. �߻� ���丮������ �̿��Ͽ� ���������� �������� �����Ѵ�. (�⺻ �������)");
		System.out.println("=======================================================");
		
		ru = rtf.makeUnit("Mage");
		System.out.println(ru);
		ru = rtf.makeUnit("Civilian");
		System.out.println(ru);
		ru = rtf.makeUnit("Knight");
		System.out.println(ru);
		System.out.println();
		
		
		
		TeamFactoryStore redTeam = new RedTeamFactory();
		TeamFactoryStore blueTeam = new BlueTeamFactory();
		
		System.out.println("=======================================================");
		System.out.println("4. ���丮 �޼ҵ� ������ �̿��Ͽ� û�������� �������� �����Ѵ�. (�⺻ �������)");
		System.out.println("=======================================================");
		Unit blueTeamUnit = blueTeam.makeUnit("Mage");
		blueTeamUnit = blueTeam.makeUnit("Knight");
		blueTeamUnit = blueTeam.makeUnit("Civilian");
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. ���丮 �޼ҵ� ������ �̿��Ͽ� ���������� �������� �����Ѵ�. (�⺻ �������)");
		System.out.println("=======================================================");
		Unit redTeamUnit = redTeam.makeUnit("Mage");
		redTeamUnit = redTeam.makeUnit("Knight");
		redTeamUnit = redTeam.makeUnit("Civilian");
		System.out.println();

	
	}
}
