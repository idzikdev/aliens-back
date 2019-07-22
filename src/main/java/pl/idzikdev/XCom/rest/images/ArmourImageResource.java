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
@RequestMapping(AlienConstans.ARMOUR_IMAGES)
@CrossOrigin
public class ArmourImageResource {

    @RequestMapping(value = "/no-armour", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getNoArmour() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/armours/no-armour.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/personal-armour", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getPersonalArmour() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/armours/personal-armour.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/power-suit", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getPowerSuit() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/armours/power-suit.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/flying-suit", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getFlyingSuit() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/armours/flying-suit.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}
