package com.myself.springcloud.msvc.cursos.clients;

import com.myself.springcloud.msvc.cursos.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "msvc-usuarios", url = "msvc-usuarios:8001")
public interface UsuarioClientRest {

    @GetMapping("/{id}")
    Usuario details(@PathVariable Long id);

    @PostMapping("/")
    Usuario create(@RequestBody Usuario usuario);

    @GetMapping("/usuarios-por-curso")
    List<Usuario> obtenerAlmunosPorCurso(@RequestParam Iterable<Long> ids);

}
