package consulado.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Distrito implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdDistrito;
	private String Distrito;
	@ManyToOne
	@JoinColumn(nullable = true, name = "IdLocal")
	private Local IdLocal;
	
	public void TrimAllFields() {
		this.Distrito=this.Distrito.trim();	
	}
	
	
	
	@Override
	public String toString() {
		return "Distrito [IdDistrito=" + IdDistrito + ", Distrito=" + Distrito + ", IdLocal=" + IdLocal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Distrito == null) ? 0 : Distrito.hashCode());
		result = prime * result + (int) (IdDistrito ^ (IdDistrito >>> 32));
		result = prime * result + ((IdLocal == null) ? 0 : IdLocal.hashCode());
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
		Distrito other = (Distrito) obj;
		if (Distrito == null) {
			if (other.Distrito != null)
				return false;
		} else if (!Distrito.equals(other.Distrito))
			return false;
		if (IdDistrito != other.IdDistrito)
			return false;
		if (IdLocal == null) {
			if (other.IdLocal != null)
				return false;
		} else if (!IdLocal.equals(other.IdLocal))
			return false;
		return true;
	}
	public long getIdDistrito() {
		return IdDistrito;
	}
	public void setIdDistrito(long idDistrito) {
		IdDistrito = idDistrito;
	}
	public String getDistrito() {
		return Distrito;
	}
	public void setDistrito(String distrito) {
		Distrito = distrito;
	}
	public Local getIdLocal() {
		return IdLocal;
	}
	public void setIdLocal(Local idLocal) {
		IdLocal = idLocal;
	}
	
	public Distrito(long idDistrito, String distrito, Local idLocal) {
		super();
		IdDistrito = idDistrito;
		Distrito = distrito;
		IdLocal = idLocal;
	}
	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
