package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

import java.util.Random;

public class CelatidRaceStats {
    public static final int TIME_UNITS_MIN = 70;
    public static final int TIME_UNITS_MAX = 81;
    public static final int HEALTH_MIN = 62;
    public static final int HEALTH_MAX = 62;
    public static final int ENERGY_MIN = 90;
    public static final int ENERGY_MAX = 104;
    public static final int REACTIONS_MIN = 40;
    public static final int REACTIONS_MAX = 49;
    public static final int STRENGTH_MIN = 70;
    public static final int STRENGTH_MAX = 75;
    public static final int BRAVERY_MIN = 90;
    public static final int BRAVERY_MAX = 90;
    public static final int FIRING_ACCURACY_MIN = 50;
    public static final int FIRING_ACCURACY_MAX = 124;
    public static final int THROWING_ACCURACY_MIN = 0;
    public static final int THROWING_ACCURACY_MAX = 0;
    public static final int PSI_SKILL_MIN = 0;
    public static final int PSI_SKILL_MAX = 0;
    public static final int PSI_STRENGTH_MIN = 60;
    public static final int PSI_STRENGTH_MAX = 69;
    public static final int MELEE_ACCURACY_MIN = 80;
    public static final int MELEE_ACCURACY_MAX = 80;
    public static final int ARMOUR_FRONT_MIN = 20;
    public static final int ARMOUR_FRONT_MAX = 20;
    public static final int ARMOUR_LEFT_MIN = 20;
    public static final int ARMOUR_LEFT_MAX = 20;
    public static final int ARMOUR_RIGHT_MIN = 20;
    public static final int ARMOUR_RIGHT_MAX = 20;
    public static final int ARMOUR_REAR_MIN = 20;
    public static final int ARMOUR_REAR_MAX = 20;
    public static final int ARMOUR_UNDER_MIN = 20;
    public static final int ARMOUR_UNDER_MAX = 20;
    public static final int ENERGY_RECOVERY_MIN = 40;
    public static final int ENERGY_RECOVERY_MAX = 40;
    public static final int VICTORY_POINTS_MIN = 20;
    public static final int VICTORY_POINTS_MAX = 20;
    public static final int AGGRESSION_MIN = 2;
    public static final int AGGRESSION_MAX = 2;
    public static final int INTELLIGENCE_MIN = 4;
    public static final int INTELLIGENCE_MAX = 4;
    public static final int HEIGHT_STANDING_MIN = 16;
    public static final int HEIGHT_STANDING_MAX = 16;
    public static final int HEIGHT_KNEELING_MIN = 16;
    public static final int HEIGHT_KNEELING_MAX = 16;
    public static final boolean VALID_RANK_SOLDIER = false;
    public static final boolean VALID_RANK_NAVIGATOR = false;
    public static final boolean VALID_RANK_MEDIC = false;
    public static final boolean VALID_RANK_ENGINEER = false;
    public static final boolean VALID_RANK_TERRORIST = true;
    public static final boolean VALID_RANK_LEADER = false;
    public static final boolean VALID_RANK_COMMANDER = false;
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


    public CelatidRaceStats() {
        this.timeUnits = Tools.drawNumber(CelatidRaceStats.TIME_UNITS_MIN, CelatidRaceStats.TIME_UNITS_MAX);
        this.health = Tools.drawNumber(CelatidRaceStats.HEALTH_MIN, CelatidRaceStats.HEALTH_MAX);
        this.energy = Tools.drawNumber(CelatidRaceStats.ENERGY_MIN, CelatidRaceStats.ENERGY_MAX);
        this.reactions = Tools.drawNumber(CelatidRaceStats.REACTIONS_MIN, CelatidRaceStats.REACTIONS_MAX);
        this.strength = Tools.drawNumber(CelatidRaceStats.STRENGTH_MIN, CelatidRaceStats.STRENGTH_MAX);
        this.bravery = Tools.drawNumber(CelatidRaceStats.BRAVERY_MIN, CelatidRaceStats.BRAVERY_MAX);
        this.firingAccuracy = Tools.drawNumber(CelatidRaceStats.FIRING_ACCURACY_MIN, CelatidRaceStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy = Tools.drawNumber(CelatidRaceStats.THROWING_ACCURACY_MIN, CelatidRaceStats.THROWING_ACCURACY_MAX);
        this.psiSkill = Tools.drawNumber(CelatidRaceStats.PSI_SKILL_MIN, CelatidRaceStats.PSI_SKILL_MAX);
        this.psiStrength = Tools.drawNumber(CelatidRaceStats.PSI_STRENGTH_MIN, CelatidRaceStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy = Tools.drawNumber(CelatidRaceStats.MELEE_ACCURACY_MIN, CelatidRaceStats.MELEE_ACCURACY_MAX);
        this.armourFront = Tools.drawNumber(CelatidRaceStats.ARMOUR_FRONT_MIN, CelatidRaceStats.ARMOUR_FRONT_MAX);
        this.armourLeft = Tools.drawNumber(CelatidRaceStats.ARMOUR_LEFT_MIN, CelatidRaceStats.ARMOUR_LEFT_MAX);
        this.armourRight = Tools.drawNumber(CelatidRaceStats.ARMOUR_RIGHT_MIN, CelatidRaceStats.ARMOUR_RIGHT_MAX);
        this.armourRear = Tools.drawNumber(CelatidRaceStats.ARMOUR_REAR_MIN, CelatidRaceStats.ARMOUR_REAR_MAX);
        this.armourUnder = Tools.drawNumber(CelatidRaceStats.ARMOUR_UNDER_MIN, CelatidRaceStats.ARMOUR_UNDER_MAX);
        this.energyRecovery = Tools.drawNumber(CelatidRaceStats.ENERGY_RECOVERY_MIN, CelatidRaceStats.ENERGY_RECOVERY_MAX);
        this.victoryPoints = Tools.drawNumber(CelatidRaceStats.VICTORY_POINTS_MIN, CelatidRaceStats.VICTORY_POINTS_MAX);
        this.aggression = Tools.drawNumber(CelatidRaceStats.AGGRESSION_MIN, CelatidRaceStats.AGGRESSION_MAX);
        this.intelligence = Tools.drawNumber(CelatidRaceStats.INTELLIGENCE_MIN, CelatidRaceStats.INTELLIGENCE_MAX);
        this.heightStanding = Tools.drawNumber(CelatidRaceStats.HEIGHT_STANDING_MIN, CelatidRaceStats.HEIGHT_STANDING_MAX);
        this.heightKneeling = Tools.drawNumber(CelatidRaceStats.HEIGHT_KNEELING_MIN, CelatidRaceStats.HEIGHT_KNEELING_MAX);
    }

    public AlienEntity buildCelatidEntity(String breed, String rank) {
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
