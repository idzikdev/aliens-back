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
@RequestMapping(AlienConstans.SHIP_IMAGES)
@CrossOrigin
public class ShipImageResource {
    @RequestMapping(value = "/abductor-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getAbductorImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/abductor-0.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/abductor-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getAbductorImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/abductor-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/abductor-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getAbductorImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/abductor-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/abductor-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getAbductorImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/abductor-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/battleship-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getBattleshipImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/battleship-0.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/battleship-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getBattleshipImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/battleship-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/battleship-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getBattleshipImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/battleship-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/battleship-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getBattleshipImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/battleship-3.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/harvester-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getHarvesterImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/harvester-0.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/harvester-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getHarvesterImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/harvester-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/harvester-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getHarvesterImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/harvester-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/harvester-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getHarvesterImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/harvester-3.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/large-scout-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getLargeScoutImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/large-scout-0.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/large-scout-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getLargeScoutImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/large-scout-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/large-scout-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getLargeScoutImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/large-scout-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/large-scout-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getLargeScoutImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/large-scout-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/medium-scout-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getMediumScoutImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/medium-scout-0.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/medium-scout-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getMediumScoutImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/medium-scout-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/medium-scout-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getMediumScoutImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/medium-scout-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/medium-scout-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getMediumScoutImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/medium-scout-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/small-scout-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getSmallScoutImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/small-scout-0.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/small-scout-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getSmallScoutImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/small-scout-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/small-scout-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getSmallScoutImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/small-scout-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/small-scout-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getSmallScoutImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/small-scout-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/supply-ship-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getSupplyShipImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/supply-ship-0.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/supply-ship-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getSupplyShipImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/supply-ship-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/supply-ship-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getSupplyShipImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/supply-ship-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/supply-ship-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getSupplyShipImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/supply-ship-3.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/terror-ship-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getTerrorShipImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/terror-ship-0.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/terror-ship-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getTerrorShipImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/terror-ship-1.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/terror-ship-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getTerrorShipImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/terror-ship-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/terror-ship-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getTerrorShipImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/ships/terror-ship-2.jpg");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}
