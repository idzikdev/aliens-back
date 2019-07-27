package pl.idzikdev.XCom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.entity.ShipEntity;
import pl.idzikdev.XCom.mapper.ShipResultToShipEntityConverter;
import pl.idzikdev.XCom.repository.ShipRepository;
import pl.idzikdev.XCom.tools.ShipToDos;

@RestController
@RequestMapping(AlienConstans.SHIP_TOOLS_V1)
@CrossOrigin
public class ShipTools {
    @Autowired
    ShipToDos shipToDos;

    @Autowired
    ShipRepository shipRepository;

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<ShipEntity> addShipByName(
            @RequestParam String name
    ) {
        ShipEntity shipEntity = ShipToDos.addShip(name);
        ShipEntity result= ShipResultToShipEntityConverter.convert(shipEntity, shipEntity);
        return new ResponseEntity<>(shipRepository.save(result), HttpStatus.OK);
    }
}
