package Character;

import Weapon.Weapon;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Person extends Character{
    @Override
    public void attack(Weapon weapon, Character targetCharacter) {
        weapon.attack(targetCharacter);//向上造型
    }
}
