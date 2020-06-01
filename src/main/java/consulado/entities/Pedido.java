package consulado.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdPedido;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdCliente")
	private Cliente IdCliente;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdDireccion")
	private Direccion IdDireccion;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdLocal")
	private Local IdLocal;
	@ManyToOne(optional = true)
	@JoinColumn(nullable = true, name = "IdEmpleado")
	private Empleado IdEmpleado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date FechaHoraPedido;
	@Temporal(TemporalType.TIMESTAMP)
	private Date FechaHoraPreparado;
	@Temporal(TemporalType.TIMESTAMP)
	private Date FechaHoraEntrega;
	@Temporal(TemporalType.TIMESTAMP)
	private Date FechaHoraCancelado;

	private double PrecioVenta;
	private double IGV;
	private double ValorVenta;
	private int IdEmpleadoDelivery;
	private String Observacion;

	
	private int Entregado;
	private int Cancelado;
	private int Preparado;

	
	public void TrimAllFields() {
		this.Observacion=this.Observacion.trim();
	}
	
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pedido(long idPedido, Cliente idCliente, Direccion idDireccion, Local idLocal, Empleado idEmpleado,
			Date fechaHoraPedido, Date fechaHoraPreparado, Date fechaHoraEntrega, Date fechaHoraCancelado,
			double precioVenta, double iGV, double valorVenta, int idEmpleadoDelivery, String observacion, int entregado,
			int cancelado, int preparado) {
		super();
		IdPedido = idPedido;
		IdCliente = idCliente;
		IdDireccion = idDireccion;
		IdLocal = idLocal;
		IdEmpleado = idEmpleado;
		FechaHoraPedido = fechaHoraPedido;
		FechaHoraPreparado = fechaHoraPreparado;
		FechaHoraEntrega = fechaHoraEntrega;
		FechaHoraCancelado = fechaHoraCancelado;
		PrecioVenta = precioVenta;
		IGV = iGV;
		ValorVenta = valorVenta;
		IdEmpleadoDelivery = idEmpleadoDelivery;
		Observacion = observacion;
		Entregado = entregado;
		Cancelado = cancelado;
		Preparado = preparado;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Cancelado;
		result = prime * result + IdEmpleadoDelivery;
		result = prime * result + Entregado;
		result = prime * result + ((FechaHoraCancelado == null) ? 0 : FechaHoraCancelado.hashCode());
		result = prime * result + ((FechaHoraEntrega == null) ? 0 : FechaHoraEntrega.hashCode());
		result = prime * result + ((FechaHoraPedido == null) ? 0 : FechaHoraPedido.hashCode());
		result = prime * result + ((FechaHoraPreparado == null) ? 0 : FechaHoraPreparado.hashCode());
		long temp;
		temp = Double.doubleToLongBits(IGV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((IdCliente == null) ? 0 : IdCliente.hashCode());
		result = prime * result + ((IdDireccion == null) ? 0 : IdDireccion.hashCode());
		result = prime * result + ((IdEmpleado == null) ? 0 : IdEmpleado.hashCode());
		result = prime * result + ((IdLocal == null) ? 0 : IdLocal.hashCode());
		result = prime * result + (int) (IdPedido ^ (IdPedido >>> 32));
		result = prime * result + ((Observacion == null) ? 0 : Observacion.hashCode());
		temp = Double.doubleToLongBits(PrecioVenta);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Preparado;
		temp = Double.doubleToLongBits(ValorVenta);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Pedido other = (Pedido) obj;
		if (Cancelado != other.Cancelado)
			return false;
		if (IdEmpleadoDelivery != other.IdEmpleadoDelivery)
			return false;
		if (Entregado != other.Entregado)
			return false;
		if (FechaHoraCancelado == null) {
			if (other.FechaHoraCancelado != null)
				return false;
		} else if (!FechaHoraCancelado.equals(other.FechaHoraCancelado))
			return false;
		if (FechaHoraEntrega == null) {
			if (other.FechaHoraEntrega != null)
				return false;
		} else if (!FechaHoraEntrega.equals(other.FechaHoraEntrega))
			return false;
		if (FechaHoraPedido == null) {
			if (other.FechaHoraPedido != null)
				return false;
		} else if (!FechaHoraPedido.equals(other.FechaHoraPedido))
			return false;
		if (FechaHoraPreparado == null) {
			if (other.FechaHoraPreparado != null)
				return false;
		} else if (!FechaHoraPreparado.equals(other.FechaHoraPreparado))
			return false;
		if (Double.doubleToLongBits(IGV) != Double.doubleToLongBits(other.IGV))
			return false;
		if (IdCliente == null) {
			if (other.IdCliente != null)
				return false;
		} else if (!IdCliente.equals(other.IdCliente))
			return false;
		if (IdDireccion == null) {
			if (other.IdDireccion != null)
				return false;
		} else if (!IdDireccion.equals(other.IdDireccion))
			return false;
		if (IdEmpleado == null) {
			if (other.IdEmpleado != null)
				return false;
		} else if (!IdEmpleado.equals(other.IdEmpleado))
			return false;
		if (IdLocal == null) {
			if (other.IdLocal != null)
				return false;
		} else if (!IdLocal.equals(other.IdLocal))
			return false;
		if (IdPedido != other.IdPedido)
			return false;
		if (Observacion == null) {
			if (other.Observacion != null)
				return false;
		} else if (!Observacion.equals(other.Observacion))
			return false;
		if (Double.doubleToLongBits(PrecioVenta) != Double.doubleToLongBits(other.PrecioVenta))
			return false;
		if (Preparado != other.Preparado)
			return false;
		if (Double.doubleToLongBits(ValorVenta) != Double.doubleToLongBits(other.ValorVenta))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pedido [IdPedido=" + IdPedido + ", IdCliente=" + IdCliente + ", IdDireccion=" + IdDireccion
				+ ", IdLocal=" + IdLocal + ", IdEmpleado=" + IdEmpleado + ", FechaHoraPedido=" + FechaHoraPedido
				+ ", FechaHoraPreparado=" + FechaHoraPreparado + ", FechaHoraEntrega=" + FechaHoraEntrega
				+ ", FechaHoraCancelado=" + FechaHoraCancelado + ", PrecioVenta=" + PrecioVenta + ", IGV=" + IGV
				+ ", ValorVenta=" + ValorVenta + ", IdEmpleadoDelivery=" + IdEmpleadoDelivery + ", Observacion=" + Observacion
				+ ", Entregado=" + Entregado + ", Cancelado=" + Cancelado + ", Preparado=" + Preparado + "]";
	}


	public long getIdPedido() {
		return IdPedido;
	}


	public void setIdPedido(long idPedido) {
		IdPedido = idPedido;
	}


	public Cliente getIdCliente() {
		return IdCliente;
	}


	public void setIdCliente(Cliente idCliente) {
		IdCliente = idCliente;
	}


	public Direccion getIdDireccion() {
		return IdDireccion;
	}


	public void setIdDireccion(Direccion idDireccion) {
		IdDireccion = idDireccion;
	}


	public Local getIdLocal() {
		return IdLocal;
	}


	public void setIdLocal(Local idLocal) {
		IdLocal = idLocal;
	}


	public Empleado getIdEmpleado() {
		return IdEmpleado;
	}


	public void setIdEmpleado(Empleado idEmpleado) {
		IdEmpleado = idEmpleado;
	}


	public Date getFechaHoraPedido() {
		return FechaHoraPedido;
	}


	public void setFechaHoraPedido(Date fechaHoraPedido) {
		FechaHoraPedido = fechaHoraPedido;
	}


	public Date getFechaHoraPreparado() {
		return FechaHoraPreparado;
	}


	public void setFechaHoraPreparado(Date fechaHoraPreparado) {
		FechaHoraPreparado = fechaHoraPreparado;
	}


	public Date getFechaHoraEntrega() {
		return FechaHoraEntrega;
	}


	public void setFechaHoraEntrega(Date fechaHoraEntrega) {
		FechaHoraEntrega = fechaHoraEntrega;
	}


	public Date getFechaHoraCancelado() {
		return FechaHoraCancelado;
	}


	public void setFechaHoraCancelado(Date fechaHoraCancelado) {
		FechaHoraCancelado = fechaHoraCancelado;
	}


	public double getPrecioVenta() {
		return PrecioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		PrecioVenta = precioVenta;
	}


	public double getIGV() {
		return IGV;
	}


	public void setIGV(double iGV) {
		IGV = iGV;
	}


	public double getValorVenta() {
		return ValorVenta;
	}


	public void setValorVenta(double valorVenta) {
		ValorVenta = valorVenta;
	}


	public int getIdEmpleadoDelivery() {
		return IdEmpleadoDelivery;
	}


	public void setIdEmpleadoDelivery(int idEmpleadoDelivery) {
		IdEmpleadoDelivery = idEmpleadoDelivery;
	}


	public String getObservacion() {
		return Observacion;
	}


	public void setObservacion(String observacion) {
		Observacion = observacion;
	}


	public int getEntregado() {
		return Entregado;
	}


	public void setEntregado(int entregado) {
		Entregado = entregado;
	}


	public int getCancelado() {
		return Cancelado;
	}


	public void setCancelado(int cancelado) {
		Cancelado = cancelado;
	}


	public int getPreparado() {
		return Preparado;
	}


	public void setPreparado(int preparado) {
		Preparado = preparado;
	}

	
	
	
}
