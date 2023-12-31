package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.PColorDTO;
import upc.edu.pe.gosecurity.dtos.PMarcaDTO;
import upc.edu.pe.gosecurity.dtos.PModeloDTO;
import upc.edu.pe.gosecurity.entities.PertenenciasMarca;
import upc.edu.pe.gosecurity.entities.PertenenciasModelo;
import upc.edu.pe.gosecurity.serviceinterfaces.PMarcaInterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PertenenciaMarca")
public class PMarcaController {
    @Autowired
    private PMarcaInterfaces MarR;
    @PostMapping
    public void registrar(@RequestBody PMarcaDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasMarca p=m.map(dto,PertenenciasMarca.class);
        MarR.insert(p);
    }

    @GetMapping
    public List<PMarcaDTO> listar(){
        return MarR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PMarcaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id ){
        MarR.delete(id);
    }

    @GetMapping("/{id}")
    public PMarcaDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PMarcaDTO dto=m.map(MarR.ListId(id), PMarcaDTO.class);
        return dto;
    }
    @PostMapping("/buscar")
    public List<PMarcaDTO>buscar(@RequestBody String name){
        return MarR.findByNamePertenenciasMarca(name).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PMarcaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void Modificar(@RequestBody PMarcaDTO dto){
        ModelMapper m = new ModelMapper();
        PertenenciasMarca p=m.map(dto,PertenenciasMarca.class);
        MarR.insert(p);
    }

}
