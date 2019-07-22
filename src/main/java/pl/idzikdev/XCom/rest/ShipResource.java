package pl.idzikdev.XCom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.entity.ShipEntity;
import pl.idzikdev.XCom.mapper.AlienResultToAlienEntityConverter;
import pl.idzikdev.XCom.mapper.ShipResultToShipEntityConverter;
import pl.idzikdev.XCom.repository.ShipRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(AlienConstans.SHIP_V1)
@CrossOrigin
public class ShipResource {
    @Autowired
    ShipRepository shipRepository;

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ShipEntity>> getShips() {
        List<ShipEntity> shipList = shipRepository.findAll();
        return new ResponseEntity<>(shipList, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ShipEntity> getShipById(
            @PathVariable Integer id
    ) {
        Optional<ShipEntity> shipEntityOptional = shipRepository.findById(id);
        if (shipEntityOptional.isPresent()) return new ResponseEntity<>(shipEntityOptional.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<ShipEntity> addShip(
            @RequestBody ShipEntity shipEntity) {
        ShipEntity result=ShipResultToShipEntityConverter.convert(shipEntity, shipEntity);
        return new ResponseEntity<>(shipRepository.save(result), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ShipEntity> updateShip(
            @PathVariable Integer id,
            @RequestBody ShipEntity shipEntity) {
        Optional<ShipEntity> shipResult = shipRepository.findById(id);
        if (shipResult.isPresent()) {
            ShipEntity result=ShipResultToShipEntityConverter.convert(shipEntity, shipResult.get());
            shipRepository.save(result);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<ShipEntity> deleteShip(
            @PathVariable Integer id) {
        Optional<ShipEntity> shipResult = shipRepository.findById(id);
        if (shipResult.isPresent()) {
            shipRepository.delete(shipResult.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
