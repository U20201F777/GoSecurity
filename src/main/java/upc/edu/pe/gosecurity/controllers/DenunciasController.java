package upc.edu.pe.gosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.DenunciasDTO;
import upc.edu.pe.gosecurity.entities.Denuncias;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/denuncias")
public class DenunciasController {
    @Autowired
    private IDenunciasService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasDTO dto){
        ModelMapper m = new ModelMapper();
        Denuncias d=m.map(dto, Denuncias.class);
        pS.insert(d);
    }
    @GetMapping
    public List<DenunciasDTO> Listar(){
        return pS.LIST().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DenunciasDTO.class);
        }).collect(Collectors.toList());
    }
}
