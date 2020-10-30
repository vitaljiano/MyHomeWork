package JavaCoreBasics.HW5;

public class Org extends Warrior {
    private int hp = 300;
    private float srong = 0.8f;
    private float intelect = 0.1f;
    private float armor = 0.9f;
    private String name;
    private String rasa = "Орк";
    private int weapon;
    private int armorItem;

    @Override
    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    @Override
    public int getArmorItem() {
        return armorItem;
    }

    public void setArmorItem(int armorItem) {
        this.armorItem = armorItem;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public Org(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSrong(float srong) {
        this.srong = srong;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public float getSrong() {
        return srong;
    }

    public float getIntelect() {
        return intelect;
    }

    public float getArmor() {
        return armor;
    }

}
