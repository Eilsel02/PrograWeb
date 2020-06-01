package consulado.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdUsuario;
	private String Usuario;
	private String Password;
	private int Tipo;
	private int SuperAdmin;

	public void TrimAllFields() {
		this.Usuario=this.Usuario.trim();
		this.Password=this.Password.trim();
	}

	@Override
	public String toString() {
		return "Usuario [IdUsuario=" + IdUsuario + ", Usuario=" + Usuario + ", Password=" + Password + ", Tipo=" + Tipo
				+ ", SuperAdmin=" + SuperAdmin + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + SuperAdmin;
		result = prime * result + (int) (IdUsuario ^ (IdUsuario >>> 32));
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + Tipo;
		result = prime * result + ((Usuario == null) ? 0 : Usuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (SuperAdmin != other.SuperAdmin)
			return false;
		if (IdUsuario != other.IdUsuario)
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (Tipo != other.Tipo)
			return false;
		if (Usuario == null) {
			if (other.Usuario != null)
				return false;
		} else if (!Usuario.equals(other.Usuario))
			return false;
		return true;
	}


	public Usuario(long idUsuario, String usuario, String password, int tipo, int superAdmin) {
		super();
		IdUsuario = idUsuario;
		Usuario = usuario;
		Password = password;
		Tipo = tipo;
		SuperAdmin = superAdmin;
	}


	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getSuperAdmin() {
		return SuperAdmin;
	}

	public void setSuperAdmin(int superAdmin) {
		SuperAdmin = superAdmin;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}

	
}
