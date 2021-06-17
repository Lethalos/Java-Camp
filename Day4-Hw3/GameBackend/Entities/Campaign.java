package GameBackend.Entities;

public class Campaign {
	private String name;
	private int discountRate;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public Campaign(String name, int discountRate) {
		this.name = name;
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "Campaign [name=" + name + ", discountRate=" + discountRate + "]";
	}
}
