package Services;

import Models.AlunoModel;
import Repositeries.AlunoRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepositry alunoRepositry;

    public AlunoModel criarAluno(AlunoModel alunoModel){
        return alunoRepositry.save(alunoModel);
    }

    public List<AlunoModel> findAll(){
        return alunoRepositry.findAll();
    }

    public void deletarAluno(Long id){
        alunoRepositry.deleteById(id);
    }
}