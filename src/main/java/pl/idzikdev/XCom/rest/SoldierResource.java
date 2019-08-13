package pl.idzikdev.XCom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.entity.SoldierEntity;
import pl.idzikdev.XCom.mapper.SoldierResultToSoldierEntityConverter;
import pl.idzikdev.XCom.repository.SoldierRepository;
import pl.idzikdev.XCom.tools.SoldierToDos;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(AlienConstans.SOLDIER_V1)
@CrossOrigin
public class SoldierResource {
    @Autowired
    SoldierRepository soldierRepository;

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<SoldierEntity>> getSoldiers() {
        List<SoldierEntity> alienList = soldierRepository.findAll();
        return new ResponseEntity<>(alienList, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SoldierEntity> getSoldierById(
            @PathVariable Integer id
    ) {
        Optional<SoldierEntity> soldierEntityOptional = soldierRepository.findById(id);
        if (soldierEntityOptional.isPresent()) return new ResponseEntity<>(soldierEntityOptional.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<SoldierEntity> addSoldier(
            @RequestBody SoldierEntity soldierEntity) {
        SoldierEntity newSoldier=new SoldierEntity();
        return new ResponseEntity<>(soldierRepository.save(SoldierResultToSoldierEntityConverter.convert(soldierEntity,newSoldier)), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<SoldierEntity> updateSoldier(
            @PathVariable Integer id,
            @RequestBody SoldierEntity soldierEntity) {
        Optional<SoldierEntity> soldierResult = soldierRepository.findById(id);
        if (soldierResult.isPresent()) {
            soldierRepository.save(SoldierResultToSoldierEntityConverter.convert(soldierEntity,soldierResult.get()));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<SoldierEntity> deleteSoldier(
            @PathVariable Integer id) {
        Optional<SoldierEntity> soldierResult = soldierRepository.findById(id);
        if (soldierResult.isPresent()) {
            soldierRepository.delete(soldierResult.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "",method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAllSoldiers(){
        soldierRepository.deleteAll();
        SoldierToDos.deleteNames();
        String names[]={"american","british","french","german","japanese","russian"};
        for (String name:names
        ) {
            SoldierToDos.fillNames(name);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
