package consulado.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdEmpleado;
	private String Nombres;
	private String Apellidos;
	private String NumeroDocumento;
	private String Telefono;
	private String Email;
	private int TipoDocumento;
	private int TipoEmpleado;
	/* TipoEmpleado
	 * 1=Administración
	 * 2=Cocina
	 * 3=AtenciónPúblico
	 * 4=Delivery	 * 
	 */
	
	
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdUsuario")
	private Usuario IdUsuario;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdLocal")
	private Local IdLocal;
	
	public void TrimAllFields() {
		this.Nombres=this.Nombres.trim();
		this.Apellidos=this.Apellidos.trim();
		this.Telefono=this.Telefono.trim();
		this.Email=this.Email.trim();
		this.NumeroDocumento=this.NumeroDocumento.trim();
		
	}
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(long idEmpleado, String nombres, String apellidos, String numeroDocumento, String telefono,
			String email, int tipoDocumento, int tipoempleado, int administrador, Usuario idUsuario, Local idLocal) {
		super();
		IdEmpleado = idEmpleado;
		Nombres = nombres;
		Apellidos = apellidos;
		NumeroDocumento = numeroDocumento;
		Telefono = telefono;
		Email = email;
		TipoDocumento = tipoDocumento;
		TipoEmpleado = tipoempleado;
		IdUsuario = idUsuario;
		IdLocal = idLocal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellidos == null) ? 0 : Apellidos.hashCode());
		result = prime * result + TipoEmpleado;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + (int) (IdEmpleado ^ (IdEmpleado >>> 32));
		result = prime * result + ((IdLocal == null) ? 0 : IdLocal.hashCode());
		result = prime * result + ((IdUsuario == null) ? 0 : IdUsuario.hashCode());
		result = prime * result + ((Nombres == null) ? 0 : Nombres.hashCode());
		result = prime * result + ((NumeroDocumento == null) ? 0 : NumeroDocumento.hashCode());
		result = prime * result + ((Telefono == null) ? 0 : Telefono.hashCode());
		result = prime * result + TipoDocumento;
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
		Empleado other = (Empleado) obj;
		if (Apellidos == null) {
			if (other.Apellidos != null)
				return false;
		} else if (!Apellidos.equals(other.Apellidos))
			return false;
		if (TipoEmpleado != other.TipoEmpleado)
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (IdEmpleado != other.IdEmpleado)
			return false;
		if (IdLocal == null) {
			if (other.IdLocal != null)
				return false;
		} else if (!IdLocal.equals(other.IdLocal))
			return false;
		if (IdUsuario == null) {
			if (other.IdUsuario != null)
				return false;
		} else if (!IdUsuario.equals(other.IdUsuario))
			return false;
		if (Nombres == null) {
			if (other.Nombres != null)
				return false;
		} else if (!Nombres.equals(other.Nombres))
			return false;
		if (NumeroDocumento == null) {
			if (other.NumeroDocumento != null)
				return false;
		} else if (!NumeroDocumento.equals(other.NumeroDocumento))
			return false;
		if (Telefono == null) {
			if (other.Telefono != null)
				return false;
		} else if (!Telefono.equals(other.Telefono))
			return false;
		if (TipoDocumento != other.TipoDocumento)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado [IdEmpleado=" + IdEmpleado + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos
				+ ", NumeroDocumento=" + NumeroDocumento + ", Telefono=" + Telefono + ", Email=" + Email
				+ ", TipoDocumento=" + TipoDocumento + ", Delivery=" + TipoEmpleado
				+ ", IdUsuario=" + IdUsuario + ", IdLocal=" + IdLocal + "]";
	}

	public long getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(long idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNumeroDocumento() {
		return NumeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		NumeroDocumento = numeroDocumento;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public int getDelivery() {
		return TipoEmpleado;
	}

	public void setDelivery(int delivery) {
		TipoEmpleado = delivery;
	}

	public Usuario getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		IdUsuario = idUsuario;
	}

	public Local getIdLocal() {
		return IdLocal;
	}

	public void setIdLocal(Local idLocal) {
		IdLocal = idLocal;
	}

	
}
