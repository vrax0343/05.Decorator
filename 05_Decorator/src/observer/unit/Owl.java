package observer.unit;

import java.util.ArrayList;

import observer.Observer;
import observer.Subject;
import observer.behavior.movement.Fly;
import observer.function.Detecting;
import strategy.unit.Unit;

public class Owl extends Unit implements Subject{
	private static Owl uniqueInstance=null;
	private ArrayList<Observer> observers;
	ArrayList<Unit> unitList=null;
	int range = 20;
	
	public static synchronized Owl getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Owl();
		}
		return uniqueInstance;
	}
	
	private Owl() {
		// TODO Auto-generated constructor stub
		super("Owl");
		this.health = 0;
		this.weapon = null;
		this.movement = new Fly();
		this.attack = null;
		observers = new ArrayList<Observer>();
}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.print("�ù��� \t");
		weapon.useWeapon();
		attack.attack();
		System.out.println();
	}

	public void specialAbility() {
		// TODO Auto-generated method stub
		ArrayList<Unit> unitList = new ArrayList<Unit>();
		observers=new ArrayList<Observer>();
		System.out.println("���� Owl�� ��ġ��: ("+this.getLocationX()+", "+this.getLocationY()+")");
		unitList = new Detecting().detectUnit(this.getLocationX(), this.getLocationY(), range);
		
		
		System.out.println("���� Owl�� ������ �ִ� ������ �Ʒ��� �����ϴ�.");
		for(int i=0;i<unitList.size();i++){
			registerObserver(unitList.get(i));
		}
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
			observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	
	
	public ArrayList<Unit> getUnitList() {
		return unitList;
	}

	public void setUnitList(ArrayList<Unit> unitList) {
		this.unitList = unitList;
	}

		//toString
		public String toString(){
			return "---���� "+this.type+"�� �����Դϴ�---" + "\n"+ 
					"Type: " + this.type + "\t"+
					"Health: " + this.health + "\t"+
					"Location X,Y: " + this.locationX+","+this.locationY+"\t"
					;
		}

}
