package upc.edu.pe.gosecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upc.edu.pe.gosecurity.dtos.DenunciasTipificacion;
import upc.edu.pe.gosecurity.serviceinterfaces.IDenunciasTipificacionService;

@RestController
@RequestMapping("/denunciastipificacion")
public class DenunciasTipificacionController {
    @Autowired
    private IDenunciasTipificacionService pS;
    @PostMapping
    public void registrar(@RequestBody DenunciasTipificacion dto){

    }
}
