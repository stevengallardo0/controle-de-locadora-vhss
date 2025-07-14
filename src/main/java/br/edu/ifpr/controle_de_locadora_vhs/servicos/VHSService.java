package br.edu.ifpr.controledelocadoravhs.servicos;

import br.edu.ifpr.controledelocadoravhs.entidades.VHS;
import br.edu.ifpr.controledelocadoravhs.repositorios.VHSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VHSService {

    @Autowired
    private VHSRepository vhsRepository;

    public List<VHS> findAll() {
        return vhsRepository.findAll();
    }

    // Outros métodos: save, delete, findById etc.
}
