package strategy.unit;

import java.util.ArrayList;

import factory.af.TeamName;
import observer.DisplayElement;
import observer.Observer;
import observer.Subject;
import singleton.function.Print;
import strategy.behavior.attack.AttackBehavior;
import strategy.behavior.attack.Punch;
import strategy.behavior.attack.SwingSword;
import strategy.behavior.movement.MovementBehavior;
import strategy.behavior.movement.Walk;
import strategy.behavior.weapon.Fist;
import strategy.behavior.weapon.Sword;
import strategy.behavior.weapon.WeaponBehavior;
import strategy.check.MapLimitCheck;
import strategy.function.GenerateRandomPosition;

public class Unit implements Observer{
	public AttackBehavior attack = null;
	public MovementBehavior movement = null;
	public WeaponBehavior weapon=null;
	private Subject weatherData;
	
	
	public String type = "";
	public int locationX=0, locationY=0;
	public int health=0;
	
	public Unit() { 
	}
	public Unit(String type){
		this.type=type;
		this.locationX=GenerateRandomPosition.generate();
		this.locationY=GenerateRandomPosition.generate();
	}
	public Unit(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	
	public void fight(){ }
	
	public void move2(int x,int y){ }
	
	
	public void move(int x, int y){
		MapLimitCheck mlc = new MapLimitCheck();
		int tempX=this.locationX, tempY=this.locationY;
		tempX += x; tempY += y;
		this.setLocation(mlc.check(tempX), mlc.check(tempY));
		System.out.print(this.type+"가\t ");
		System.out.println(movement.getMovementType() +"로 이동합니다.");
	}
	
	
	
	
	//getter
	public String getType(){
		return this.type;
	}
	public void getLocation(){
		System.out.println("("+this.locationX+"," + this.locationY+")");
	}
	public int getLocationX(){
		return this.locationX;
	}
	public int getLocationY(){
		return this.locationY;
	}
	public String getWeaponType(){
		return this.weapon.getWeaponType();
	}	
	public String getAttackType(){
		return this.attack.getAttackType();
	}
	public String getMovementType(){
		return this.movement.getMovementType();
	}
	
	public int getHealth() {
		return health;
	}
	
	
	
	
	//setter
	
	public AttackBehavior getAttack() {
		return attack;
	}
	public MovementBehavior getMovement() {
		return movement;
	}
	public WeaponBehavior getWeapon() {
		return weapon;
	}
	public Subject getWeatherData() {
		return weatherData;
	}
	public void setWeapon(WeaponBehavior w){
		System.out.print("[Before Weapon]: " + this.getWeaponType() +"\t");
		this.weapon = w;
		System.out.println("[After Weapon]: " + this.getWeaponType());
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setMovement(MovementBehavior m){
		this.movement = m;
	}
	public void setAttack(AttackBehavior a){
		System.out.print("[Before Attack]: " + this.getAttackType() +"\t");
		this.attack = a;
		System.out.println("[After Attack]: " + this.getAttackType());
	}
	
	public void setLocation(int x, int y){
		System.out.print("[Before Location]: (" + this.getLocationX()+","+this.getLocationY()+")\t");
		this.locationX = x;
		this.locationY = y;
		System.out.println("[After Location]: (" + this.getLocationX()+","+this.getLocationY()+")");
		System.out.println();
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	
	
	//toString
	public String toString(){
		return 
//				"---현재 "+this.type+"의 상태입니다---" + "\n"+ 
				"Type: " + this.type + "\t"+
				"Health: " + this.health + "\t"+
				"Location X,Y: " + this.locationX+","+this.locationY+"\t"+
				"WeaponType: " + this.weapon.getWeaponType() + "\t"+
				"MovementType: " + this.movement.getMovementType() + "\t"+
				"AttackType: " + this.attack.getAttackType() + "\t";
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
				"["+this.getType() +"]: ("+ 
		this.getLocationX()+", "+this.getLocationY()+")");
	}
	
	public void prepareTeamInfo(){ 
		System.out.println("Please Overriding prepareTeamInfo()");
	};
	
	public void setting(Unit unit){
		this.type = unit.getType();
		this.health = unit.getHealth();
		this.weapon = unit.getWeapon();
		this.movement = unit.getMovement();
		this.attack = unit.getAttack();
		this.locationX = unit.getLocationX();
		this.locationY = unit.getLocationY();
	}
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Please Overriding prepare()");
	}
	
}
