package decorator;

public abstract class AbilityDecorator extends NormalUnit {
	public NormalUnit normalUnit;
	
	public abstract String getDescription();
	
	public void setUnit(NormalUnit nu){
		this.normalUnit = nu;
	}
	
	public NormalUnit getUnit(){
		return normalUnit;
	}
}
