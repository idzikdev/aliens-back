package pl.idzikdev.XCom.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.idzikdev.XCom.entity.CraftEntity;
import pl.idzikdev.XCom.mapper.CraftResultToCraftEntityConverter;
import pl.idzikdev.XCom.repository.CraftRepository;
import pl.idzikdev.XCom.tools.CraftToDos;

@RestController
@RequestMapping(AlienConstans.CRAFT_TOOLS_V1)
@CrossOrigin
public class CraftTools {
    @Autowired
    CraftToDos craftToDos;

    @Autowired
    CraftRepository craftRepository;

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<CraftEntity> addCraftByName(
            @RequestParam String name
    ) {
        CraftEntity craftEntity = CraftToDos.addCraft(name);
        CraftEntity result= CraftResultToCraftEntityConverter.convert(craftEntity, craftEntity);
        return new ResponseEntity<>(craftRepository.save(result), HttpStatus.OK);
    }
}
