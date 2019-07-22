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
@RequestMapping(AlienConstans.ALIEN_IMAGES)
@CrossOrigin
public class AlienImageResource {

    @RequestMapping(value = "/celatid", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getCelatidImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/celatid.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/chryssalid", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getChryssalidImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/chryssalid.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/cyberdisc", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getCyberdiscImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/cyberdisc.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/ethereal", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getEtherealImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/ethereal.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/floater", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/floater.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/muton", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getMutonImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/muton.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/reaper", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getReaperImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/reaper.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/sectoid", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getSectoidImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/sectoid.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/sectopod", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getSectopodImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/sectopod.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/silacoid", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getSilacoidImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/silacoid.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/snakeman", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getSnakemanImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/snakeman.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/zombie", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getZombieImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/aliens/zombie.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}
