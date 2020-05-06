package Character;
import Weapon.Weapon;

import java.util.ArrayList;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public abstract class Character {
    private String id;
    private String description;
    private int HP;
    private Weapon CurrentWeapon;
    private ArrayList<Weapon> weapons=new ArrayList<Weapon>();

    public abstract void attack(Weapon weapon, Character targetCharacter);

    public Character() {
    }

    public Character(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Character(String id, String description, int HP) {
        this.id = id;
        this.description = description;
        this.HP = HP;
    }

    public Weapon getCurrentWeapon() {
        return CurrentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        CurrentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
