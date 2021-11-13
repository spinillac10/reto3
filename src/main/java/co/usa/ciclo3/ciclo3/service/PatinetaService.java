package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.patineta;
import co.usa.ciclo3.ciclo3.repository.PapeleriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatinetaService {

    @Autowired
    private PapeleriaRepository papeleriaRepository;

    public List<patineta> getAll(){
        return papeleriaRepository.getAll();
    }

    public Optional<patineta> getPatineta(int id){
        return papeleriaRepository.getPatineta(id);
    }

    public patineta save(patineta p){
        if(p.getId()==null){
            return papeleriaRepository.save(p);
        }else{
            Optional<patineta> paux = papeleriaRepository.getPatineta(p.getId());
            if(paux.isEmpty()){
                return  papeleriaRepository.save(p);
            }else{
                return  p;
            }
        }
    }
}
