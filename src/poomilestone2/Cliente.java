package poomilestone2;
	 
import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
	private final String cpf;
	private final String nome;
	
	ArrayList<Conta> contas = new ArrayList<>();
	
	public Cliente(String cpf, String nome) {

		this.cpf = cpf;
		this.nome = nome;
	}

	public void addConta(Conta c) {
		this.contas.add(c);
		
	}
	
	public void remConta(Conta c) {
		this.contas.remove(c);
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", contas=" + contas + "]";
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Conta> getContas() {
		return contas;
	}
	

	
	
	
}
