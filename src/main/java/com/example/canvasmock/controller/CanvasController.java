package com.example.canvasmock.controller;

import com.example.canvasmock.dto.GenericDTO;
import com.example.canvasmock.repository.CanvaRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/canvas")
@Slf4j
public class CanvasController {
    CanvaRepo repo;

    public CanvasController(CanvaRepo repo) {
        this.repo = repo;
    }

    //create
    @PostMapping
    public GenericDTO createCanais(@RequestBody Map<Object, String> canal){
        Integer id = Integer.valueOf(canal.get("id"));
        String text_canais = canal.get("text_canais");

        repo.canais.put(id, text_canais);

        return new GenericDTO(id, repo.canais.get(id));
    }

    @GetMapping("/{id}")
    public GenericDTO getCanalById(@PathVariable Integer id){
        return new GenericDTO(id, repo.canais.get(id));
    }

    @GetMapping
    public List<GenericDTO> getAllCanais(){
        List<GenericDTO> response = new ArrayList<>();

        for(Integer id : repo.canais.keySet()){
            response.add(new GenericDTO(id, repo.canais.get(id)));
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public void deleteCanal(@PathVariable Integer id){
        repo.canais.remove(id);
    }

    @GetMapping("/canais/populate")
    public void populateCanais(){
        repo.populateCanais();
    }
}
