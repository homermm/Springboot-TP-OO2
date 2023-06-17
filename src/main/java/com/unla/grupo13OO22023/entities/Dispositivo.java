package com.unla.grupo13OO22023.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="dispositivo")

public class Dispositivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDispositivo;
	@Column(name="altaLogica")
	private boolean altaLogica;
	@Column(name="activado")
	private boolean activado;
	
	
	//Si no lo agregaba el /new me tiraba error
	public Dispositivo() {
		super();
	}

	public Dispositivo(int idDispositivo) {
		super();
		this.idDispositivo = idDispositivo;
	}

	public Dispositivo(int idDispositivo, boolean altaLogicaYActivadoEmpiezanEn) {
		super();
		this.idDispositivo = idDispositivo;
		this.altaLogica = altaLogicaYActivadoEmpiezanEn;
		this.activado = altaLogicaYActivadoEmpiezanEn;
	}

	public Dispositivo(int idDispositivo, boolean altaLogica, boolean activado) {
		super();
		this.idDispositivo = idDispositivo;
		this.altaLogica = altaLogica;
		this.activado = activado;
	}

	public int getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public boolean isAltaLogica() {
		return altaLogica;
	}

	public void setAltaLogica(boolean altaLogica) {
		this.altaLogica = altaLogica;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}
	
	
	
	
}
