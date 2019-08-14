package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class EtherealRaceStats {
    public static final int TIME_UNITS_MIN=68;
    public static final int TIME_UNITS_MAX=78;
    public static final int HEALTH_MIN=55;
    public static final int HEALTH_MAX=55;
    public static final int ENERGY_MIN=96;
    public static final int ENERGY_MAX=111;
    public static final int REACTIONS_MIN=75;
    public static final int REACTIONS_MAX=93;
    public static final int STRENGTH_MIN=48;
    public static final int STRENGTH_MAX=51;
    public static final int BRAVERY_MIN=80;
    public static final int BRAVERY_MAX=80;
    public static final int FIRING_ACCURACY_MIN=37;
    public static final int FIRING_ACCURACY_MAX=91;
    public static final int THROWING_ACCURACY_MIN=80;
    public static final int THROWING_ACCURACY_MAX=80;
    public static final int PSI_SKILL_MIN=40;
    public static final int PSI_SKILL_MAX=58;
    public static final int PSI_STRENGTH_MIN=50;
    public static final int PSI_STRENGTH_MAX=75;
    public static final int MELEE_ACCURACY_MIN=85;
    public static final int MELEE_ACCURACY_MAX=85;
    public static final int ARMOUR_FRONT_MIN=35;
    public static final int ARMOUR_FRONT_MAX=45;
    public static final int ARMOUR_LEFT_MIN=35;
    public static final int ARMOUR_LEFT_MAX=45;
    public static final int ARMOUR_RIGHT_MIN=35;
    public static final int ARMOUR_RIGHT_MAX=45;
    public static final int ARMOUR_REAR_MIN=35;
    public static final int ARMOUR_REAR_MAX=45;
    public static final int ARMOUR_UNDER_MIN=35;
    public static final int ARMOUR_UNDER_MAX=45;
    public static final int ENERGY_RECOVERY_MIN=40;
    public static final int ENERGY_RECOVERY_MAX=40;
    public static final int VICTORY_POINTS_MIN=20;
    public static final int VICTORY_POINTS_MAX=40;
    public static final int AGGRESSION_MIN=1;
    public static final int AGGRESSION_MAX=1;
    public static final int INTELLIGENCE_MIN=6;
    public static final int INTELLIGENCE_MAX=8;
    public static final int HEIGHT_STANDING_MIN=20;
    public static final int HEIGHT_STANDING_MAX=20;
    public static final int HEIGHT_KNEELING_MIN=16;
    public static final int HEIGHT_KNEELING_MAX=16;
    public static final boolean VALID_RANK_SOLDIER=true;
    public static final boolean VALID_RANK_NAVIGATOR=false;
    public static final boolean VALID_RANK_MEDIC=false;
    public static final boolean VALID_RANK_ENGINEER=false;
    public static final boolean VALID_RANK_TERRORIST=false;
    public static final boolean VALID_RANK_LEADER=true;
    public static final boolean VALID_RANK_COMMANDER=true;
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

    public EtherealRaceStats() {
        this.timeUnits= Tools.drawNumber(EtherealRaceStats.TIME_UNITS_MIN,EtherealRaceStats.TIME_UNITS_MAX);
        this.health=Tools.drawNumber(EtherealRaceStats.HEALTH_MIN,EtherealRaceStats.HEALTH_MAX);
        this.energy=Tools.drawNumber(EtherealRaceStats.ENERGY_MIN,EtherealRaceStats.ENERGY_MAX);
        this.reactions=Tools.drawNumber(EtherealRaceStats.REACTIONS_MIN,EtherealRaceStats.REACTIONS_MAX);
        this.strength=Tools.drawNumber(EtherealRaceStats.STRENGTH_MIN,EtherealRaceStats.STRENGTH_MAX);
        this.bravery=Tools.drawNumber(EtherealRaceStats.BRAVERY_MIN,EtherealRaceStats.BRAVERY_MAX);
        this.firingAccuracy=Tools.drawNumber(EtherealRaceStats.FIRING_ACCURACY_MIN,EtherealRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy=Tools.drawNumber(EtherealRaceStats.THROWING_ACCURACY_MIN,EtherealRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill=Tools.drawNumber(EtherealRaceStats.PSI_SKILL_MIN,EtherealRaceStats.PSI_SKILL_MAX);
        this.psiStrength=Tools.drawNumber(EtherealRaceStats.PSI_STRENGTH_MIN,EtherealRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy=Tools.drawNumber(EtherealRaceStats.MELEE_ACCURACY_MIN,EtherealRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront=Tools.drawNumber(EtherealRaceStats.ARMOUR_FRONT_MIN,EtherealRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft=Tools.drawNumber(EtherealRaceStats.ARMOUR_LEFT_MIN,EtherealRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight=Tools.drawNumber(EtherealRaceStats.ARMOUR_RIGHT_MIN,EtherealRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear=Tools.drawNumber(EtherealRaceStats.ARMOUR_REAR_MIN,EtherealRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder=Tools.drawNumber(EtherealRaceStats.ARMOUR_UNDER_MIN,EtherealRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery=Tools.drawNumber(EtherealRaceStats.ENERGY_RECOVERY_MIN,EtherealRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints=Tools.drawNumber(EtherealRaceStats.VICTORY_POINTS_MIN,EtherealRaceStats.VICTORY_POINTS_MAX);
        this.aggression=Tools.drawNumber(EtherealRaceStats.AGGRESSION_MIN,EtherealRaceStats.AGGRESSION_MAX);
        this.intelligence=Tools.drawNumber(EtherealRaceStats.INTELLIGENCE_MIN,EtherealRaceStats.INTELLIGENCE_MAX);
        this.heightStanding=Tools.drawNumber(EtherealRaceStats.HEIGHT_STANDING_MIN,EtherealRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling=Tools.drawNumber(EtherealRaceStats.HEIGHT_KNEELING_MIN,EtherealRaceStats.HEIGHT_KNEELING_MAX);
    }


    public AlienEntity buildEtherealEntity(String breed, String rank) {
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
