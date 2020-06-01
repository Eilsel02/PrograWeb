package consulado.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdProducto;
	private String Producto;
	private String Descripcion;
	private String Imagen;
	private int Activado;
	private double Precio;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdCategoria")
	private Categoria IdCategoria;

	public void TrimAllFields() {
		this.Producto=this.Producto.trim();
		this.Descripcion=this.Descripcion.trim();
		this.Imagen=this.Imagen.trim();	
	}
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(long idProducto, String producto, String descripcion, String imagen, int activado, double precio,
			Categoria idCategoria) {
		super();
		IdProducto = idProducto;
		Producto = producto;
		Descripcion = descripcion;
		Imagen = imagen;
		Activado = activado;
		Precio = precio;
		IdCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "Producto [IdProducto=" + IdProducto + ", Producto=" + Producto + ", Descripcion=" + Descripcion
				+ ", Imagen=" + Imagen + ", Activado=" + Activado + ", Precio=" + Precio + ", IdCategoria="
				+ IdCategoria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Activado;
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + ((IdCategoria == null) ? 0 : IdCategoria.hashCode());
		result = prime * result + (int) (IdProducto ^ (IdProducto >>> 32));
		result = prime * result + ((Imagen == null) ? 0 : Imagen.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Producto == null) ? 0 : Producto.hashCode());
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
		Producto other = (Producto) obj;
		if (Activado != other.Activado)
			return false;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (IdCategoria == null) {
			if (other.IdCategoria != null)
				return false;
		} else if (!IdCategoria.equals(other.IdCategoria))
			return false;
		if (IdProducto != other.IdProducto)
			return false;
		if (Imagen == null) {
			if (other.Imagen != null)
				return false;
		} else if (!Imagen.equals(other.Imagen))
			return false;
		if (Double.doubleToLongBits(Precio) != Double.doubleToLongBits(other.Precio))
			return false;
		if (Producto == null) {
			if (other.Producto != null)
				return false;
		} else if (!Producto.equals(other.Producto))
			return false;
		return true;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public long getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(long idProducto) {
		IdProducto = idProducto;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getActivado() {
		return Activado;
	}

	public void setActivado(int activado) {
		Activado = activado;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public Categoria getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		IdCategoria = idCategoria;
	}

}
