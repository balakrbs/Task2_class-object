package task2;
import java.util.*;

//Question no::1.3

public class AccountEnq {

	public static void main(String[] args) {
		Scanner val= new Scanner(System.in);
		Account obj1=new Account();
		
		obj1.deposit(2000);
		obj1.balance();
		obj1.withdrawal(500);
		obj1.balance();
		
		val.close();

	}

}
