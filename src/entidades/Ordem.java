package entidades;

import java.util.Date;

import entidades.enums.OrdemStatus;

public class Ordem {
	
	//Abaixo estão os ATRIBUTOS da Classe 'Ordem'.
	private Integer id;
	private Date moment;
	private OrdemStatus status;
	
	//Criação de um cosntrutor vazio.
	public Ordem() {
	}
	
	//Cosntrutor com todos os campos.
	public Ordem(Integer id, Date moment, OrdemStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}
	//Gerando um toString 'automático'.

	@Override
	public String toString() {
		return "Ordem [Id=" + id + ", Data=" + moment + ", Status=" + status + "]";
	}
	
	
}
