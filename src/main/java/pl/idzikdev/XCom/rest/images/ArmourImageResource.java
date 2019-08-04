package pl.idzikdev.XCom.rest.images;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.rest.AlienConstans;

import java.io.IOException;

@RestController
@RequestMapping(AlienConstans.ARMOUR_IMAGES)
@CrossOrigin
public class ArmourImageResource {

    @RequestMapping(value = "/{armour}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getSoldierArmour(
            @PathVariable String armour) throws IOException {
        ClassPathResource imgFile;
        switch (armour) {
            case "personal-armour": {
                imgFile = new ClassPathResource("static/armours/personal-armour.gif");
                break;
            }
            case "power-suit": {
                imgFile = new ClassPathResource("static/armours/power-suit.gif");
                break;
            }
            case "flying-suit": {
                imgFile = new ClassPathResource("static/armours/flying-suit.gif");
                break;
            }
            default:
                imgFile = new ClassPathResource("static/armours/no-armour.gif");
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

}
