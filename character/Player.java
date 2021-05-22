package character;

public class Player {
    String name;
    String attribute;
    String race;
    String clazz;

    double health;
    int intel;
    int stamina;
    double attack;
    double defense;

    public Player(){
        this.attack=100;
        this.attribute="Light";
        this.race="Human";
        this.clazz="Knight";
        this.name="Arwin";
        this.health=100;
        this.intel=100;
        this.stamina=100;
        this.attack=100;
        this.defense=100;

    }

    public Player(String name, String race, String clazz){
        this.name=name;
        this.race=race;
        this.clazz=clazz;
    }
    public Player(String name, String attribute, String race, String clazz, int health, int intel, int stamina, int attack, int defense){

        this.name=name;
        this.attribute=attribute;
        this.race=race;
        this.clazz=clazz;
        this.health=health;
        this.intel=intel;
        this.stamina=stamina;
        this.attack=attack;
        this.defense=defense;
    }

    public double getAttack() {
        return attack;
    }
    public String getAttribute() {
        return attribute;
    }
    public double getDefense() {
        return defense;
    }
    public double getHealth() {
        return health;
    }
    public int getIntel() {
        return intel;
    }
    public String getName() {
        return name;
    }
    public String getRace() {
        return race;
    }
    public int getStamina() {
        return stamina;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    public void setDefense(double defense) {
        this.defense = defense;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public void setIntel(int intel) {
        this.intel = intel;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public String getClazz() {
        return clazz;
    }
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
    
