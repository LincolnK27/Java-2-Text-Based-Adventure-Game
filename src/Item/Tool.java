package Item;

public class Tool implements Item {
	
	private String name;
	private Double weight;
	private String desc;
	
	//Get Name
	public String getName() {
	 return this.name;
	}
	
	//Get weight
	public Double getWeight() {
	return this.weight;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	//Get inspect
	public String getInspect() {
		return desc;
	}

	@Override
	//Set inspect info
	public void setInspect(String desc) {
		this.desc = desc;
	}
}
