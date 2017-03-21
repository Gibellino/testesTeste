package model;

public class Conta {

	private int id;
	private String nome, tlm, email;
	private float saldo;
	
	public Conta(int id, String nome, String tlm, String email) {
		this.id = id;
		this.nome = nome;
		this.tlm = tlm;
		this.email = email;
		this.saldo = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTlm() {
		return tlm;
	}

	public void setTlm(String tlm) {
		this.tlm = tlm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String toString(){
		return "\nConta " + (getId()+1)
				+ ":\n Nome: " + getNome() 
				+ ";\n E-mail: " + getEmail() 
				+ ";\n Telemovel: " + getTlm() 
				+ ";\n Saldo: " + getSaldo();
	}
}
