package coches;

import javax.xml.bind.annotation.*;
@XmlRootElement(name="transmision")
@XmlType(propOrder = {"tipo", "velocidad"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Transmision {
	
	//@XmlElement(name = "tipo")
	private String tipo;
	@XmlElement(name = "velocidades")
	private Integer velocidad;
	
	public Transmision(){}
	public Transmision(String tipo,Integer velocidad){
		this.tipo = tipo;
		this.velocidad = velocidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
}