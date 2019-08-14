package pl.idzikdev.XCom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.repository.AlienRepository;
import pl.idzikdev.XCom.tools.AlienAddingService;

@RestController
@RequestMapping(AlienConstans.ALIEN_TOOLS_V1)
@CrossOrigin
public class AlienTools {
    @Autowired
    AlienAddingService alienAddingService;

    @Autowired
    AlienRepository alienRepository;

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<AlienEntity> addRandomAlien(
            @RequestParam String race,
            @RequestParam String rank
    ) {
        AlienEntity alienEntity = AlienAddingService.addAlien(race, rank);
        return new ResponseEntity<>(alienRepository.save(alienEntity), HttpStatus.OK);
    }

}
