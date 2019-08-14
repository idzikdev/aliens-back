package pl.idzikdev.XCom.tools;

import org.springframework.stereotype.Service;
import pl.idzikdev.XCom.entity.CraftEntity;
import pl.idzikdev.XCom.stats.craft.*;

@Service
public class CraftToDos {
    public static CraftEntity addCraft(String name) {
        CraftEntity craftEntity;
        switch (name) {
            case "skyranger": {
                craftEntity = CraftToDos.addSkyranger();
                break;
            }
            case "interceptor": {
                craftEntity = CraftToDos.addInterceptor();
                break;
            }
            case "lightning": {
                craftEntity = CraftToDos.addLightning();
                break;
            }
            case "firestorm": {
                craftEntity = CraftToDos.addFirestorm();
                break;
            }
            case "avenger": {
                craftEntity = CraftToDos.addAvenger();
                break;
            }
            default:craftEntity=CraftToDos.addSkyranger();
        }
        return craftEntity;
    }

    public static CraftEntity addAvenger() {
        int maxSpeed = AvengerStats.MAX_SPEED;
        int acceleration = AvengerStats.ACCELERATION;
        int damagedCapacity = AvengerStats.DAMAGE_CAPACITY;
        int fuelCapacity = AvengerStats.FUEL_CAPACITY;
        int cargoSpace=AvengerStats.CARGO_SPACE;
        int hwpCapacity=AvengerStats.HWP_CAPACITY;
        int weaponPods = AvengerStats.WEAPON_PODS;


        CraftEntity craftEntity = CraftEntity.builder()
                .name("avenger")
                .maxSpeed(maxSpeed).acceleration(acceleration).damageCapacity(damagedCapacity)
                .fuelCapacity(fuelCapacity).cargoSpace(cargoSpace).hwpCapacity(hwpCapacity).weaponPods(weaponPods)
                .build();
        return craftEntity;
    }

    public static CraftEntity addFirestorm() {
        int maxSpeed = FirestormStats.MAX_SPEED;
        int acceleration = FirestormStats.ACCELERATION;
        int damagedCapacity = FirestormStats.DAMAGE_CAPACITY;
        int fuelCapacity = FirestormStats.FUEL_CAPACITY;
        int cargoSpace=FirestormStats.CARGO_SPACE;
        int hwpCapacity=FirestormStats.HWP_CAPACITY;
        int weaponPods = FirestormStats.WEAPON_PODS;


        CraftEntity craftEntity = CraftEntity.builder()
                .name("firestorm")
                .maxSpeed(maxSpeed).acceleration(acceleration).damageCapacity(damagedCapacity)
                .fuelCapacity(fuelCapacity).cargoSpace(cargoSpace).hwpCapacity(hwpCapacity).weaponPods(weaponPods)
                .build();
        return craftEntity;
    }

    public static CraftEntity addLightning() {

        int maxSpeed = LightningStats.MAX_SPEED;
        int acceleration = LightningStats.ACCELERATION;
        int damagedCapacity = LightningStats.DAMAGE_CAPACITY;
        int fuelCapacity = LightningStats.FUEL_CAPACITY;
        int cargoSpace=LightningStats.CARGO_SPACE;
        int hwpCapacity=LightningStats.HWP_CAPACITY;
        int weaponPods = LightningStats.WEAPON_PODS;


        CraftEntity craftEntity = CraftEntity.builder()
                .name("lightning")
                .maxSpeed(maxSpeed).acceleration(acceleration).damageCapacity(damagedCapacity)
                .fuelCapacity(fuelCapacity).cargoSpace(cargoSpace).hwpCapacity(hwpCapacity).weaponPods(weaponPods)
                .build();
        return craftEntity;
    }

    public static CraftEntity addInterceptor() {
        int maxSpeed = InterceptorStats.MAX_SPEED;
        int acceleration = InterceptorStats.ACCELERATION;
        int damagedCapacity = InterceptorStats.DAMAGE_CAPACITY;
        int fuelCapacity = InterceptorStats.FUEL_CAPACITY;
        int cargoSpace=InterceptorStats.CARGO_SPACE;
        int hwpCapacity=InterceptorStats.HWP_CAPACITY;
        int weaponPods = InterceptorStats.WEAPON_PODS;


        CraftEntity craftEntity = CraftEntity.builder()
                .name("interceptor")
                .maxSpeed(maxSpeed).acceleration(acceleration).damageCapacity(damagedCapacity)
                .fuelCapacity(fuelCapacity).cargoSpace(cargoSpace).hwpCapacity(hwpCapacity).weaponPods(weaponPods)
                .build();
        return craftEntity;
    }

    public static CraftEntity addSkyranger() {
        int maxSpeed = SkyrangerStats.MAX_SPEED;
        int acceleration = SkyrangerStats.ACCELERATION;
        int damagedCapacity = SkyrangerStats.DAMAGE_CAPACITY;
        int fuelCapacity = SkyrangerStats.FUEL_CAPACITY;
        int cargoSpace=SkyrangerStats.CARGO_SPACE;
        int hwpCapacity=SkyrangerStats.HWP_CAPACITY;
        int weaponPods = SkyrangerStats.WEAPON_PODS;


        CraftEntity craftEntity = CraftEntity.builder()
                .name("skyranger")
                .maxSpeed(maxSpeed).acceleration(acceleration).damageCapacity(damagedCapacity)
                .fuelCapacity(fuelCapacity).cargoSpace(cargoSpace).hwpCapacity(hwpCapacity).weaponPods(weaponPods)
                .build();
        return craftEntity;
    }
}
