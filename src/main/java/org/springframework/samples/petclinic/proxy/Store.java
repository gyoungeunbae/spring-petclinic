package org.springframework.samples.petclinic.proxy;

public class Store {
	Payment payment;

	public Store(Payment payment) {
		this.payment = payment;
	}

	void buySomething(int amount) {
		payment.pay(100);
	}
}
