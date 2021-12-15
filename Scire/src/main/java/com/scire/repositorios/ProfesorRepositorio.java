package com.scire.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.scire.entidades.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor,String> {
	@Query ("SELECT c FROM Profesor c WHERE c.nombre = :nombre")
	public Optional<Profesor> buscarPorNombre (@Param("nombre") String nombre);
//	@Query("SET FOREIGN_KEY_CHECKS = 0")
//	public void desactivarLlave();
//	@Query("SET FOREIGN_KEY_CHECKS = 1")
//	public void activarLlave();
}
