package consulado.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import consulado.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query("select u from Usuario u where u.usuario=?1")
	List<Usuario> findByUsuario(String usuario);
	@Query("select u from Usuario u where u.idusuario=?1")
	List<Usuario> findByIdUsuario(Long idUsuario);
}
