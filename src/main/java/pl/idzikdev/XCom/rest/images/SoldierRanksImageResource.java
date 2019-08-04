package pl.idzikdev.XCom.rest.images;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.rest.AlienConstans;

import java.io.IOException;
import java.io.InputStreamReader;

@RestController
@RequestMapping(AlienConstans.RANK_IMAGES)
@CrossOrigin
public class SoldierRanksImageResource {

    @RequestMapping(value = "/{rank}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getImageRank(@PathVariable String rank) throws IOException {
        ClassPathResource imgFile;
        switch (rank) {
            case "squaddie": {
                imgFile = new ClassPathResource("static/ranks/squaddie.gif");
                break;
            }
            case "sergeant": {
                imgFile = new ClassPathResource("static/ranks/sergeant.gif");
                break;
            }
            case "captain": {
                imgFile = new ClassPathResource("static/ranks/captain.gif");
                break;
            }
            case "colonel": {
                imgFile = new ClassPathResource("static/ranks/colonel.gif");
                break;
            }
            case "commander": {
                imgFile = new ClassPathResource("static/ranks/commander.gif");
                break;
            }
            default: {
                imgFile = new ClassPathResource("static/ranks/rookie.gif");
            }
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}

