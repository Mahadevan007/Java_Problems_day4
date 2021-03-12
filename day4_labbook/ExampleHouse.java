package day4_labbook;

public class ExampleHouse {
	public static void main(String[] args) {
		House house = new House(5000,6000);
		System.out.println(house.calculateTotalAmount());
	}
}

class House {
	int amountOfDoorHouse;
	Door door;
	Window window;
	
	public House(int amountOfDoor,int amountOfWindow) {
		door = new Door(amountOfDoor);
		window = new Window(amountOfWindow);
	}
	
	public int calculateTotalAmount() {
		amountOfDoorHouse = door.getAmount() + window.getAmount();       
		return amountOfDoorHouse;
	}
}

class Door {
	int totalAmount;
	
	public Door(int amount) {
		this.totalAmount = amount;
	}
	
	public int getAmount() {
		return this.totalAmount;
	}
}

class Window {
	int totalAmount;
	
	public Window(int amount) {
		this.totalAmount = amount;
	}
	
	public int getAmount() {
		return this.totalAmount;
	}
}