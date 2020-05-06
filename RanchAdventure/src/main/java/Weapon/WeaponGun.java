package Weapon;
import Character.Character;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public abstract class WeaponGun extends Weapon{
    public WeaponGun(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override
    public void attack(Character enemyCharacter) {
        enemyCharacter.setHP(enemyCharacter.getHP()+this.getDamagePoints());
    }
}
