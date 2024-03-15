package banco.app;

import java.math.BigDecimal;
import banco.logica.Conta;

import poomilestone2.Conta;
public class aplicacao {
	
	public static void main(String[] args) {
		
		Cliente cli = new Cliente("000", "Jadson");
		
		Conta c = new Conta ("123A");
		Conta c1 = new Conta("321B");
		c.depositar(new BigDecimal("100.5"));
		c.sacar(new BigDecimal("50"));
		c.transferir(new BigDecimal("25"), c1);
		
		cli.getContas().add(c);
		cli.getContas().add(c1);
		
		System.out.println(cli);
		
	
	}

}
