
public class MainClass {

	public static void main(String[] args) {
		Address address = new Address("Pune", "Maharshtra", "India", 411057);
		Customer customer = new Customer(101, "Satish", "Mahajan", address);
		System.out.println(customer.getAddress().getCity());
		customer.getAddress().setCity("New York");
		customer.getAddress().setCountry("USA");
		customer.getAddress().setState("New York");
		System.out.println(customer.getAddress().getCity());
		customer.setAddress(new Address("Mumbai", "Maharshtra", "India", 400045));
		System.out.println(customer.getAddress().getState());
	}
}
