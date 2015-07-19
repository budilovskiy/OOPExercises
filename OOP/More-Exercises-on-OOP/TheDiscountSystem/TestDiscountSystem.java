package oop.excercises.thediscountsystem;

import java.util.Date;

public class TestDiscountSystem {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("John");
		System.out.println(customer1);
		
		System.out.println("----------------");
		Visit visit1 = new Visit("Mike White", new Date());
		visit1.setServiceExpense(100);
		visit1.setProductExpense(100);
		System.out.println(visit1);
		
		System.out.println("----------------");
		Visit visit2 = new Visit(customer1, new Date());
		visit2.setServiceExpense(100);
		visit2.setProductExpense(100);
		System.out.println(visit2);
		customer1.setMember(true);
		
		System.out.println("----------------");
		Visit visit3 = new Visit(customer1, new Date());
		visit3.setServiceExpense(100);
		visit3.setProductExpense(100);
		System.out.println(visit3);
		customer1.setMemberType("Gold");
		
		System.out.println("----------------");
		Visit visit4 = new Visit(customer1, new Date());
		visit4.setServiceExpense(100);
		visit4.setProductExpense(100);
		System.out.println(visit4);

	}
}
