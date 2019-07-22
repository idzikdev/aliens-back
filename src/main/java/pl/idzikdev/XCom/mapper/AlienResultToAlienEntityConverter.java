package pl.idzikdev.XCom.mapper;

import pl.idzikdev.XCom.entity.AlienEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlienResultToAlienEntityConverter {
    public static AlienEntity convert(AlienEntity input,AlienEntity output){
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","medic","engineer","navigator","terrorist","leader","commander"));
        List<String> breeds=new ArrayList<>(Arrays.asList("celatid","chryssalid","cyberdisc",
                "ethereal","floater","muton","reaper","sectoid","sectopod","silacoid",
                "snakeman","zombie"));
        if (breeds.contains(input.getBreed().toLowerCase())){
            output.setBreed(input.getBreed().toLowerCase());
        }
        else output.setBreed("sectoid");
        if (ranks.contains(input.getRank().toLowerCase())){
            output.setRank(input.getRank().toLowerCase());
        }
        else output.setRank("soldier");
        output.setTimeUnits(input.getTimeUnits());
        output.setHealth(input.getHealth());
        output.setEnergy(input.getEnergy());
        output.setReactions(input.getReactions());
        output.setStrength(input.getStrength());
        output.setBravery(input.getBravery());
        output.setFiringAccuracy(input.getFiringAccuracy());
        output.setThrowingAccuracy(input.getThrowingAccuracy());
        output.setPsiSkill(input.getPsiSkill());
        output.setPsiStrength(input.getPsiStrength());
        output.setMeleeAccuracy(input.getMeleeAccuracy());
        output.setArmourFront(input.getArmourFront());
        output.setArmourLeft(input.getArmourLeft());
        output.setArmourRight(input.getArmourRight());
        output.setArmourRear(input.getArmourRear());
        output.setArmourUnder(input.getArmourUnder());
        output.setEnergyRecovery(input.getEnergyRecovery());
        output.setVictoryPoints(input.getVictoryPoints());
        output.setAggression(input.getAggression());
        output.setIntelligence(input.getIntelligence());
        output.setHeightStanding(input.getHeightStanding());
        output.setHeightKneeling(input.getHeightKneeling());
        return output;
    }
}
