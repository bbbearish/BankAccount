package Account;


public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account("25252525", "joni bon jubi", 500);
		Account account2 = new Account("30303030", "cris rok", 1000);
	System.out.println(account);
	System.out.println(account.credit(30));
	System.out.println(account);
	System.out.println(account.debit(100));
	System.out.println(account);
	System.out.println(account.transferTo(account2, 50));
	System.out.println(account);
	System.out.println(account2);

	}
}
