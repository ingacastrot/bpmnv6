package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Description("Entidad Solicitud, que contiene todos los atributos necesarios de la solicitud del tramite")
public class Solicitud implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Numero de Solicitud")
	private java.lang.Integer numeroSolicitud;

	@org.kie.api.definition.type.Label("Fecha de Solicitud")
	private java.util.Date fechaSolicitud;

	@org.kie.api.definition.type.Label("Tipo de Solicitud")
	private java.lang.String tipoSolicitud;

	@org.kie.api.definition.type.Label("Canal de Recepción")
	private java.lang.String sistemaEnvio;

	@org.kie.api.definition.type.Label("Origen Solicitud")
	private java.lang.String origen;

	@org.kie.api.definition.type.Label("Informacion Ingreso Usuario")
	private java.lang.String usuarioLog;

	@org.kie.api.definition.type.Label("Fechas de Ingreso")
	private java.util.Date fechaLog;

	@org.kie.api.definition.type.Label("Identificación")
	private java.lang.Integer ID;

	public Solicitud() {
	}

	public java.lang.Integer getNumeroSolicitud() {
		return this.numeroSolicitud;
	}

	public void setNumeroSolicitud(java.lang.Integer numeroSolicitud) {
		this.numeroSolicitud = numeroSolicitud;
	}

	public java.util.Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaSolicitud(java.util.Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public java.lang.String getTipoSolicitud() {
		return this.tipoSolicitud;
	}

	public void setTipoSolicitud(java.lang.String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public java.lang.String getSistemaEnvio() {
		return this.sistemaEnvio;
	}

	public void setSistemaEnvio(java.lang.String sistemaEnvio) {
		this.sistemaEnvio = sistemaEnvio;
	}

	public java.lang.String getOrigen() {
		return this.origen;
	}

	public void setOrigen(java.lang.String origen) {
		this.origen = origen;
	}

	public java.lang.String getUsuarioLog() {
		return this.usuarioLog;
	}

	public void setUsuarioLog(java.lang.String usuarioLog) {
		this.usuarioLog = usuarioLog;
	}

	public java.util.Date getFechaLog() {
		return this.fechaLog;
	}

	public void setFechaLog(java.util.Date fechaLog) {
		this.fechaLog = fechaLog;
	}

	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	public Solicitud(java.lang.Integer numeroSolicitud,
			java.util.Date fechaSolicitud, java.lang.String tipoSolicitud,
			java.lang.String sistemaEnvio, java.lang.String origen,
			java.lang.String usuarioLog, java.util.Date fechaLog,
			java.lang.Integer ID) {
		this.numeroSolicitud = numeroSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.tipoSolicitud = tipoSolicitud;
		this.sistemaEnvio = sistemaEnvio;
		this.origen = origen;
		this.usuarioLog = usuarioLog;
		this.fechaLog = fechaLog;
		this.ID = ID;
	}

}