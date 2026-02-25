package Repositeries;

import Models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositry extends JpaRepository<AlunoModel, Long> {
}