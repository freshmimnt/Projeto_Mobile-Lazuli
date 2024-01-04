package pt.iade.projetomobilelazuli.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.iade.projetomobilelazuli.models.curso.Curso;
import pt.iade.projetomobilelazuli.models.curso.CursoRepository;
import pt.iade.projetomobilelazuli.models.uc.UC;
import pt.iade.projetomobilelazuli.models.uc.UCDao;
import pt.iade.projetomobilelazuli.models.uc.UCRepository;
import pt.iade.projetomobilelazuli.models.user.Utilizador;
import pt.iade.projetomobilelazuli.models.user.UtilizadorRepository;

import java.util.List;

@RestController
public class UCController {
    @Autowired
    private UCDao ucDao;

    @Autowired
    private UCRepository ucRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private UtilizadorRepository utilizadorRepository;

    private Curso curso;

    private Utilizador utilizador;

    @GetMapping("/uc/get")
    public List<UC> getAllUCs(){

        return (List<UC>) ucRepository.findAll();
    }

    @PostMapping("/uc/save")
    public void save(@RequestBody UC uc){

        ucRepository.save(uc);
    }

    @PutMapping("/uc/update/{id}")
    public void update(@PathVariable("id") int id, @RequestBody UC updatedUC) {
        UC existingUC = ucRepository.findById(id);
        existingUC.setName(updatedUC.getName());
        existingUC.setSala(updatedUC.getSala());
        existingUC.setProf(updatedUC.getProf());
        existingUC.setDesc(updatedUC.getDesc());
        ucRepository.save(existingUC);
    }

    @DeleteMapping("/uc/delete/{id}")
    public void delete(@PathVariable int id){
        ucRepository.deleteById(id);
    }

}