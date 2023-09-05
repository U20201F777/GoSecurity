package upc.edu.pe.gosecurity.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.PoliciaDTO;
import upc.edu.pe.gosecurity.entities.Policia;
import upc.edu.pe.gosecurity.serviceinterfaces.IPoliciaService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Policia")
public class PoliciaControllers {

    @Autowired
    private IPoliciaService pS;
    @PostMapping
    public void Registrar(@RequestBody PoliciaDTO dto){
        ModelMapper m= new ModelMapper();
        Policia p=m.map(dto, Policia.class);
        pS.insert(p);
    }
    @GetMapping
    public List<PoliciaDTO> list() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PoliciaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PoliciaDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PoliciaDTO dto = m.map(pS.listId(id), PoliciaDTO.class);
        return dto;
    }

}
