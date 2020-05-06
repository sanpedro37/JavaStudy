package Weapon;
import Character.Character;
/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class WeaponEnemyWeapon extends Weapon{
    public WeaponEnemyWeapon(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override
    public void attack(Character enemyCharacter) {
        enemyCharacter.setHP(enemyCharacter.getHP()+this.getDamagePoints());
    }//更改person的id
}
