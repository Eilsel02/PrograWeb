package consulado.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdCategoria;
	private String Categoria;

	public void TrimAllFields() {
		this.Categoria=this.Categoria.trim();
	}
	
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(long idCategoria, String categoria) {
		super();
		IdCategoria = idCategoria;
		Categoria = categoria;
	}

	

	

	@Override
	public String toString() {
		return "Categoria [IdCategoria=" + IdCategoria + ", Categoria=" + Categoria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Categoria == null) ? 0 : Categoria.hashCode());
		result = prime * result + (int) (IdCategoria ^ (IdCategoria >>> 32));
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
		Categoria other = (Categoria) obj;
		if (Categoria == null) {
			if (other.Categoria != null)
				return false;
		} else if (!Categoria.equals(other.Categoria))
			return false;
		if (IdCategoria != other.IdCategoria)
			return false;
		return true;
	}

	public long getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

}
