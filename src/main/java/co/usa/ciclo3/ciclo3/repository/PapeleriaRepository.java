package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.patineta;
import co.usa.ciclo3.ciclo3.repository.crud.PatinetaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PapeleriaRepository {
    @Autowired
    private PatinetaCrudRepository patinetaCrudRepository;

    public List<patineta> getAll(){
        return (List<patineta>) patinetaCrudRepository.findAll();
    }

    public Optional<patineta> getPatineta(int id){
        return  patinetaCrudRepository.findById(id);
    }

    public patineta save(patineta p){
        return patinetaCrudRepository.save(p);
    }

}
