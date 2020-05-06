package Weapon;
import Character.Character;

/**
 * @description:刀砍
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class WeaponChop extends Weapon{
    public WeaponChop(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override
    public void attack(Character enemyCharacter) {
        enemyCharacter.setHP(enemyCharacter.getHP()+this.getDamagePoints());
    }
}//更改它的hp

