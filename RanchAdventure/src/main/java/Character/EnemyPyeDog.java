package Character;

import Weapon.Weapon;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class EnemyPyeDog extends Enemy{
    @Override
    public void attack(Weapon weapon, Character targetCharacter) {
        weapon.attack(targetCharacter);
    }
}
