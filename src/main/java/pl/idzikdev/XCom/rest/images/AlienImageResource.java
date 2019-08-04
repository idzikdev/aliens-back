package pl.idzikdev.XCom.rest.images;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.rest.AlienConstans;

import java.io.IOException;

@RestController
@RequestMapping(AlienConstans.ALIEN_IMAGES)
@CrossOrigin
public class AlienImageResource {

    @RequestMapping(value = "/{race}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getAlienImage(@PathVariable String race) throws IOException {
        ClassPathResource imgFile;
        switch (race) {
            case "celatid": {
                imgFile = new ClassPathResource("static/aliens/celatid.png");
                break;
            }
            case "chryssalid": {
                imgFile = new ClassPathResource("static/aliens/chryssalid.png");
                break;
            }
            case "cyberdisc": {
                imgFile = new ClassPathResource("static/aliens/cyberdisc.png");
                break;
            }
            case "ethereal": {
                imgFile = new ClassPathResource("static/aliens/ethereal.png");
                break;
            }
            case "floater": {
                imgFile = new ClassPathResource("static/aliens/floater.png");
                break;
            }
            case "muton": {
                imgFile = new ClassPathResource("static/aliens/muton.png");
                break;
            }
            case "reaper": {
                imgFile = new ClassPathResource("static/aliens/reaper.png");
                break;
            }
            case "sectoid": {
                imgFile = new ClassPathResource("static/aliens/sectoid.png");
                break;
            }
            case "sectopod": {
                imgFile = new ClassPathResource("static/aliens/sectopod.png");
                break;
            }
            case "silacoid": {
                imgFile = new ClassPathResource("static/aliens/silacoid.png");
                break;
            }
            case "snakeman": {
                imgFile = new ClassPathResource("static/aliens/snakeman.png");
                break;
            }
            default: {
                imgFile = new ClassPathResource("static/aliens/zombie.png");
                break;
            }
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

}
