package upc.edu.pe.gosecurity.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.gosecurity.dtos.UbicacionDTO;
import upc.edu.pe.gosecurity.entities.Ubicacion;
import upc.edu.pe.gosecurity.serviceinterfaces.IUbicacionService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ubicacion")
public class UbicacionControllers {
    @Autowired
    private IUbicacionService uS;
    @PostMapping
    public void Registrar(@RequestBody UbicacionDTO dto){
        ModelMapper m= new ModelMapper();
        Ubicacion p=m.map(dto, Ubicacion.class);
        uS.insert(p);
    }
    @GetMapping
    public List<UbicacionDTO> list() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UbicacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UbicacionDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UbicacionDTO dto = m.map(uS.listId(id), UbicacionDTO.class);
        return dto;
    }
}
