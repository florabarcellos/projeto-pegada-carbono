package classes;

import interfaces.IColaborador;

public class Colaborador implements IColaborador {
	private short id;
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

	private short getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	private String getCpf() {
		return cpf;
	}

	private String getCnh() {
		return cnh;
	}

	private String getCtps() {
		return ctps;
	}

	private String getEndereco() {
		return endereco;
	}

	private String getTelefone() {
		return telefone;
	}

	private void setId(short id) {
		this.id = id;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private void setCnh(String cnh) {
		this.cnh = cnh;
	}

	private void setCtps(String ctps) {
		this.ctps = ctps;
	}

	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
	
