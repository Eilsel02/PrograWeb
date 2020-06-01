package consulado.services;

import java.util.List;

import consulado.entities.Usuario;

public interface UsuarioService {
	   public Usuario save(Usuario usuario);
	   public void delete(Usuario usuario);

	   public List<Usuario> listAll();
	   public Usuario findByIdUsuario(Long idUsuario);
	   public Usuario findByUsario(String usuario); 
	   
	   public Usuario validaUsuarioPassword(String usuario, String password);
}
