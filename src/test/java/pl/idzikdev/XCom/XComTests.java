package pl.idzikdev.XCom;


import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.rest.AlienResource;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

public class XComTests {
    @Test
    public void getAliens() {
        //given
//        AlienResource alienResource = Mockito.mock(AlienResource.class);
//        Mockito
//                .when(alienResource.getAliens())
//                .thenReturn(new ResponseEntity<>(prepareAliens());
//        //when
//        List<AlienEntity>list=alienResource.getAliens();
//        //then
//        Assert.assertThat(list, Matchers.hasSize(3));
    }

    private List<AlienEntity> prepareAliens() {
        List<AlienEntity> alienEntities=new ArrayList<>();
        alienEntities.add(new AlienEntity("Sectoid",62));
        alienEntities.add(new AlienEntity("Floater",112));
        alienEntities.add(new AlienEntity("Muton",102));
        return alienEntities;
    }
}
