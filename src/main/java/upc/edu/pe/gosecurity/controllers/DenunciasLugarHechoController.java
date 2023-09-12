package upc.edu.pe.gosecurity.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upc.edu.pe.gosecurity.dtos.DenunciasLugarHechoDTO;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasLugarHechoService;

@RestController
@RequestMapping("/denunciaslugarhecho")

public class DenunciasLugarHechoController {
    @Autowired
    private IDenunciasLugarHechoService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasLugarHechoDTO dto){

    }
}
