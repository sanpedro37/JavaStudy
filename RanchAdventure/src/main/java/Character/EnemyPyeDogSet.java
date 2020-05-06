package Character;

import java.util.ArrayList;

/**
 * @description:
 * @author: QuJingYi
 * @date:
 * @version:
 * @modified By:
 */
public class EnemyPyeDogSet {
    private ArrayList<EnemyPyeDog> enemyPyeDogs=new ArrayList<>();
    public EnemyPyeDogSet(){

    }

    public EnemyPyeDogSet(ArrayList<EnemyPyeDog> enemyPyeDogs) {
        this.enemyPyeDogs = enemyPyeDogs;
    }

    public ArrayList<EnemyPyeDog> getEnemyPyeDogs() {
        return enemyPyeDogs;
    }

    public void setEnemyPyeDogs(ArrayList<EnemyPyeDog> enemyPyeDogs) {
        this.enemyPyeDogs = enemyPyeDogs;
    }
}
