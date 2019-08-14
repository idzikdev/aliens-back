package pl.idzikdev.XCom.stats.aliens;

import pl.idzikdev.XCom.entity.AlienEntity;
import pl.idzikdev.XCom.tools.Tools;

public class SectoidRaceStats {
  public static final int TIME_UNITS_MIN=54;
  public static final int TIME_UNITS_MAX=62;
  public static final int HEALTH_MIN=30;
  public static final int HEALTH_MAX=30;
  public static final int ENERGY_MIN=90;
  public static final int ENERGY_MAX=104;
  public static final int REACTIONS_MIN=63;
  public static final int REACTIONS_MAX=78;
  public static final int STRENGTH_MIN=30;
  public static final int STRENGTH_MAX=32;
  public static final int BRAVERY_MIN=80;
  public static final int BRAVERY_MAX=80;
  public static final int FIRING_ACCURACY_MIN=26;
  public static final int FIRING_ACCURACY_MAX=64;
  public static final int THROWING_ACCURACY_MIN=58;
  public static final int THROWING_ACCURACY_MAX=58;
  public static final int PSI_SKILL_MIN=40;
  public static final int PSI_SKILL_MAX=58;
  public static final int PSI_STRENGTH_MIN=50;
  public static final int PSI_STRENGTH_MAX=69;
  public static final int MELEE_ACCURACY_MIN=76;
  public static final int MELEE_ACCURACY_MAX=76;
  public static final int ARMOUR_FRONT_MIN=2;
  public static final int ARMOUR_FRONT_MAX=4;
  public static final int ARMOUR_LEFT_MIN=1;
  public static final int ARMOUR_LEFT_MAX=3;
  public static final int ARMOUR_RIGHT_MIN=1;
  public static final int ARMOUR_RIGHT_MAX=3;
  public static final int ARMOUR_REAR_MIN=1;
  public static final int ARMOUR_REAR_MAX=2;
  public static final int ARMOUR_UNDER_MIN=1;
  public static final int ARMOUR_UNDER_MAX=2;
  public static final int ENERGY_RECOVERY_MIN=30;
  public static final int ENERGY_RECOVERY_MAX=30;
  public static final int VICTORY_POINTS_MIN=10;
  public static final int VICTORY_POINTS_MAX=20;
  public static final int AGGRESSION_MIN=1;
  public static final int AGGRESSION_MAX=2;
  public static final int INTELLIGENCE_MIN=3;
  public static final int INTELLIGENCE_MAX=7;
  public static final int HEIGHT_STANDING_MIN=16;
  public static final int HEIGHT_STANDING_MAX=16;
  public static final int HEIGHT_KNEELING_MIN=12;
  public static final int HEIGHT_KNEELING_MAX=12;
  public static final boolean VALID_RANK_SOLDIER=true;
  public static final boolean VALID_RANK_NAVIGATOR=true;
  public static final boolean VALID_RANK_MEDIC=true;
  public static final boolean VALID_RANK_ENGINEER=true;
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

  public SectoidRaceStats() {
    this.timeUnits= Tools.drawNumber(SectoidRaceStats.TIME_UNITS_MIN,SectoidRaceStats.TIME_UNITS_MAX);
    this.health=Tools.drawNumber(SectoidRaceStats.HEALTH_MIN,SectoidRaceStats.HEALTH_MAX);
    this.energy=Tools.drawNumber(SectoidRaceStats.ENERGY_MIN,SectoidRaceStats.ENERGY_MAX);
    this.reactions=Tools.drawNumber(SectoidRaceStats.REACTIONS_MIN,SectoidRaceStats.REACTIONS_MAX);
    this.strength=Tools.drawNumber(SectoidRaceStats.STRENGTH_MIN,SectoidRaceStats.STRENGTH_MAX);
    this.bravery=Tools.drawNumber(SectoidRaceStats.BRAVERY_MIN,SectoidRaceStats.BRAVERY_MAX);
    this.firingAccuracy=Tools.drawNumber(SectoidRaceStats.FIRING_ACCURACY_MIN,SectoidRaceStats.FIRING_ACCURACY_MAX);
    this.throwingAccuracy=Tools.drawNumber(SectoidRaceStats.THROWING_ACCURACY_MIN,SectoidRaceStats.THROWING_ACCURACY_MAX);
    this.psiSkill=Tools.drawNumber(SectoidRaceStats.PSI_SKILL_MIN,SectoidRaceStats.PSI_SKILL_MAX);
    this.psiStrength=Tools.drawNumber(SectoidRaceStats.PSI_STRENGTH_MIN,SectoidRaceStats.PSI_STRENGTH_MAX);
    this.meleeAccuracy=Tools.drawNumber(SectoidRaceStats.MELEE_ACCURACY_MIN,SectoidRaceStats.MELEE_ACCURACY_MAX);
    this.armourFront=Tools.drawNumber(SectoidRaceStats.ARMOUR_FRONT_MIN,SectoidRaceStats.ARMOUR_FRONT_MAX);
    this.armourLeft=Tools.drawNumber(SectoidRaceStats.ARMOUR_LEFT_MIN,SectoidRaceStats.ARMOUR_LEFT_MAX);
    this.armourRight=Tools.drawNumber(SectoidRaceStats.ARMOUR_RIGHT_MIN,SectoidRaceStats.ARMOUR_RIGHT_MAX);
    this.armourRear=Tools.drawNumber(SectoidRaceStats.ARMOUR_REAR_MIN,SectoidRaceStats.ARMOUR_REAR_MAX);
    this.armourUnder=Tools.drawNumber(SectoidRaceStats.ARMOUR_UNDER_MIN,SectoidRaceStats.ARMOUR_UNDER_MAX);
    this.energyRecovery=Tools.drawNumber(SectoidRaceStats.ENERGY_RECOVERY_MIN,SectoidRaceStats.ENERGY_RECOVERY_MAX);
    this.victoryPoints=Tools.drawNumber(SectoidRaceStats.VICTORY_POINTS_MIN,SectoidRaceStats.VICTORY_POINTS_MAX);
    this.aggression=Tools.drawNumber(SectoidRaceStats.AGGRESSION_MIN,SectoidRaceStats.AGGRESSION_MAX);
    this.intelligence=Tools.drawNumber(SectoidRaceStats.INTELLIGENCE_MIN,SectoidRaceStats.INTELLIGENCE_MAX);
    this.heightStanding=Tools.drawNumber(SectoidRaceStats.HEIGHT_STANDING_MIN,SectoidRaceStats.HEIGHT_STANDING_MAX);
    this.heightKneeling=Tools.drawNumber(SectoidRaceStats.HEIGHT_KNEELING_MIN,SectoidRaceStats.HEIGHT_KNEELING_MAX);
  }

  public AlienEntity buildSectoidEntity(String breed, String rank) {
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
