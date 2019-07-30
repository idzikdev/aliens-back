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
@RequestMapping(AlienConstans.CRAFT_IMAGES)
@CrossOrigin
public class CraftImageResource {

    @RequestMapping(value = "/avenger-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getAvengerImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/avenger-0.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/avenger-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getAvengerImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/avenger-1.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/avenger-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getAvengerImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/avenger-2.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/avenger-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getAvengerImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/avenger-3.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/firestorm-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getFirestormImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/firestorm-3.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/interceptor-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getInterceptorImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/interceptor-3.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/lightning-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getLightningImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/lightning-0.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/lightning-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getLightningImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/lightning-1.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/lightning-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getLightningImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/lightning-2.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/lightning-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getLightningImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/lightning-3.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/skyranger-0", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getSkyrangerImage0() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/skyranger-0.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/skyranger-1", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getSkyrangerImage1() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/skyranger-1.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/skyranger-2", method = RequestMethod.GET,
            produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getSkyrangerImage2() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/skyranger-2.png");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/skyranger-3", method = RequestMethod.GET,
            produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<InputStreamResource> getSkyrangerImage3() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("static/craft/skyranger-3.gif");

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_GIF)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }
}
