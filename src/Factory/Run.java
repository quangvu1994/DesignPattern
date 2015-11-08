package Factory;
import java.util.*;
/**
 * Created by Quang on 11/8/15.
 */
public class Run {
    public static void main(String args[]){
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;
        System.out.println("What type of ship (U/R/B)");
        Scanner userInput = new Scanner(System.in);
        if(userInput.hasNextLine()){
            theEnemy = shipFactory.makeEnemyShip(userInput.nextLine());
        }

        if(theEnemy != null){
            doStuff(theEnemy);
        }else{
            System.out.println("Enter a U, R, or B ");
        }
    }

    public static void doStuff(EnemyShip enemy){
        enemy.displayEnemyShip();
        enemy.followHeroShip();
        enemy.enemyShipShoots();
    }
}
