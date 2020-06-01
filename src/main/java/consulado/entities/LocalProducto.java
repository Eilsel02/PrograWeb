package consulado.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LocalProducto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdLocalProducto;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdProducto")
	private Producto IdProducto;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdLocal")
	private Local IdLocal;
	private int Stock;
	
	public LocalProducto(long idLocalProducto, Producto idProducto, Local idLocal, int stock) {
		super();
		IdLocalProducto = idLocalProducto;
		IdProducto = idProducto;
		IdLocal = idLocal;
		Stock = stock;
	}

	public LocalProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IdLocal == null) ? 0 : IdLocal.hashCode());
		result = prime * result + (int) (IdLocalProducto ^ (IdLocalProducto >>> 32));
		result = prime * result + ((IdProducto == null) ? 0 : IdProducto.hashCode());
		result = prime * result + Stock;
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
		LocalProducto other = (LocalProducto) obj;
		if (IdLocal == null) {
			if (other.IdLocal != null)
				return false;
		} else if (!IdLocal.equals(other.IdLocal))
			return false;
		if (IdLocalProducto != other.IdLocalProducto)
			return false;
		if (IdProducto == null) {
			if (other.IdProducto != null)
				return false;
		} else if (!IdProducto.equals(other.IdProducto))
			return false;
		if (Stock != other.Stock)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LocalProducto [IdLocalProducto=" + IdLocalProducto + ", IdProducto=" + IdProducto + ", IdLocal="
				+ IdLocal + ", Stock=" + Stock + "]";
	}

	public long getIdLocalProducto() {
		return IdLocalProducto;
	}

	public void setIdLocalProducto(long idLocalProducto) {
		IdLocalProducto = idLocalProducto;
	}

	public Producto getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(Producto idProducto) {
		IdProducto = idProducto;
	}

	public Local getIdLocal() {
		return IdLocal;
	}

	public void setIdLocal(Local idLocal) {
		IdLocal = idLocal;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	
	
	
}
