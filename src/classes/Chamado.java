package classes;

import java.util.Date;

import interfaces.IChamado;

public class Chamado implements IChamado {
	private Number id;
	private String status;
	private Colaborador colaborador;
	private Veiculo veiculo;
	private String endereco;
	private String detalhes;
	private Boolean concluido;
	private Number distancia;
	private Date data_abertura;
	private Number co2_emitido;

	@Override
	public String getInfo() {
		String id = String.valueOf(this.getId());
		String status = getStatus();
		String colaborador = this.colaborador.getNome();
		Date data_abertura = this.getData_abertura();
		
		
		String info = String.format("INFORMAÇÕES DO CHAMADO: \n ID: %s \n STATUS: %s \n COLABORADOR: %s \n DATA ABERTURA: %s", id, status, colaborador, data_abertura);
		return info;

	}

	@Override
	public void calcularDistancia() {
		// TODO Auto-generated method stub
		// Metodo para implementação futura.

	}

	@Override
	public void calcularCo2() {
		// TODO Auto-generated method stub

	}

	public Number getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public Boolean getConcluido() {
		return concluido;
	}

	public Number getDistancia() {
		return distancia;
	}

	public Date getData_abertura() {
		return data_abertura;
	}

	public Number getCo2_emitido() {
		return co2_emitido;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public void setConcluido(Boolean concluido) {
		this.concluido = concluido;
	}

	public void setDistancia(Number distancia) {
		this.distancia = distancia;
	}

	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}

	public void setCo2_emitido(Number co2_emitido) {
		this.co2_emitido = co2_emitido;
	}

	

}
