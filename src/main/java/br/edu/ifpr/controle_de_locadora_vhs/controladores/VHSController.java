package br.edu.ifpr.controledelocadoravhs.controladores;

import br.edu.ifpr.controledelocadoravhs.servicos.VHSService;
import br.edu.ifpr.controledelocadoravhs.entidades.VHS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/vhs")
public class VHSController {

    @Autowired
    private VHSService vhsService;

    @GetMapping
    public String findAll(Model model) {
        List<VHS> lista = vhsService.findAll();
        model.addAttribute("vhsList", lista);
        return "vhs-list";
    }
}
    