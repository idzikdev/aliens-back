package pl.idzikdev.XCom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.entity.SoldierEntity;
import pl.idzikdev.XCom.mapper.SoldierResultToSoldierEntityConverter;
import pl.idzikdev.XCom.repository.SoldierRepository;
import pl.idzikdev.XCom.tools.SoldierToDos;

@RestController
@RequestMapping(AlienConstans.SOLDIER_TOOLS_V1)
@CrossOrigin
public class SoldierTools {
    @Autowired
    SoldierToDos soldierToDos;

    @Autowired
    SoldierRepository soldierRepository;

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<SoldierEntity> addSoldierByRank(
            @RequestParam String rank
    ) {
        SoldierEntity soldierEntity = SoldierToDos.addRandomSoldier(rank);
        SoldierEntity result= SoldierResultToSoldierEntityConverter.convert(soldierEntity, soldierEntity);
        return new ResponseEntity<>(soldierRepository.save(result), HttpStatus.OK);
    }
}
