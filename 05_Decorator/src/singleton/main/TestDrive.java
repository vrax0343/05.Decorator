package singleton.main;

import singleton.unit.SingletonUnit;

public class TestDrive {


		
		public static void main(String[] args){		
			
			System.out.println("=======================================================");
			System.out.println("1. ���� �������� ���� �����Ѵ�. (�⺻ �������)");
			System.out.println("=======================================================");
			
			SingletonUnit unit = SingletonUnit.getInstance();
//			unit.addUnit("Citizen");
//			unit.addUnit("Knight");
//			unit.addUnit("Mage");
//			unit.addUnit("Citizen");
			System.out.println();
			
			System.out.println("=======================================================");
			System.out.println("2. ���� ����� ����Ѵ�.");
			System.out.println("=======================================================");
			unit.printAllUnit();
			System.out.println();
			
			System.out.println("=======================================================");
			System.out.println("3. �ù��� �׾���. (�������)");
			System.out.println("=======================================================");
			unit.unitDied("Citizen1");
			System.out.println();
//			
//			System.out.println("=======================================================");
//			System.out.println("4. ���� ����� ����Ѵ�.");
//			System.out.println("=======================================================");
//			unit.printAllUnit();
//			System.out.println();
	//	
//			System.out.println("=======================================================");
//			System.out.println("5. ��縦 �Ѹ�� �����Ѵ�.");
//			System.out.println("=======================================================");
//			unit.addUnit("Knight");
//			System.out.println();
	//
//			System.out.println("=======================================================");
//			System.out.println("6. ���� ����� ����Ѵ�.");
//			System.out.println("=======================================================");
//			unit.printAllUnit();
//			System.out.println();
	//
//			System.out.println("=======================================================");
//			System.out.println("7. ��� ������ ���ÿ� �����Ѵ�.");
//			System.out.println("=======================================================");
//			unit.fightAllUnit();
//			System.out.println();
	//
//			System.out.println("=======================================================");
//			System.out.println("8. ��� ������ �׾���.");
//			System.out.println("=======================================================");
//			unit.unitDiedAll();
//			System.out.println();
	//
//			System.out.println("=======================================================");
//			System.out.println("9. ���� ����� ����Ѵ�.");
//			System.out.println("=======================================================");
//			unit.printAllUnit();
//			System.out.println();
			
		}
	}

