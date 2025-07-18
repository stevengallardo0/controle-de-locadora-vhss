package br.edu.ifpr.controledelocadoravhs.repositorios;

import br.edu.ifpr.controledelocadoravhs.entidades.VHS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VHSRepository extends JpaRepository<VHS, Long> {
}
