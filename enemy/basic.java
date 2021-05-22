package enemy;


public class Basic {

    double health;
    double attack;
    double defense;
    int mana;
    String ability;
    String hAbility;

    public Basic(int health,int attack, int defense, int mana, String ability, String hAbility){
        this.health=health;
        this.attack=attack;
        this.defense=defense;
        this.mana=mana;
        this.ability=ability;
        this.hAbility=hAbility;
    }
    public Basic(int health, int attack, int defense, int mana){
        this.health=health;
        this.attack=attack;
        this.defense=defense;
        this.mana=mana;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
    public String getAbility() {
        return ability;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public double getAttack() {
        return attack;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }
    public double getDefense() {
        return defense;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public double getHealth() {
        return health;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getMana() {
        return mana;
    }
    public void sethAbility(String hAbility) {
        this.hAbility = hAbility;
    }
    public String gethAbility() {
        return hAbility;
    }
}
