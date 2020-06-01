package consulado.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Local implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdLocal;
	private String Local;
	
	public void TrimAllFields() {
		this.Local=this.Local.trim();
	}
	
	public Local() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Local(long idLocal, String local) {
		super();
		IdLocal = idLocal;
		Local = local;
	}



	





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (IdLocal ^ (IdLocal >>> 32));
		result = prime * result + ((Local == null) ? 0 : Local.hashCode());
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
		Local other = (Local) obj;
		if (IdLocal != other.IdLocal)
			return false;
		if (Local == null) {
			if (other.Local != null)
				return false;
		} else if (!Local.equals(other.Local))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Local [IdLocal=" + IdLocal + ", Local=" + Local +"]";
	}



	public long getIdLocal() {
		return IdLocal;
	}



	public void setIdLocal(long idLocal) {
		IdLocal = idLocal;
	}



	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}



}
