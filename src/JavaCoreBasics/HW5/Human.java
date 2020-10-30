package JavaCoreBasics.HW5;

public class Human extends Warrior {
    private int hp = 200;
    private float srong = 0.6f;
    private float intelect = 0.5f;
    private float armor = 0.5f;
    private String name;
    private String rasa = "Людина";
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


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
