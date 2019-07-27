package pl.idzikdev.XCom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.idzikdev.XCom.repository.AlienRepository;
import pl.idzikdev.XCom.repository.ShipRepository;
import pl.idzikdev.XCom.tools.SoldierToDos;


@Component
public class Init implements CommandLineRunner {
    @Autowired
    AlienRepository alienRepository;
    @Autowired
    ShipRepository shipRepository;




    @Override
    public void run(String... args) throws Exception {
//        AlienEntity alienEntity0 = AlienEntity.builder()
//                .breed("sectoid")
//                .rank("soldier")
//                .timeUnits(60).health(30).energy(101).reactions(72)
//                .strength(31).bravery(80).firingAccuracy(60).throwingAccuracy(58)
//                .psiSkill(50).psiStrength(54).meleeAccuracy(76)
//                .armourFront(2).armourLeft(2).armourRight(2).armourRear(2).armourUnder(2)
//                .energyRecovery(30).victoryPoints(20).aggression(1).intelligence(4)
//                .heightStanding(16).heightKneeling(12)
//                .build();
//        alienRepository.save(alienEntity0);
//        ShipEntity shipEntity0 = ShipEntity.builder()
//                .size("small").name("small scout").maxSpeed(1200)
//                .weaponPower(700).weaponRangeKm(800).weaponRangeUnits(100)
//                .damageCapacity(600).downedPoints(800).destroyedPoints(600)
//                .jpg0("small-scout-0").jpg1("small-scout-1").jpg2("small-scout-2").jpg3("small-scout-2")
//                .build();
//        shipRepository.save(shipEntity0);
//        for (int i = 0; i < 100; i++) {
//            System.out.println(AlienToDos.drawNumber(2,2));
//
//        }
        SoldierToDos.fillAmericanNames();

    }
}
