package JavaCoreBasics.HW5;

public class Gnom extends Warrior {
    private int hp = 150;
    private float srong = 0.5f;
    private float intelect = 0.4f;
    private float armor = 0.8f;
    private String name;
    private String rasa = "Гном";
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Gnom(String name) {
        this.name = name;
    }

    public void setSrong(float srong) {
        this.srong = srong;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
