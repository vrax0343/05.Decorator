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
		System.out.println("1. 중립 유닛 종류별로 생성한다. (기본 정보출력)");
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
		System.out.println("2. 추상 팩토리패턴을 이용하여 청팀유닛을 종류별로 생성한다. (기본 정보출력)");
		System.out.println("=======================================================");
		
		
		bu = btf.makeUnit("Mage");
		System.out.println(bu);
		bu = btf.makeUnit("Civilian");
		System.out.println(bu);
		bu = btf.makeUnit("Knight");
		System.out.println(bu);

		
		System.out.println("=======================================================");
		System.out.println("3. 추상 팩토리패턴을 이용하여 적팀유닛을 종류별로 생성한다. (기본 정보출력)");
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
		System.out.println("4. 팩토리 메소드 패턴을 이용하여 청팀유닛을 종류별로 생성한다. (기본 정보출력)");
		System.out.println("=======================================================");
		Unit blueTeamUnit = blueTeam.makeUnit("Mage");
		blueTeamUnit = blueTeam.makeUnit("Knight");
		blueTeamUnit = blueTeam.makeUnit("Civilian");
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. 팩토리 메소드 패턴을 이용하여 적팀유닛을 종류별로 생성한다. (기본 정보출력)");
		System.out.println("=======================================================");
		Unit redTeamUnit = redTeam.makeUnit("Mage");
		redTeamUnit = redTeam.makeUnit("Knight");
		redTeamUnit = redTeam.makeUnit("Civilian");
		System.out.println();

	
	}
}
