package oop.excercises.thediscountsystem;

import java.util.Date;

public class Visit {

	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	/**
	 * Constructor with new customer
	 * 
	 * @param name of new customer
	 * @param date
	 */
	public Visit(String name, Date date) {
		this.date = date;
		customer = new Customer(name);
	}

	/**
	 * Constructor with existing customer
	 * 
	 * @param customer
	 * @param date
	 */
	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
	}

	/**
	 * Getter for name of customer
	 * 
	 * @return name
	 */
	public String getName() {
		return customer.getName();
	}

	/**
	 * Getter for service expense
	 * 
	 * @return value of service expense
	 */
	public double getServiceExpense() {
		return serviceExpense;
	}

	/**
	 * Set service expense with discount respectively to the type of customer
	 * membership
	 * 
	 * @param serviceExpense
	 */
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense - serviceExpense
				* DiscountRate.getServiceDiscountRate(customer.getMemberType());
	}

	/**
	 * Getter for product expense
	 * 
	 * @return value of product expense
	 */
	public double getProductExpense() {
		return productExpense;
	}

	/**
	 * Set product expense with discount respectively to the type of customer
	 * membership
	 * 
	 * @param productExpense
	 */
	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense - productExpense
				* DiscountRate.getProductDiscountRate(customer.getMemberType());
	}

	/**
	 * Getter for total expense
	 * 
	 * @return value of total expense
	 */
	public double getTotalExpense() {
		return serviceExpense + productExpense;
	}

	@Override
	public String toString() {
		return date + "\n" + customer + "\nProduct expense: " + productExpense
				+ "\nService expense: " + serviceExpense + "\nTotal expense: "
				+ getTotalExpense();
	}

}
