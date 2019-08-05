package pl.idzikdev.XCom.tools;

import org.springframework.stereotype.Service;
import pl.idzikdev.XCom.entity.ShipEntity;
import pl.idzikdev.XCom.mapper.ShipResultToShipEntityConverter;
import pl.idzikdev.XCom.stats.ships.*;

@Service
public class ShipToDos {

    public static ShipEntity addShip(String name) {
        ShipEntity shipEntity = new ShipEntity();
        switch (name) {
            case "smallscout": {
                shipEntity = ShipToDos.addSmallScout();
                break;
            }
            case "mediumscout": {
                shipEntity = ShipToDos.addMediumScout();
                break;
            }
            case "largescout": {
                shipEntity = ShipToDos.addLargeScout();
                break;
            }
            case "abductor": {
                shipEntity = ShipToDos.addAbductor();
                break;
            }
            case "battleship": {
                shipEntity = ShipToDos.addBattleship();
                break;
            }
            case "harvester": {
                shipEntity = ShipToDos.addHarvester();
                break;
            }
            case "supplyship": {
                shipEntity = ShipToDos.addSupplyship();
                break;
            }
            default:
                shipEntity = ShipToDos.addTerrorship();
        }
        return shipEntity;
    }


    public static ShipEntity addSmallScout() {
        int maxSpeed = SmallScoutStats.MAX_SPEED;
        int escapeTime = SmallScoutStats.ESCAPE_TIME;
        int weaponPower = SmallScoutStats.WEAPON_POWER;
        int weaponRangeKm = SmallScoutStats.WEAPON_RANGE_KM;
        int weaponRangeUnits = SmallScoutStats.WEAPON_RANGE_UNITS;
        int firingInterval = SmallScoutStats.FIRING_INTERVAL;
        int damagedCapacity = SmallScoutStats.DAMAGED_CAPACITY;
        int downedPoints = SmallScoutStats.DOWNED_POINTS;
        int destroyedPoints = SmallScoutStats.DESTROYED_POINTS;

        ShipEntity shipEntity = ShipEntity.builder()
                .size("very small").name("small scout")
                .maxSpeed(maxSpeed).escapeTime(escapeTime).weaponPower(weaponPower)
                .weaponRangeKm(weaponRangeKm).weaponRangeUnits(weaponRangeUnits)
                .firingInterval(firingInterval).damageCapacity(damagedCapacity)
                .downedPoints(downedPoints).destroyedPoints(destroyedPoints)
                .build();
        ShipEntity result = new ShipEntity();
        return ShipResultToShipEntityConverter.convert(shipEntity, result);
    }

    public static ShipEntity addMediumScout() {
        int maxSpeed = MediumScoutStats.MAX_SPEED;
        int escapeTime = MediumScoutStats.ESCAPE_TIME;
        int weaponPower = MediumScoutStats.WEAPON_POWER;
        int weaponRangeKm = MediumScoutStats.WEAPON_RANGE_KM;
        int weaponRangeUnits = MediumScoutStats.WEAPON_RANGE_UNITS;
        int firingInterval = MediumScoutStats.FIRING_INTERVAL;
        int damagedCapacity = MediumScoutStats.DAMAGED_CAPACITY;
        int downedPoints = MediumScoutStats.DOWNED_POINTS;
        int destroyedPoints = MediumScoutStats.DESTROYED_POINTS;

        ShipEntity shipEntity = ShipEntity.builder()
                .size("small").name("medium scout")
                .maxSpeed(maxSpeed).escapeTime(escapeTime).weaponPower(weaponPower)
                .weaponRangeKm(weaponRangeKm).weaponRangeUnits(weaponRangeUnits)
                .firingInterval(firingInterval).damageCapacity(damagedCapacity)
                .downedPoints(downedPoints).destroyedPoints(destroyedPoints)
                .build();
        ShipEntity result = new ShipEntity();
        return ShipResultToShipEntityConverter.convert(shipEntity, result);
    }

