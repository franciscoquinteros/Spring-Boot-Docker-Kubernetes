package com.myself.springcloud.msvc.cursos.services;

import com.myself.springcloud.msvc.cursos.models.Usuario;
import com.myself.springcloud.msvc.cursos.models.entity.Curso;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

//logica de negocios en Service.

public interface CursoService {

    List<Curso> list();
    Optional<Curso> perId(Long id);
    Optional<Curso> porIdConUsuarios(Long id);
    Curso save(Curso curso);
    void delete(Long id);


    @Transactional
    void eliminarCursoUsuarioPorId(Long id);

    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> deleteUsuario(Usuario usuario, Long cursoId);
}
