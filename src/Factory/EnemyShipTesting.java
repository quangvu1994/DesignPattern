package Factory;
import java.util.*;

/**
 * Created by Quang on 11/8/15.
 */

/**
 * An usual way of creating objects (THIS IS NOT FACTORY)
 */
public class EnemyShipTesting {

    public static void main (String args[]){
        EnemyShip theEnemy = new UFOEnemyShip();

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";

        System.out.print("What type of Ship? (U/R)");
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        if(enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        }else{
            theEnemy = new RocketEnemyShip();
        }
        doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
