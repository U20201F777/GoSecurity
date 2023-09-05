package pe.edu.upc.gosecurity.demogosecurity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.gosecurity.demogosecurity.dtos.PoliciaDTO;
import pe.edu.upc.gosecurity.demogosecurity.entities.Policia;
import pe.edu.upc.gosecurity.demogosecurity.serviceinterfaces.IPoliciaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("policia")
public class PoliciaController {

    @Autowired
    private IPoliciaService pS;
    @PostMapping
    public void registrar(@RequestBody Policia dto){
        ModelMapper m= new ModelMapper();
        Policia p=m.map(dto, Policia.class);
        pS.insert(p);
    }
    @GetMapping
    public List<PoliciaDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PoliciaDTO.class);
        }).collect(Collectors.toList());
    }
}
