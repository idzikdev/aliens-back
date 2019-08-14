package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class SectopodRaceStats {
    public static final int TIME_UNITS_MIN=62;
    public static final int TIME_UNITS_MAX=71;
    public static final int HEALTH_MIN=96;
    public static final int HEALTH_MAX=96;
    public static final int ENERGY_MIN=90;
    public static final int ENERGY_MAX=104;
    public static final int REACTIONS_MIN=64;
    public static final int REACTIONS_MAX=79;
    public static final int STRENGTH_MIN=90;
    public static final int STRENGTH_MAX=97;
    public static final int BRAVERY_MIN=110;
    public static final int BRAVERY_MAX=110;
    public static final int FIRING_ACCURACY_MIN=30;
    public static final int FIRING_ACCURACY_MAX=70;
    public static final int THROWING_ACCURACY_MIN=0;
    public static final int THROWING_ACCURACY_MAX=0;
    public static final int PSI_SKILL_MIN=0;
    public static final int PSI_SKILL_MAX=0;
    public static final int PSI_STRENGTH_MIN=100;
    public static final int PSI_STRENGTH_MAX=116;
    public static final int MELEE_ACCURACY_MIN=80;
    public static final int MELEE_ACCURACY_MAX=80;
    public static final int ARMOUR_FRONT_MIN=145;
    public static final int ARMOUR_FRONT_MAX=145;
    public static final int ARMOUR_LEFT_MIN=130;
    public static final int ARMOUR_LEFT_MAX=130;
    public static final int ARMOUR_RIGHT_MIN=130;
    public static final int ARMOUR_RIGHT_MAX=130;
    public static final int ARMOUR_REAR_MIN=100;
    public static final int ARMOUR_REAR_MAX=100;
    public static final int ARMOUR_UNDER_MIN=90;
    public static final int ARMOUR_UNDER_MAX=90;
    public static final int ENERGY_RECOVERY_MIN=50;
    public static final int ENERGY_RECOVERY_MAX=50;
    public static final int VICTORY_POINTS_MIN=30;
    public static final int VICTORY_POINTS_MAX=30;
    public static final int AGGRESSION_MIN=1;
    public static final int AGGRESSION_MAX=1;
    public static final int INTELLIGENCE_MIN=4;
    public static final int INTELLIGENCE_MAX=4;
    public static final int HEIGHT_STANDING_MIN=22;
    public static final int HEIGHT_STANDING_MAX=22;
    public static final int HEIGHT_KNEELING_MIN=22;
    public static final int HEIGHT_KNEELING_MAX=22;
    public static final boolean VALID_RANK_SOLDIER=false;
    public static final boolean VALID_RANK_NAVIGATOR=false;
    public static final boolean VALID_RANK_MEDIC=false;
    public static final boolean VALID_RANK_ENGINEER=false;
    public static final boolean VALID_RANK_TERRORIST=true;
    public static final boolean VALID_RANK_LEADER=false;
    public static final boolean VALID_RANK_COMMANDER=false;
    private int timeUnits;
    private int health;
    private int energy;
    private int reactions;
    private int strength;
    private int bravery;
    private int firingAccuracy;
    private int throwingAccuracy;
    private int psiSkill;
    private int psiStrength;
    private int meleeAccuracy;
    private int armourFront;
    private int armourLeft;
    private int armourRight;
    private int armourRear;
    private int armourUnder;
    private int energyRecovery;
    private int victoryPoints;
    private int aggression;
    private int intelligence;
    private int heightStanding;
    private int heightKneeling;

    public SectopodRaceStats() {
        this.timeUnits= Tools.drawNumber(SectopodRaceStats.TIME_UNITS_MIN,SectopodRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(SectopodRaceStats.HEALTH_MIN,SectopodRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(SectopodRaceStats.ENERGY_MIN,SectopodRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(SectopodRaceStats.REACTIONS_MIN,SectopodRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(SectopodRaceStats.STRENGTH_MIN,SectopodRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(SectopodRaceStats.BRAVERY_MIN,SectopodRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(SectopodRaceStats.FIRING_ACCURACY_MIN,SectopodRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(SectopodRaceStats.THROWING_ACCURACY_MIN,SectopodRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(SectopodRaceStats.PSI_SKILL_MIN,SectopodRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(SectopodRaceStats.PSI_STRENGTH_MIN,SectopodRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(SectopodRaceStats.MELEE_ACCURACY_MIN,SectopodRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(SectopodRaceStats.ARMOUR_FRONT_MIN,SectopodRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(SectopodRaceStats.ARMOUR_LEFT_MIN,SectopodRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(SectopodRaceStats.ARMOUR_RIGHT_MIN,SectopodRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(SectopodRaceStats.ARMOUR_REAR_MIN,SectopodRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(SectopodRaceStats.ARMOUR_UNDER_MIN,SectopodRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(SectopodRaceStats.ENERGY_RECOVERY_MIN,SectopodRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(SectopodRaceStats.VICTORY_POINTS_MIN,SectopodRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(SectopodRaceStats.AGGRESSION_MIN,SectopodRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(SectopodRaceStats.INTELLIGENCE_MIN,SectopodRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(SectopodRaceStats.HEIGHT_STANDING_MIN,SectopodRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(SectopodRaceStats.HEIGHT_KNEELING_MIN,SectopodRaceStats.HEIGHT_KNEELING_MAX);
    }


    public AlienEntity buildSectopodEntity(String breed, String rank) {
        AlienEntity alienEntity = AlienEntity.builder()
                .breed(breed)
                .rank(rank)
                .timeUnits(timeUnits).health(health).energy(energy).reactions(reactions)
                .strength(strength).bravery(bravery).firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .psiSkill(psiSkill).psiStrength(psiStrength).meleeAccuracy(meleeAccuracy)
                .armourFront(armourFront).armourLeft(armourLeft).armourRight(armourRight).armourRear(armourRear).armourUnder(armourUnder)
                .energyRecovery(energyRecovery).victoryPoints(victoryPoints).aggression(aggression).intelligence(intelligence)
                .heightStanding(heightStanding).heightKneeling(heightKneeling)
                .build();
        return alienEntity;
    }
}
