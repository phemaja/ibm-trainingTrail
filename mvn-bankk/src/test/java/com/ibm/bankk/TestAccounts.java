package com.ibm.bankk;
/*import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	
	public static void main(String[] args) throws NumberFormatException, BalanceException {
		
		Account a1 = new Account(10000);
		
		System.out.println(a1.deposit(1000));
		System.out.println(a1.withdraw(1000));
		a1.deposit(-10);
		a1.withdraw(-100);	}
	
	--------------------------------------------------------
	
		Account a1 = new Account(10000);
		
		@Test
		public void testDeposit() {
			System.out.println(a1.deposit(1000));
		}
		
		@Test
		public void testWithdraw() throws NumberFormatException, BalanceException {
			System.out.println(a1.withdraw(1000));
		}
		
		@Test
		public void testInvalidDeposit() {
			System.out.println(a1.deposit(-1000));
		}
		
		@Test
		public void testInvalidWithdraw() throws NumberFormatException, BalanceException {
			System.out.println(a1.withdraw(-1000));
		}		
	------------------------------------------------------------------------------------------
	private Account acnt;
	
	@BeforeEach
	public void init() {
		acnt = new Account(1000);
	}
	
	@Test
	public void testWithdraw() throws BalanceException{
		assertEquals(500, acnt.withdraw(500));
	}
	
	@Test 
	public void testInvalidWithdraw() {
		assertThrows(BalanceException.class, ()-> acnt.withdraw(500));
	}
	
	@Test 
	public void testNegativeWithdraw() {
		assertThrows(BalanceException.class, ()-> acnt.withdraw(-200));		
	}	
	
	@Test
	public void testDeposit() {
		assertEquals(200, acnt.deposit(1000));	
	}
	
	@Test 
	public void testNegativeDeposit() {
		assertThrows(BalanceException.class, ()-> acnt.deposit(-200));	
	}
}
*/
	

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

		public class TestAccounts{
			
				public Account a ;
			@BeforeEach
			public void init() {
				a= new Account(1000);
			}
			
			@Test
			public void testWithdraw() throws  BalanceException{
				assertEquals(500,a.withdraw(500));
			}
			
			@Test
			public void testInvalidWithdraw() throws NumberFormatException, BalanceException{
				assertThrows(BalanceException.class, ()->a.withdraw(1500));
			}
			
			@Test
			public void testNegativeWithdraw() throws  NumberFormatException,BalanceException{
				assertThrows(NumberFormatException.class, ()->a.withdraw(-3000));
			}
			
			@Test
			public void testDeposit(){
				assertEquals(2000,a.deposit(1000));
			}
			
			@Test
			public void testNagetiveDeposit(){
				assertThrows(NumberFormatException.class, ()->a.deposit(-500));
			}


			
			
			
		}
		
	
