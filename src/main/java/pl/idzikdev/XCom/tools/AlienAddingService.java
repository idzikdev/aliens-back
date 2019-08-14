package pl.idzikdev.XCom.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.repository.AlienRepository;
import pl.idzikdev.XCom.stats.aliens.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AlienAddingService {
    @Autowired
    AlienRepository alienRepository;

    public static AlienEntity addAlien(String race,String rank){
        AlienEntity alienEntity;
        switch (race){
            case "celatid":{
                alienEntity= AlienAddingService.addCelatid(rank);
                break;
            }
            case "chryssalid":{
                alienEntity= AlienAddingService.addChryssalid(rank);
                break;
            }
            case "cyberdisc":{
                alienEntity= AlienAddingService.addCyberdisc(rank);
                break;
            }
            case "ethereal":{
                alienEntity= AlienAddingService.addEthereal(rank);
                break;
            }
            case "floater":{
                alienEntity= AlienAddingService.addFloater(rank);
                break;
            }
            case "muton":{
                alienEntity= AlienAddingService.addMuton(rank);
                break;
            }
            case "reaper":{
                alienEntity= AlienAddingService.addReaper(rank);
                break;
            }
            case "sectoid":{
                alienEntity= AlienAddingService.addSectoid(rank);
                break;
            }
            case "sectopod":{
                alienEntity= AlienAddingService.addSectopod(rank);
                break;
            }
            case "silacoid":{
                alienEntity= AlienAddingService.addSilacoid(rank);
                break;
            }
            case "snakeman":{
                alienEntity= AlienAddingService.addSnakeman(rank);
                break;
            }
            default:
                alienEntity= AlienAddingService.addZombie(rank);
        }
        return alienEntity;
    }



    public static AlienEntity addCelatid(String rank) {
        String myRank="terrorist";
        String breed="celatid";
        CelatidRaceStats celatidRaceStats =new CelatidRaceStats();
        AlienEntity alienEntity= celatidRaceStats.buildCelatidEntity(breed,myRank);
        return alienEntity;
    }


    public static AlienEntity addChryssalid(String rank) {
        String myRank="terrorist";
        String breed="chryssalid";
        ChryssalidRaceStats chryssalidRaceStats =new ChryssalidRaceStats();
        AlienEntity alienEntity= chryssalidRaceStats.buildChryssalidEntity(breed,myRank);
        return alienEntity;
    }


    public static AlienEntity addCyberdisc(String rank) {
        String myRank="terrorist";
        String breed="cyberdisc";
        CyberdiscRaceStats cyberdiscRaceStats =new CyberdiscRaceStats();
        AlienEntity alienEntity= cyberdiscRaceStats.buildCyberdiscEntity(breed,myRank);
        return alienEntity;
    }


    public static AlienEntity addEthereal(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","leader","commander"));
        String myRank;
        String breed="ethereal";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(Tools.drawNumber(0,ranks.size()-1));
        }
        EtherealRaceStats etherealRaceStats =new EtherealRaceStats();
        AlienEntity alienEntity= etherealRaceStats.buildEtherealEntity(breed,myRank);
        return alienEntity;
    }


    public static AlienEntity addFloater(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","medic","engineer","navigator","leader","commander"));
        String myRank;
        String breed="floater";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(Tools.drawNumber(0,ranks.size()-1));
        }
        FloaterRaceStats floaterRaceStats =new FloaterRaceStats();
        AlienEntity alienEntity= floaterRaceStats.buildFloaterEntity(breed,myRank);
        return alienEntity;
    }

    public static AlienEntity addMuton(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","engineer","navigator"));
        String myRank;
        String breed="muton";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(Tools.drawNumber(0,ranks.size()-1));
        }
        MutonRaceStats mutonRaceStats =new MutonRaceStats();
        AlienEntity alienEntity= mutonRaceStats.buildMutonEntity(breed,myRank);
        return alienEntity;
    }

    public static AlienEntity addReaper(String rank) {
        String myRank="terrorist";
        String breed="reaper";
        ReaperRaceStats reaperRaceStats =new ReaperRaceStats();
        AlienEntity alienEntity= reaperRaceStats.buildReaperEntity(breed,myRank);
        return alienEntity;

    }

    public static AlienEntity addSectoid(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","medic","engineer","navigator","leader","commander"));
        String myRank;
        String breed="sectoid";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(Tools.drawNumber(0,ranks.size()-1));
        }

        SectoidRaceStats sectoidRaceStats =new SectoidRaceStats();
        AlienEntity alienEntity= sectoidRaceStats.buildSectoidEntity(breed,myRank);
        return alienEntity;
    }

    public static AlienEntity addSectopod(String rank) {
        String myRank="terrorist";
        String breed="sectopod";
        SectopodRaceStats sectopodRaceStats =new SectopodRaceStats();
        AlienEntity alienEntity= sectopodRaceStats.buildSectopodEntity(breed,myRank);
        return alienEntity;
    }


    public static AlienEntity addSilacoid(String rank) {
        String myRank="terrorist";
        String breed="silacoid";
        SilacoidRaceStats silacoidRaceStats =new SilacoidRaceStats();
        AlienEntity alienEntity= silacoidRaceStats.buildSilacoidEntity(breed,myRank);
        return alienEntity;
    }

    public static AlienEntity addSnakeman(String rank) {
        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","engineer","navigator","leader","commander"));
        String myRank;
        String breed="snakeman";
        if (ranks.contains(rank))
        {
            myRank=rank;
        }
        else {
            myRank=ranks.get(Tools.drawNumber(0,ranks.size()-1));
        }
        SnakemanRaceStats snakemanRaceStats =new SnakemanRaceStats();
        AlienEntity alienEntity= snakemanRaceStats.buildSnakemanEntity(breed,myRank);
        return alienEntity;
    }


    public static AlienEntity addZombie(String rank) {
        String myRank="terrorist";
        String breed="zombie";
        ZombieRaceStats zombieRaceStats =new ZombieRaceStats();
        AlienEntity alienEntity= zombieRaceStats.buildZombieEntity(breed,myRank);
        return alienEntity;
    }



}
