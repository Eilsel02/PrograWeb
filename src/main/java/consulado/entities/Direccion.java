package consulado.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Direccion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdDireccion;
	private String Direccion;
	private String Referencia;
	private String Interior;
	private double Latitud;
	private double Longitud;

	@ManyToOne()
	@JoinColumn(name = "IdDistrito")
	private Distrito IdDistrito;

	@ManyToOne()
	@JoinColumn(name = "IdCliente")
	private Cliente IdCliente;

	
	public void TrimAllFields() {
		this.Direccion=this.Direccion.trim();
		this.Referencia=this.Referencia.trim();
		this.Interior=this.Interior.trim();		
	}
	
	
	
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Direccion(long idDireccion, String direccion, String referencia, String interior, double latitud,
			double longitud, Distrito idDistrito, Cliente idCliente) {
		super();
		IdDireccion = idDireccion;
		Direccion = direccion;
		Referencia = referencia;
		Interior = interior;
		Latitud = latitud;
		Longitud = longitud;
		IdDistrito = idDistrito;
		IdCliente = idCliente;
	}

	

	
	@Override
	public String toString() {
		return "Direccion [IdDireccion=" + IdDireccion + ", Direccion=" + Direccion + ", Referencia=" + Referencia
				+ ", Interior=" + Interior + ", Latitud=" + Latitud + ", Longitud=" + Longitud + ", IdDistrito="
				+ IdDistrito + ", IdCliente=" + IdCliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Direccion == null) ? 0 : Direccion.hashCode());
		result = prime * result + ((IdCliente == null) ? 0 : IdCliente.hashCode());
		result = prime * result + (int) (IdDireccion ^ (IdDireccion >>> 32));
		result = prime * result + ((IdDistrito == null) ? 0 : IdDistrito.hashCode());
		result = prime * result + ((Interior == null) ? 0 : Interior.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Latitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Longitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Referencia == null) ? 0 : Referencia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		if (Direccion == null) {
			if (other.Direccion != null)
				return false;
		} else if (!Direccion.equals(other.Direccion))
			return false;
		if (IdCliente == null) {
			if (other.IdCliente != null)
				return false;
		} else if (!IdCliente.equals(other.IdCliente))
			return false;
		if (IdDireccion != other.IdDireccion)
			return false;
		if (IdDistrito == null) {
			if (other.IdDistrito != null)
				return false;
		} else if (!IdDistrito.equals(other.IdDistrito))
			return false;
		if (Interior == null) {
			if (other.Interior != null)
				return false;
		} else if (!Interior.equals(other.Interior))
			return false;
		if (Double.doubleToLongBits(Latitud) != Double.doubleToLongBits(other.Latitud))
			return false;
		if (Double.doubleToLongBits(Longitud) != Double.doubleToLongBits(other.Longitud))
			return false;
		if (Referencia == null) {
			if (other.Referencia != null)
				return false;
		} else if (!Referencia.equals(other.Referencia))
			return false;
		return true;
	}

	public long getIdDireccion() {
		return IdDireccion;
	}

	public void setIdDireccion(long idDireccion) {
		IdDireccion = idDireccion;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getReferencia() {
		return Referencia;
	}

	public void setReferencia(String referencia) {
		Referencia = referencia;
	}

	public String getInterior() {
		return Interior;
	}

	public void setInterior(String interior) {
		Interior = interior;
	}

	public double getLatitud() {
		return Latitud;
	}

	public void setLatitud(double latitud) {
		Latitud = latitud;
	}

	public double getLongitud() {
		return Longitud;
	}

	public void setLongitud(double longitud) {
		Longitud = longitud;
	}

	public Distrito getIdDistrito() {
		return IdDistrito;
	}

	public void setIdDistrito(Distrito idDistrito) {
		IdDistrito = idDistrito;
	}

	public Cliente getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		IdCliente = idCliente;
	}

}
