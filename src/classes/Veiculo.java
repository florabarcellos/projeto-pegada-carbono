package classes;

import interfaces.IVeiculo;

public class Veiculo implements IVeiculo {
	private String id;
	private String modelo;
	private String ano;
	private String categoria;
	private int kilometragem;
	private int autonomia;
	
	@Override
	public String getInfo() {
		String placa = this.getId();
		String modelo = this.getModelo();
		String ano = this.getAno();
		String info = String.format("PLACA: %s, MODELO: %s, ANO: %s", placa, modelo, ano);
		return info;
	}

	private String getId() {
		return id;
	}

	private String getModelo() {
		return modelo;
	}

	private String getAno() {
		return ano;
	}

	private String getCategoria() {
		return categoria;
	}

	private int getKilometragem() {
		return kilometragem;
	}

	private int getAutonomia() {
		return autonomia;
	}

	private void setId(String id) {
		this.id = id;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private void setAno(String ano) {
		this.ano = ano;
	}

	private void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	private void setKilometragem(int kilometragem) {
		this.kilometragem = kilometragem;
	}

	private void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

}
