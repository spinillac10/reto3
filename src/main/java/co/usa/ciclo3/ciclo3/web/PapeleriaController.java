package co.usa.ciclo3.ciclo3.web;

import co.usa.ciclo3.ciclo3.model.patineta;
import co.usa.ciclo3.ciclo3.service.PatinetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Papeleria")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class PapeleriaController {

    @Autowired
    private PatinetaService patinetaService;

    @GetMapping("/all")
    public List<patineta> getPatinetas(){
        return  patinetaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<patineta> getPatinenta(@PathVariable("id") int id){
        return patinetaService.getPatineta(id);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public patineta save(@RequestBody patineta p){ //petision q llega de json
        return patinetaService.save(p);
    }
}
