package Weapon;
import Character.Character;
/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public abstract class Weapon {
    private String id;
    private String description;
    int damagePoints;
    public abstract void attack(Character enemyCharacter);

    public Weapon() {
    }

    public Weapon(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Weapon(String id, String description, int damagePoints) {
        this.id = id;
        this.description = description;
        this.damagePoints = damagePoints;
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

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

}
