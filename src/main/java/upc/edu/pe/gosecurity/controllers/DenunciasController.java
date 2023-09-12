package upc.edu.pe.gosecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upc.edu.pe.gosecurity.dtos.DenunciasDTO;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasService;

@RestController
@RequestMapping("/denuncias")
public class DenunciasController {
    @Autowired
    private IDenunciasService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasDTO dto){

    }
}
