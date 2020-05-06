package Scene;
import Character.*;
import Weapon.*;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class Sense {
    private Person person=new Person();
    private EnemyPyeDog dog1=new EnemyPyeDog();
    private EnemyPyeDog dog2=new EnemyPyeDog();
    private EnemyPyeDog dog3=new EnemyPyeDog();
    private EnemyPyeDogSet enemyPyeDogSet=new EnemyPyeDogSet();

    //初始化
    public void initSense(){
        initPerson();
        initEnemy();
    }
    public void initPerson(){
        person.setDescription("小明");
        person.setId("19970827");
        person.setHP(500);
        person.setCurrentWeapon(new WeaponChop("weapon2","龙晶匕首",-50));
    }
    public void initEnemy(){
        dog1.setId("dog1");
        dog1.setDescription("跛脚的独眼野狗");
        dog1.setHP(50);
        dog1.setCurrentWeapon(new WeaponEnemyWeapon("weaponEnemyWeapon2", "撕咬", -20));

        dog2.setId("dog2");
        dog2.setDescription("断尾的独眼野狗");
        dog2.setHP(50);
        dog2.setCurrentWeapon(new WeaponEnemyWeapon("weaponEnemyWeapon2", "撕咬", -20));

        dog3.setId("dog3");
        dog3.setDescription("红眼的独眼野狗");
        dog3.setHP(60);
        dog3.setCurrentWeapon(new WeaponEnemyWeapon("weaponEnemyWeapon2", "撕咬", -30));

        enemyPyeDogSet.getEnemyPyeDogs().add(dog1);
        enemyPyeDogSet.getEnemyPyeDogs().add(dog2);
        enemyPyeDogSet.getEnemyPyeDogs().add(dog3);
    }
    public void play(){
        System.out.println("=======================================================================================");
        System.out.println("跛脚的独眼野狗生命值："+dog1.getHP());
        System.out.println("小明使用"+person.getCurrentWeapon().getDescription()+"使跛脚的独眼野狗的HP"+person.getCurrentWeapon().getDamagePoints());
        person.attack(person.getCurrentWeapon(),dog1);
        System.out.println("跛脚的独眼野狗生命值："+dog1.getHP());

        System.out.println("=======================================================================================");
        System.out.println("小明的生命值："+person.getHP());
        System.out.println("跛脚的独眼野狗使用"+dog1.getCurrentWeapon().getDescription()+"使小明的HP"+dog1.getCurrentWeapon().getDamagePoints());
        dog1.attack(dog1.getCurrentWeapon(),person);
        System.out.println("小明的生命值："+person.getHP());

        System.out.println("=======================================================================================");
        System.out.println("断尾的独眼野狗："+dog2.getHP());
        System.out.println("小明使用"+person.getCurrentWeapon().getDescription()+"使断尾的独眼野狗的HP"+person.getCurrentWeapon().getDamagePoints());
        person.attack(person.getCurrentWeapon(),dog2);
        System.out.println("断尾的独眼野狗："+dog2.getHP());

        System.out.println("=======================================================================================");
        System.out.println("小明的生命值："+person.getHP());
        System.out.println("跛脚的独眼野狗使用"+dog2.getCurrentWeapon().getDescription()+"使小明的HP"+dog2.getCurrentWeapon().getDamagePoints());
        dog2.attack(dog2.getCurrentWeapon(),person);
        System.out.println("小明的生命值："+person.getHP());

        System.out.println("=======================================================================================");
        System.out.println("红眼的独眼野狗："+dog3.getHP());
        System.out.println("小明使用"+person.getCurrentWeapon().getDescription()+"使红眼独眼野狗的HP"+person.getCurrentWeapon().getDamagePoints());
        person.attack(person.getCurrentWeapon(),dog3);
        System.out.println("红眼的独眼野狗："+dog3.getHP());

        System.out.println("=======================================================================================");
        System.out.println("小明的生命值："+person.getHP());
        System.out.println("跛脚的独眼野狗使用"+dog3.getCurrentWeapon().getDescription()+"使小明的HP"+dog3.getCurrentWeapon().getDamagePoints());
        dog3.attack(dog3.getCurrentWeapon(),person);
        System.out.println("小明的生命值："+person.getHP());
    }
}
