package classes;

import interfaces.IColaborador;

public class Colaborador implements IColaborador {
	private Number id;
	private String nome;
	private String cpf;
	private String cnh;
	private String ctps;
	private String endereco;
	private String telefone;
	
	@Override
	public String getPersonalInfo() {
		String nome = this.getNome();
		String cpf = this.getCpf();
		String cnh = this.getCnh();
		String personalInfo = String.format("NOME: %s, CPF: %s, CNH: %s", nome, cpf, cnh );
		return personalInfo;
	}
	
	@Override
	public String getWorkInfo() {
		String ctps = this.getCtps();
		String workInfo = String.format("CTPS: %s", ctps);
		return workInfo;
	}
	
	@Override
	public String getContactInfo() {
		String endereco = this.getEndereco();
		String telefone = this.getTelefone();
		String contactInfo = String.format("ENDEREÇO: %s, TELEFONE: %s", endereco, telefone);
		return contactInfo;

	}

	public Number getId() {
		return id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
