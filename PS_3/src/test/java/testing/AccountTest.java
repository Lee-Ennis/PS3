package testing;

import static org.junit.Assert.*;


import org.junit.Test;
import account.Account;
import account.InsufficientFundsException;

public class AccountTest {

	
	@Test
	public void first_test(){
		Account g_and_s_test = new Account();
		
		g_and_s_test.setId(1122);
		g_and_s_test.setBalance(20000);
		g_and_s_test.setAnnualInterestRate(4.5);		
		g_and_s_test.getMonthlyInterestRate();
		
		System.out.println(g_and_s_test.getId());
		System.out.println(g_and_s_test.getBalance());
		System.out.println(g_and_s_test.getAnnualInterestRate());
		System.out.println(g_and_s_test.getDateCreated());
		
		// Testing Getters and Setters
	}

		
	
	
	@Test
	public void withdraw_test() throws InsufficientFundsException{
		Account with_test = new Account(1122, 20000);
		
		assertEquals(with_test.withdraw(2500), (17500), 0);
		
		// Not going under
		
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void withdraw_ex_test() throws InsufficientFundsException{
		Account with_ex_test = new Account(1122, 20000);
		
		with_ex_test.withdraw(30000);
		
		// Going under
	}
	
	@Test
	public void deposit_test() {
		Account dep_test = new Account(1122, 20000);
		
		assertEquals(dep_test.deposit(3000), (23000), 0);
		
		// Just depositing
	}


}


