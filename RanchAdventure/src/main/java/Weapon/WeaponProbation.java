package Weapon;
import Character.Character;

/**
 * @description:感化
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public abstract class WeaponProbation extends Weapon{
    public WeaponProbation(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override
    public void attack(Character enemyCharacter) {
        enemyCharacter.setHP(enemyCharacter.getHP()+this.getDamagePoints());
    }
}
