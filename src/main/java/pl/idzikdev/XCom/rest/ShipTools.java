package pl.idzikdev.XCom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.entity.ShipEntity;
import pl.idzikdev.XCom.mapper.ShipResultToShipEntityConverter;
import pl.idzikdev.XCom.repository.AlienRepository;
import pl.idzikdev.XCom.repository.ShipRepository;
import pl.idzikdev.XCom.tools.ShipToDos;


import java.util.Optional;

@RestController
@RequestMapping(AlienConstans.SHIP_TOOLS_V1)
@CrossOrigin
public class ShipTools {
    @Autowired
    ShipToDos shipToDos;

    @Autowired
    ShipRepository shipRepository;

    @Autowired
    AlienRepository alienRepository;

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<ShipEntity> addShipByName(
            @RequestParam String name
    ) {
        ShipEntity shipEntity = ShipToDos.addShip(name);
        ShipEntity result= ShipResultToShipEntityConverter.convert(shipEntity, shipEntity);
        return new ResponseEntity<>(shipRepository.save(result), HttpStatus.OK);
    }

    @RequestMapping(path = "",method = RequestMethod.PUT)
    public ResponseEntity<ShipEntity> addAlienToShip(
            @RequestParam int alienId,
            @RequestParam int shipId){
        Optional<AlienEntity> alienEntityOptional = alienRepository.findById(alienId);
        Optional<ShipEntity> shipEntityOptional = shipRepository.findById(shipId);
        if (alienEntityOptional.isPresent()&& shipEntityOptional.isPresent()) {
            alienEntityOptional.get().setShip(shipEntityOptional.get());
            shipEntityOptional.get().addAlienToList(alienEntityOptional.get());
            alienRepository.save(alienEntityOptional.get());
            shipRepository.save(shipEntityOptional.get());
        }
        return new ResponseEntity<>(HttpStatus.OK);

        //TODO nie powiino czegoś zwracać zeby było wiadomo ze wszsytko ok?
    }

}
