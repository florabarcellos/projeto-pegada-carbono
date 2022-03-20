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

	private Number getId() {
		return id;
	}

	private String getStatus() {
		return status;
	}

	private Colaborador getColaborador() {
		return colaborador;
	}

	private Veiculo getVeiculo() {
		return veiculo;
	}

	private String getEndereco() {
		return endereco;
	}

	private String getDetalhes() {
		return detalhes;
	}

	private Boolean getConcluido() {
		return concluido;
	}

	private Number getDistancia() {
		return distancia;
	}

	private Date getData_abertura() {
		return data_abertura;
	}

	private Number getCo2_emitido() {
		return co2_emitido;
	}

	private void setId(Number id) {
		this.id = id;
	}

	private void setStatus(String status) {
		this.status = status;
	}

	private void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	private void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	private void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	private void setConcluido(Boolean concluido) {
		this.concluido = concluido;
	}

	private void setDistancia(Number distancia) {
		this.distancia = distancia;
	}

	private void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}

	private void setCo2_emitido(Number co2_emitido) {
		this.co2_emitido = co2_emitido;
	}

}
