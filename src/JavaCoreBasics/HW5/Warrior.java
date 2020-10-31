package JavaCoreBasics.HW5;

import java.util.ArrayList;

public class Warrior {
    private int hp;
    private String name;

    private float srong;
    private float intelect;
    private float armor;
    private String rasa;
    private int weapon;
    private int armorItem;

    ArrayList<Warrior> arrayPlayers = new ArrayList<>();
    ArrayList arrayList = new ArrayList();

    public void createPlayers(Warrior warrior) {
        warrior.setWeapon(warrior.selectWeapon());
        warrior.setArmorItem(warrior.selectArmorItem());
        arrayPlayers.add(warrior);
    }

    public ArrayList getPlayers() {
        return arrayPlayers;
    }

    public int selectArmorItem() {
        int randomNumber = (int) (Math.random() * 3);
        SelectionArmor selectionArmorItem = new SelectionArmor();


        ArrayList<Integer> lisrArmor = new ArrayList<Integer>();
        lisrArmor.add(selectionArmorItem.getLaty());
        lisrArmor.add(selectionArmorItem.getShcyt());
        lisrArmor.add(selectionArmorItem.getShlem());

        return lisrArmor.get(randomNumber);
    }

    public int selectWeapon() {
        int randomNumber = (int) (Math.random() * 4);
        SelectonWeapon selectonWeapon = new SelectonWeapon();
        ArrayList<Integer> lisrWeapon = new ArrayList<Integer>();
        lisrWeapon.add(selectonWeapon.getBulava());
        lisrWeapon.add(selectonWeapon.getKinjal());
        lisrWeapon.add(selectonWeapon.getLuk());
        lisrWeapon.add(selectonWeapon.getMech());

        return lisrWeapon.get(randomNumber);
    }


    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getArmorItem() {
        return armorItem;
    }

    public void setArmorItem(int armorItem) {
        this.armorItem = armorItem;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getHp() {
        return hp;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public float getSrong() {
        return srong;
    }

    public void setSrong(float srong) {
        this.srong = srong;
    }

    public String getName() {
        return name;
    }

    public float getIntelect() {
        return intelect;
    }

    public void setIntelect(float intelect) {
        this.intelect = intelect;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }


}
