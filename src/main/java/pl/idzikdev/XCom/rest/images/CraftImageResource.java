package pl.idzikdev.XCom.rest.images;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.rest.AlienConstans;

import java.io.IOException;

@RestController
@RequestMapping(AlienConstans.CRAFT_IMAGES)
@CrossOrigin
public class CraftImageResource {


    @RequestMapping(value = "/{name}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getShipImage(
            @PathVariable String name
    ) throws IOException {
        ClassPathResource imgFile = new ClassPathResource("static/craft/avenger-0.png");
        switch (name) {
            case "avenger-0": {
                imgFile = new ClassPathResource("static/craft/avenger-0.png");
                break;
            }
            case "avenger-1": {
                imgFile = new ClassPathResource("static/craft/avenger-1.png");
                break;
            }
            case "avenger-2": {
                imgFile = new ClassPathResource("static/craft/avenger-2.png");
                break;
            }
            case "avenger-3": {
                imgFile = new ClassPathResource("static/craft/avenger-3.png");
                break;
            }
            case "firestorm-3": {
                imgFile = new ClassPathResource("static/craft/firestorm-3.png");
                break;
            }
            case "interceptor-3": {
                imgFile = new ClassPathResource("static/craft/interceptor-3.png");
                break;
            }
            case "lightning-0": {
                imgFile = new ClassPathResource("static/craft/lightning-0.png");
                break;
            }
            case "lightning-1": {
                imgFile = new ClassPathResource("static/craft/lightning-1.png");
                break;
            }
            case "lightning-2": {
                imgFile = new ClassPathResource("static/craft/lightning-2.png");
                break;
            }
            case "lightning-3": {
                imgFile = new ClassPathResource("static/craft/lightning-3.png");
                break;
            }
            case "skyranger-0": {
                imgFile = new ClassPathResource("static/craft/skyranger-0.png");
                break;
            }
            case "skyranger-1": {
                imgFile = new ClassPathResource("static/craft/skyranger-1.png");
                break;
            }
            case "skyranger-2": {
                imgFile = new ClassPathResource("static/craft/skyranger-2.png");
                break;
            }
            default:
                imgFile = new ClassPathResource("static/craft/skyranger-3.png");
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}