    public static ShipEntity addLargeScout() {
        int maxSpeed = LargeScoutStats.MAX_SPEED;
        int escapeTime = LargeScoutStats.ESCAPE_TIME;
        int weaponPower = LargeScoutStats.WEAPON_POWER;
        int weaponRangeKm = LargeScoutStats.WEAPON_RANGE_KM;
        int weaponRangeUnits = LargeScoutStats.WEAPON_RANGE_UNITS;
        int firingInterval = LargeScoutStats.FIRING_INTERVAL;
        int damagedCapacity = LargeScoutStats.DAMAGED_CAPACITY;
        int downedPoints = LargeScoutStats.DOWNED_POINTS;
        int destroyedPoints = LargeScoutStats.DESTROYED_POINTS;

        ShipEntity shipEntity = ShipEntity.builder()
                .size("small").name("large scout")
                .maxSpeed(maxSpeed).escapeTime(escapeTime).weaponPower(weaponPower)
                .weaponRangeKm(weaponRangeKm).weaponRangeUnits(weaponRangeUnits)
                .firingInterval(firingInterval).damageCapacity(damagedCapacity)
                .downedPoints(downedPoints).destroyedPoints(destroyedPoints)
                .build();
        ShipEntity result = new ShipEntity();
        return ShipResultToShipEntityConverter.convert(shipEntity, result);
    }

    public static ShipEntity addAbductor() {
        int maxSpeed = AbductorStats.MAX_SPEED;
        int escapeTime = AbductorStats.ESCAPE_TIME;
        int weaponPower = AbductorStats.WEAPON_POWER;
        int weaponRangeKm = AbductorStats.WEAPON_RANGE_KM;
        int weaponRangeUnits = AbductorStats.WEAPON_RANGE_UNITS;
        int firingInterval = AbductorStats.FIRING_INTERVAL;
        int damagedCapacity = AbductorStats.DAMAGED_CAPACITY;
        int downedPoints = AbductorStats.DOWNED_POINTS;
        int destroyedPoints = AbductorStats.DESTROYED_POINTS;

        ShipEntity shipEntity = ShipEntity.builder()
                .size("medium").name("abductor")
                .maxSpeed(maxSpeed).escapeTime(escapeTime).weaponPower(weaponPower)
                .weaponRangeKm(weaponRangeKm).weaponRangeUnits(weaponRangeUnits)
                .firingInterval(firingInterval).damageCapacity(damagedCapacity)
                .downedPoints(downedPoints).destroyedPoints(destroyedPoints)
                .build();
        ShipEntity result = new ShipEntity();
        return ShipResultToShipEntityConverter.convert(shipEntity, result);
    }


    public static ShipEntity addBattleship() {
        int maxSpeed = BattleshipStats.MAX_SPEED;
        int escapeTime = BattleshipStats.ESCAPE_TIME;
        int weaponPower = BattleshipStats.WEAPON_POWER;
        int weaponRangeKm = BattleshipStats.WEAPON_RANGE_KM;
        int weaponRangeUnits = BattleshipStats.WEAPON_RANGE_UNITS;
        int firingInterval = BattleshipStats.FIRING_INTERVAL;
        int damagedCapacity = BattleshipStats.DAMAGED_CAPACITY;
        int downedPoints = BattleshipStats.DOWNED_POINTS;
        int destroyedPoints = BattleshipStats.DESTROYED_POINTS;

        ShipEntity shipEntity = ShipEntity.builder()
                .size("very large").name("battleship")
                .maxSpeed(maxSpeed).escapeTime(escapeTime).weaponPower(weaponPower)
                .weaponRangeKm(weaponRangeKm).weaponRangeUnits(weaponRangeUnits)
                .firingInterval(firingInterval).damageCapacity(damagedCapacity)
                .downedPoints(downedPoints).destroyedPoints(destroyedPoints)
                .build();
        ShipEntity result = new ShipEntity();
        return ShipResultToShipEntityConverter.convert(shipEntity, result);
    }

