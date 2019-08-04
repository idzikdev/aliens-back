package pl.idzikdev.XCom.rest.images;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.rest.AlienConstans;

import java.io.IOException;

@RestController
@RequestMapping(AlienConstans.SHIP_IMAGES)
@CrossOrigin
public class ShipImageResource {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getShipImage(
            @PathVariable String name
    ) throws IOException {
        ClassPathResource imgFile;
        switch (name) {
            case "abductor-0": {
                imgFile = new ClassPathResource("static/ships/abductor-0.jpg");
                break;
            }
            case "abductor-1": {
                imgFile = new ClassPathResource("static/ships/abductor-1.jpg");
                break;
            }
            case "abductor-2": {
                imgFile = new ClassPathResource("static/ships/abductor-2.jpg");
                break;
            }
            case "abductor-3": {
                imgFile = new ClassPathResource("static/ships/abductor-2.jpg");
                break;
            }
            case "battleship-0": {
                imgFile = new ClassPathResource("static/ships/battleship-0.jpg");
                break;
            }
            case "battleship-1": {
                imgFile = new ClassPathResource("static/ships/battleship-1.jpg");
                break;
            }
            case "battleship-2": {
                imgFile = new ClassPathResource("static/ships/battleship-2.jpg");
                break;
            }
            case "battleship-3": {
                imgFile = new ClassPathResource("static/ships/battleship-3.jpg");
                break;
            }
            case "harvester-0": {
                imgFile = new ClassPathResource("static/ships/harvester-0.jpg");
                break;
            }
            case "harvester-1": {
                imgFile = new ClassPathResource("static/ships/harvester-1.jpg");
                break;
            }
            case "harvester-2": {
                imgFile = new ClassPathResource("static/ships/harvester-2.jpg");
                break;
            }
            case "harvester-3": {
                imgFile = new ClassPathResource("static/ships/harvester-3.jpg");
                break;
            }
            case "large-scout-0": {
                imgFile = new ClassPathResource("static/ships/large-scout-0.jpg");
                break;
            }
            case "large-scout-1": {
                imgFile = new ClassPathResource("static/ships/large-scout-1.jpg");
                break;
            }
            case "large-scout-2": {
                imgFile = new ClassPathResource("static/ships/large-scout-1.jpg");
                break;
            }
            case "large-scout-3": {
                imgFile = new ClassPathResource("static/ships/large-scout-1.jpg");
                break;
            }
            case "medium-scout-0": {
                imgFile = new ClassPathResource("static/ships/medium-scout-0.jpg");
                break;
            }
            case "medium-scout-1": {
                imgFile = new ClassPathResource("static/ships/medium-scout-1.jpg");
                break;
            }
            case "medium-scout-2": {
                imgFile = new ClassPathResource("static/ships/medium-scout-1.jpg");
                break;
            }
            case "medium-scout-3": {
                imgFile = new ClassPathResource("static/ships/medium-scout-1.jpg");
                break;
            }
            case "small-scout-0": {
                imgFile = new ClassPathResource("static/ships/small-scout-0.jpg");
                break;
            }
            case "small-scout-1": {
                imgFile = new ClassPathResource("static/ships/small-scout-1.jpg");
                break;
            }
            case "small-scout-2": {
                imgFile = new ClassPathResource("static/ships/small-scout-2.jpg");
                break;
            }
            case "small-scout-3": {
                imgFile = new ClassPathResource("static/ships/small-scout-2.jpg");
                break;
            }
            case "supply-ship-0": {
                imgFile = new ClassPathResource("static/ships/supply-ship-0.jpg");
                break;
            }
            case "supply-ship-1": {
                imgFile = new ClassPathResource("static/ships/supply-ship-1.jpg");
                break;
            }
            case "supply-ship-2": {
                imgFile = new ClassPathResource("static/ships/supply-ship-2.jpg");
                break;
            }
            case "supply-ship-3": {
                imgFile = new ClassPathResource("static/ships/supply-ship-3.jpg");
                break;
            }
            case "terror-ship-0": {
                imgFile = new ClassPathResource("static/ships/terror-ship-0.jpg");
                break;
            }
            case "terror-ship-1": {
                imgFile = new ClassPathResource("static/ships/terror-ship-1.jpg");
                break;
            }
            case "terror-ship-2": {
                imgFile = new ClassPathResource("static/ships/terror-ship-2.jpg");
                break;
            }
            default: {
                imgFile = new ClassPathResource("static/ships/terror-ship-2.jpg");
                break;
            }
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}
