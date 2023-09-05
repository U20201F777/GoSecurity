package pe.edu.upc.gosecurity.demogosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.gosecurity.demogosecurity.dtos.CiudadanoDTO;
import pe.edu.upc.gosecurity.demogosecurity.entities.Ciudadano;
import pe.edu.upc.gosecurity.demogosecurity.serviceinterfaces.ICiudadanoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("ciudadano")
public class CiudadanoController {

    @Autowired
    private ICiudadanoService cS;
    @PostMapping
    public void registrar(@RequestBody Ciudadano dto){
        ModelMapper m= new ModelMapper();
        Ciudadano c=m.map(dto, Ciudadano.class);
        cS.insert(c);
    }
    @GetMapping
    public List<CiudadanoDTO> listar() {
        return cS.list().stream().map(x ->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CiudadanoDTO.class);
        }).collect(Collectors.toList());
    }

}