    public static ShipEntity addHarvester() {
        int maxSpeed = HarvesterStats.MAX_SPEED;
        int escapeTime = HarvesterStats.ESCAPE_TIME;
        int weaponPower = HarvesterStats.WEAPON_POWER;
        int weaponRangeKm = HarvesterStats.WEAPON_RANGE_KM;
        int weaponRangeUnits = HarvesterStats.WEAPON_RANGE_UNITS;
        int firingInterval = HarvesterStats.FIRING_INTERVAL;
        int damagedCapacity = HarvesterStats.DAMAGED_CAPACITY;
        int downedPoints = HarvesterStats.DOWNED_POINTS;
        int destroyedPoints = HarvesterStats.DESTROYED_POINTS;

        ShipEntity shipEntity = ShipEntity.builder()
                .size("medium").name("harvester")
                .maxSpeed(maxSpeed).escapeTime(escapeTime).weaponPower(weaponPower)
                .weaponRangeKm(weaponRangeKm).weaponRangeUnits(weaponRangeUnits)
                .firingInterval(firingInterval).damageCapacity(damagedCapacity)
                .downedPoints(downedPoints).destroyedPoints(destroyedPoints)
                .build();
        ShipEntity result = new ShipEntity();
        return ShipResultToShipEntityConverter.convert(shipEntity, result);
    }

    public static ShipEntity addSupplyship() {
        int maxSpeed = SupplyshipStats.MAX_SPEED;
        int escapeTime = SupplyshipStats.ESCAPE_TIME;
        int weaponPower = SupplyshipStats.WEAPON_POWER;
        int weaponRangeKm = SupplyshipStats.WEAPON_RANGE_KM;
        int weaponRangeUnits = SupplyshipStats.WEAPON_RANGE_UNITS;
        int firingInterval = SupplyshipStats.FIRING_INTERVAL;
        int damagedCapacity = SupplyshipStats.DAMAGED_CAPACITY;
        int downedPoints = SupplyshipStats.DOWNED_POINTS;
        int destroyedPoints = SupplyshipStats.DESTROYED_POINTS;

        ShipEntity shipEntity = ShipEntity.builder()
                .size("large").name("supply ship")
                .maxSpeed(maxSpeed).escapeTime(escapeTime).weaponPower(weaponPower)
                .weaponRangeKm(weaponRangeKm).weaponRangeUnits(weaponRangeUnits)
                .firingInterval(firingInterval).damageCapacity(damagedCapacity)
                .downedPoints(downedPoints).destroyedPoints(destroyedPoints)
                .build();
        ShipEntity result = new ShipEntity();
        return ShipResultToShipEntityConverter.convert(shipEntity, result);
    }

    public static ShipEntity addTerrorship() {
        int maxSpeed = TerrorshipStats.MAX_SPEED;
        int escapeTime = TerrorshipStats.ESCAPE_TIME;
        int weaponPower = TerrorshipStats.WEAPON_POWER;
        int weaponRangeKm = TerrorshipStats.WEAPON_RANGE_KM;
        int weaponRangeUnits = TerrorshipStats.WEAPON_RANGE_UNITS;
        int firingInterval = TerrorshipStats.FIRING_INTERVAL;
        int damagedCapacity = TerrorshipStats.DAMAGED_CAPACITY;
        int downedPoints = TerrorshipStats.DOWNED_POINTS;
        int destroyedPoints = TerrorshipStats.DESTROYED_POINTS;

        ShipEntity shipEntity = ShipEntity.builder()
                .size("large").name("terror ship")
                .maxSpeed(maxSpeed).escapeTime(escapeTime).weaponPower(weaponPower)
                .weaponRangeKm(weaponRangeKm).weaponRangeUnits(weaponRangeUnits)
                .firingInterval(firingInterval).damageCapacity(damagedCapacity)
                .downedPoints(downedPoints).destroyedPoints(destroyedPoints)
                .build();
        ShipEntity result = new ShipEntity();
        return ShipResultToShipEntityConverter.convert(shipEntity, result);
    }
}
