package GameBackend.Entities;

public class Game {
	private int id;
	private String name;
	private float price;
	private float originalPrice;
	
	public Game(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		setOriginalPrice(price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
