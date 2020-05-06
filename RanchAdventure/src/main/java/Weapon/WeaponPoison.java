package Weapon;
import Character.Character;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public abstract class WeaponPoison extends Weapon{
    public WeaponPoison(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override
    public void attack(Character enemyCharacter) {
        enemyCharacter.setHP(enemyCharacter.getHP()+this.getDamagePoints());
    }
}
