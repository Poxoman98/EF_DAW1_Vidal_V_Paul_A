package pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.dto.CarDto;
import pe.edu.cibertec.DAWI_VIDAL_VIVANCO_PAUL_ANDRE.service.ManageService;

import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    ManageService manageService;

    @GetMapping("/start")
    public String start(Model model) {

        try {
            List<CarDto> cars = manageService.getAllCars();
            model.addAttribute("cars", cars);
            model.addAttribute("error",null);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error","No se obtuvieron los datos debido a un error");
        }

        return "manage";
    }

}
