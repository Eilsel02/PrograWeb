package consulado.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetallePedido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdDetallePedido;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdPedido")
	private Pedido IdPedido;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdProducto")
	private Producto IdProducto;
	private int Cantidad;
	public DetallePedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetallePedido(long idDetallePedido, Pedido idPedido, Producto idProducto, int cantidad) {
		super();
		IdDetallePedido = idDetallePedido;
		IdPedido = idPedido;
		IdProducto = idProducto;
		Cantidad = cantidad;
	}
	
	
	
	
	@Override
	public String toString() {
		return "DetallePedido [IdDetallePedido=" + IdDetallePedido + ", IdPedido=" + IdPedido + ", IdProducto="
				+ IdProducto + ", Cantidad=" + Cantidad + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Cantidad;
		result = prime * result + (int) (IdDetallePedido ^ (IdDetallePedido >>> 32));
		result = prime * result + ((IdPedido == null) ? 0 : IdPedido.hashCode());
		result = prime * result + ((IdProducto == null) ? 0 : IdProducto.hashCode());
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
		DetallePedido other = (DetallePedido) obj;
		if (Cantidad != other.Cantidad)
			return false;
		if (IdDetallePedido != other.IdDetallePedido)
			return false;
		if (IdPedido == null) {
			if (other.IdPedido != null)
				return false;
		} else if (!IdPedido.equals(other.IdPedido))
			return false;
		if (IdProducto == null) {
			if (other.IdProducto != null)
				return false;
		} else if (!IdProducto.equals(other.IdProducto))
			return false;
		return true;
	}
	public long getIdDetallePedido() {
		return IdDetallePedido;
	}
	public void setIdDetallePedido(long idDetallePedido) {
		IdDetallePedido = idDetallePedido;
	}
	public Pedido getIdPedido() {
		return IdPedido;
	}
	public void setIdPedido(Pedido idPedido) {
		IdPedido = idPedido;
	}
	public Producto getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(Producto idProducto) {
		IdProducto = idProducto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	
}
