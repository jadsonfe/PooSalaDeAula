package poomilestone2;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Conta {
	private String numero;
	private BigDecimal saldo;
	private LocalDateTime dataAbertura;
	private boolean status;
		
	public Conta(String numero) {
		this.numero = numero;
		this.saldo = new BigDecimal(0);
		this.saldo.setScale(2);
		this.dataAbertura = LocalDateTime.now();
		this.status = true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numero, other.numero);
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status=" + status
				+ "]";
	}

	public String getNumero() {
		return numero;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void sacar(BigDecimal quantia) {
		if(isStatus() && quantia.compareTo(this.saldo) <= 0) {
			this.saldo.subtract(quantia);
		}else
			System.out.println("Operação invalida");
	}
	
	public void depositar(BigDecimal quantia) {
		if(isStatus()) {
			this.saldo.add(quantia);
		}else
			System.out.println("Operação invalida");
	}
	
	public void transferir(BigDecimal quantia, Conta destino) {
		if(this.saldo.compareTo(quantia) > 0 && this.isStatus() && destino.isStatus()) {
			this.saldo.subtract(quantia);
			destino.saldo.add(quantia);
		}else 
			System.out.println("Operação invalida");
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
