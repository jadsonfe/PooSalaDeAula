package banco.app;

import java.math.BigDecimal;

import poomilestone2.Conta;
public class aplicacao {
	
	public static void main(String[] args) {
		Conta c = new Conta ("123A");
		
		Conta c1 = new Conta("321B");
		
		c.depositar(new BigDecimal("100.5"));
		
		c.sacar(new BigDecimal("50"));
		
		c.transferir(new BigDecimal("25"), c1);
		
		System.out.println(c);
		
		System.out.println(c1);
	}

}
