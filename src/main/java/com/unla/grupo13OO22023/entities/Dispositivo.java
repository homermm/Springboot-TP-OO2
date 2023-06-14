package com.unla.grupo13OO22023.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Comprobar nombre de las tablas luego de creer la bdd en grupo!!
//Agregamos la relacion con Aula? chequear
@Entity
@Getter @Setter @NoArgsConstructor
@Table(name="dispositivo")
public abstract class Dispositivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDispositivo;
	@Column(name="altaLogica")
	private boolean altaLogica;
	@Column(name="activado")
	private boolean activado;
	
	public Dispositivo(int idDispositivo) {
		super();
		this.idDispositivo = idDispositivo;
	}

	public Dispositivo(int idDispositivo, boolean altaLogica, boolean activado) {
		super();
		this.idDispositivo = idDispositivo;
		this.altaLogica = altaLogica;
		this.activado = activado;
	}
	
	
}