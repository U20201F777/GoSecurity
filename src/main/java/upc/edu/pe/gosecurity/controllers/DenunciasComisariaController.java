package upc.edu.pe.gosecurity.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.DenunciasComisariaDTO;
import upc.edu.pe.gosecurity.entities.DenunciasComisaria;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasComisariaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/denunciascomisaria")
public class DenunciasComisariaController {
    @Autowired
    private IDenunciasComisariaService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasComisariaDTO dto){
        ModelMapper m = new ModelMapper();
        DenunciasComisaria d=m.map(dto,DenunciasComisaria.class);
        pS.insert(d);
    }
    @GetMapping
    public List<DenunciasComisariaDTO>Listar(){
        return pS.LIST().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DenunciasComisariaDTO.class);
        }).collect(Collectors.toList());
    }
}
