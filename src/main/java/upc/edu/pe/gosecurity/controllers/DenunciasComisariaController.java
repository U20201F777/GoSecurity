package upc.edu.pe.gosecurity.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upc.edu.pe.gosecurity.dtos.DenunciasComisariaDTO;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasComisariaService;

@RestController
@RequestMapping("/denunciascomisaria")
public class DenunciasComisariaController {
    @Autowired
    private IDenunciasComisariaService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasComisariaDTO dto){

    }
}
