package org.springframework.samples.petclinic.proxy;

public class CreditCard implements Payment {
	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		if (amount > 100) {
			System.out.println("결제 금액" + amount);
		} else {
			cash.pay(amount);
		}
	}
}
