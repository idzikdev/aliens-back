package pl.idzikdev.XCom.rest.images;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.idzikdev.XCom.rest.AlienConstans;

import java.io.IOException;

@RestController
@RequestMapping(AlienConstans.RANK_IMAGES)
@CrossOrigin
public class SoldierRanksImageResource {

    @RequestMapping(value = "/rookie", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getRookieRank() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ranks/rookie.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
    @RequestMapping(value = "/squaddie", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getSquaddieRank() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ranks/squaddie.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
    @RequestMapping(value = "/sergeant", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getSergeantRank() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ranks/sergeant.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
    @RequestMapping(value = "/captain", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getCaptainRank() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ranks/captain.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
    @RequestMapping(value = "/colonel", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getColonelRank() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ranks/colonel.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
    @RequestMapping(value = "/commander", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getCommanderRank() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ranks/commander.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

}

