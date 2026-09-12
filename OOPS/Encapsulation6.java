package OOPS;

public class Encapsulation6 {
    
	private int accno;         //class value
	private String name;
	private double amount;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}


	public static void main(String[] args) {
		Encapsulation6 acc = new Encapsulation6();
		
		acc.setAccno(101);
		acc.setName("Yogii");
		acc.setAmount(50000);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}
}