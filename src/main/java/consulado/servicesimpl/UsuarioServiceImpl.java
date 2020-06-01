package consulado.servicesimpl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import consulado.entities.Usuario;
import consulado.repositories.UsuarioRepository;
import consulado.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}

	@Override
	public List<Usuario> listAll() {
		return (List<Usuario>)usuarioRepository.findAll();
	}

	@Override
	public Usuario findByIdUsuario(Long idUsuario) {
		List<Usuario> usuarios=usuarioRepository.findByIdUsuario(idUsuario);
		if (usuarios==null) {
			return null;
		} else {
			return usuarios.get(0);
		}
	}

	@Override
	public Usuario findByUsario(String usuario) {
		List<Usuario> usuarios=usuarioRepository.findByUsuario(usuario);
		if (usuarios==null) {
			return null;
		} else {
			return usuarios.get(0);
		}
	}

	@Override
	public Usuario validaUsuarioPassword(String usuario, String password) {
		Usuario usuario_valido=findByUsario(usuario);
		if (usuario_valido==null) {
			return null;
		} else {
			if (usuario_valido.getPassword()==password) {
				return usuario_valido;
			} else {
				return null;
			}
		}
	}

}
