package consulado.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdCliente;
	private String Nombres;
	private String Apellidos;
	private String Telefono;
	private String Email;
	private int IdDireccionPreferida;
	private int IdTarjetaPreferia;
	private int TipoDocumento;	
	private String NumeroDocumento;
	
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdUsuario")
	private Usuario IdUsuario;

	public void TrimAllFields() {
		this.Nombres=this.Nombres.trim();
		this.Apellidos=this.Apellidos.trim();
		this.Telefono=this.Telefono.trim();
		this.Email=this.Email.trim();
		this.NumeroDocumento=this.NumeroDocumento.trim();
		
	}
	
	
	public Cliente() {	
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(long idCliente, String nombres, String apellidos, String telefono, String email,
			int idDireccionPreferida, int idTarjetaPreferia, int tipoDocumento, String numeroDocumento,
			Usuario idUsuario) {
		super();
		IdCliente = idCliente;
		Nombres = nombres;
		Apellidos = apellidos;
		Telefono = telefono;
		Email = email;
		IdDireccionPreferida = idDireccionPreferida;
		IdTarjetaPreferia = idTarjetaPreferia;
		TipoDocumento = tipoDocumento;
		NumeroDocumento = numeroDocumento;
		IdUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "Cliente [IdCliente=" + IdCliente + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Telefono="
				+ Telefono + ", Email=" + Email + ", IdDireccionPreferida=" + IdDireccionPreferida
				+ ", IdTarjetaPreferia=" + IdTarjetaPreferia + ", TipoDocumento=" + TipoDocumento + ", NumeroDocumento="
				+ NumeroDocumento + ", IdUsuario=" + IdUsuario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellidos == null) ? 0 : Apellidos.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + (int) (IdCliente ^ (IdCliente >>> 32));
		result = prime * result + IdDireccionPreferida;
		result = prime * result + IdTarjetaPreferia;
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
		Cliente other = (Cliente) obj;
		if (Apellidos == null) {
			if (other.Apellidos != null)
				return false;
		} else if (!Apellidos.equals(other.Apellidos))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (IdCliente != other.IdCliente)
			return false;
		if (IdDireccionPreferida != other.IdDireccionPreferida)
			return false;
		if (IdTarjetaPreferia != other.IdTarjetaPreferia)
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

	public long getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(long idCliente) {
		IdCliente = idCliente;
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

	public int getIdDireccionPreferida() {
		return IdDireccionPreferida;
	}

	public void setIdDireccionPreferida(int idDireccionPreferida) {
		IdDireccionPreferida = idDireccionPreferida;
	}

	public int getIdTarjetaPreferia() {
		return IdTarjetaPreferia;
	}

	public void setIdTarjetaPreferia(int idTarjetaPreferia) {
		IdTarjetaPreferia = idTarjetaPreferia;
	}

	public int getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return NumeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		NumeroDocumento = numeroDocumento;
	}

	public Usuario getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		IdUsuario = idUsuario;
	}

	
}
