package pl.idzikdev.XCom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.mapper.AlienResultToAlienEntityConverter;
import pl.idzikdev.XCom.repository.AlienRepository;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(AlienConstans.ALIEN_V1)
@CrossOrigin
public class AlienResource {
    @Autowired
    AlienRepository alienRepository;

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<AlienEntity>> getAliens() {
        List<AlienEntity> alienList = alienRepository.findAll();
        return new ResponseEntity<>(alienList, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AlienEntity> getAlienById(
            @PathVariable String id
    ) {
        Optional<AlienEntity> alienEntityOptional = alienRepository.findById(Integer.valueOf(id));
        if (alienEntityOptional.isPresent()) return new ResponseEntity<>(alienEntityOptional.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<AlienEntity> addAlien(
            @RequestBody AlienEntity alienEntity) {
        AlienEntity newAlien=new AlienEntity();
        return new ResponseEntity<>(alienRepository.save(AlienResultToAlienEntityConverter.convert(alienEntity,newAlien)), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<AlienEntity> updateAlien(
            @PathVariable Integer id,
            @RequestBody AlienEntity alienEntity) {
        Optional<AlienEntity> alienResult = alienRepository.findById(id);
        if (alienResult.isPresent()) {
            alienRepository.save(AlienResultToAlienEntityConverter.convert(alienEntity,alienResult.get()));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


        //TODO a co z podmianą statków??
        //TODO niech puty zwracają zmienioną klasę
    }


    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<AlienEntity> deleteAlien(
            @PathVariable Integer id) {
        Optional<AlienEntity> alienResult = alienRepository.findById(id);
        if (alienResult.isPresent()) {
            alienRepository.delete(alienResult.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "",method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteAllAliens(){
        alienRepository.deleteAll();
        return new ResponseEntity(HttpStatus.OK);
    }
}
