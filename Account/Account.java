package Account;

public class Account {
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public int credit(int amount){
		return balance = balance + amount;
		
	}
	
	public int debit(int amount){
		return balance=balance-amount;
	}
	public int transferTo(Account another, int amount){
			this.balance=this.balance - amount;
			another.balance =  another.balance+amount;
		return balance;
	}

}
