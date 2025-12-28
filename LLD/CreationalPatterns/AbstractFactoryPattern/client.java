package LLD.CreationalPatterns.AbstractFactoryPattern;

import LLD.CreationalPatterns.AbstractFactoryPattern.Factory.DraugrEnemyFactory;
import LLD.CreationalPatterns.AbstractFactoryPattern.Factory.EnemyFactory;
import LLD.CreationalPatterns.AbstractFactoryPattern.Factory.OgreEnemyFactory;

public class client {
    public static void main(String[] args){
        EnemyFactory ogreFactory = new OgreEnemyFactory() ; 
        EnemyFactory draugrFactory = new DraugrEnemyFactory() ; 

        Enemy draugrLevel1 = new Draugr(
            draugrFactory.createLightAttack(10),
            draugrFactory.createHeavyAttack(20)
        ) ;
        Enemy draugrLevel3 = new Draugr(
            draugrFactory.createLightAttack(30),
            draugrFactory.createHeavyAttack(40)
        ) ;

        Enemy ogreLevel1 = new Ogre(
            ogreFactory.createLightAttack(15),
            ogreFactory.createHeavyAttack(25)
        ) ;

        draugrLevel1.lightAttack.lightAttack();
        draugrLevel3.heavyAttack.heavyAttack();
        ogreLevel1.heavyAttack.heavyAttack();
    }
}
