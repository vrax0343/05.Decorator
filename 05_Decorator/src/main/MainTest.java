package main;

import unit.*;
import behavior.weapon.*;
import factory.fm.*;


public class MainTest {
	
	public static void main(String[] args){		
		
		
		
		System.out.println("=======================================================");
		System.out.println("1. û��, ����, �߸������� �������� �����Ѵ�.");
		System.out.println("=======================================================");
		
		Unit unit = Unit.getInstance();
		unit.addUnit("Citizen");
		unit.addUnit("Knight");
		unit.addUnit("Mage");
		unit.addUnit("Citizen");
		unit.addUnit("Owl");
		System.out.println();
		
		unit.addDetect("Mage");
		unit.addDetect("Citizen");
		unit.addDetect("Knight");
		
		
		factory.af.TeamFactoryStore btf = new factory.af.BlueTeamFactory();
		factory.af.TeamFactoryStore rtf = new factory.af.RedTeamFactory();
		factory.af.unit.TeamUnit bu,ru= null;
		
		bu = btf.makeUnit("Mage");
		bu = btf.makeUnit("Civilian");
		bu = btf.makeUnit("Knight");
		System.out.println();
		
		ru = rtf.makeUnit("Mage");
		ru = rtf.makeUnit("Civilian");
		ru = rtf.makeUnit("Knight");
		System.out.println();
		
//		
//		
//		TeamFactoryStore redTeam = new RedTeamFactory();
//		TeamFactoryStore blueTeam = new BlueTeamFactory();
//		
//		System.out.println("=======================================================");
//		System.out.println("4. ���丮 �޼ҵ� ������ �̿��Ͽ� û�������� �������� �����Ѵ�. (�⺻ �������)");
//		System.out.println("=======================================================");
//		TeamUnit blueTeamUnit = blueTeam.makeUnit("Mage");
//		blueTeamUnit = blueTeam.makeUnit("Knight");
//		blueTeamUnit = blueTeam.makeUnit("Civilian");
//		System.out.println();
//	
//		System.out.println("=======================================================");
//		System.out.println("5. ���丮 �޼ҵ� ������ �̿��Ͽ� ���������� �������� �����Ѵ�. (�⺻ �������)");
//		System.out.println("=======================================================");
//		TeamUnit redTeamUnit = redTeam.makeUnit("Mage");
//		redTeamUnit = redTeam.makeUnit("Knight");
//		redTeamUnit = redTeam.makeUnit("Civilian");
//		System.out.println();

	
	}
}
