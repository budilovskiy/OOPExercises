package oop.excercises.thediscountsystem;

public class DiscountRate {

	// Premium, gold and silver members receive a discount of 20%, 15%, and 10%,
	// respectively, for all services provided.
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;

	// All members receives a flat 10% discount on products purchased (this
	// might change in future)
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;

	/**
	 * Return value of service discount for each type of membership (Premium,
	 * gold and silver) or 0.0.
	 * 
	 * @param type : String value of membership type
	 * @return value of service discount respectively to each type of membership
	 */
	public static double getServiceDiscountRate(String type) {
		if (type == null) return 0.0;
		switch (type) {
		case "Premium":
			return serviceDiscountPremium;
		case "Gold":
			return serviceDiscountGold;
		case "Silver":
			return serviceDiscountSilver;
		default:
			return 0.0;
		}
	}

	/**
	 * Return value of product discount for each type of membership (Premium,
	 * gold and silver) or 0.0.
	 * 
	 * @param type : String value of membership type
	 * @return value of product discount respectively to each type of membership
	 */
	public static double getProductDiscountRate(String type) {
		if (type == null) return 0.0;
		switch (type) {
		case "Premium":
			return productDiscountPremium;
		case "Gold":
			return productDiscountGold;
		case "Silver":
			return productDiscountSilver;
		default:
			return 0.0;
		}
	}

}
