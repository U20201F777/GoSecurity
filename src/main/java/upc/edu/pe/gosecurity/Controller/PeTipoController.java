package upc.edu.pe.gosecurity.Controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.PTipoDTO;
import upc.edu.pe.gosecurity.entities.PertenenciasTipo;
import upc.edu.pe.gosecurity.serviceinterfaces.PTipoInterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PertenenciaTipo")
public class PeTipoController {
    @Autowired
    private PTipoInterfaces TR;
    @PostMapping
    public void resgitrar(@RequestBody PTipoDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasTipo p=m.map(dto,PertenenciasTipo.class);
        TR.insert(p);
    }

    @GetMapping
    public List<PTipoDTO> listar(){
        return TR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PTipoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id ){
        TR.delete(id);
    }

    @GetMapping("/{id}")
    public PTipoDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PTipoDTO dto=m.map(TR.ListId(id), PTipoDTO.class);
        return dto;
    }
}
