package classes;

import interfaces.IVeiculo;

public class Veiculo implements IVeiculo {
	private Number id;
	private String modelo;
	private String ano;
	private String categoria;
	private Number kilometragem;
	private Number autonomia;
	
	@Override
	public String getInfo() {
		String placa = String.valueOf(this.getId());
		String modelo = this.getModelo();
		String ano = this.getAno();
		String info = String.format("PLACA: %s, MODELO: %s, ANO: %s", placa, modelo, ano);
		return info;
	}

	public Number getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAno() {
		return ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public Number getKilometragem() {
		return kilometragem;
	}

	public Number getAutonomia() {
		return autonomia;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setKilometragem(Number kilometragem) {
		this.kilometragem = kilometragem;
	}

	public void setAutonomia(Number autonomia) {
		this.autonomia = autonomia;
	}

	

}
