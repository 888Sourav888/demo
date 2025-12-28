package LLD.CreationalPatterns.PrototypePattern;

import java.util.*;

import LLD.CreationalPatterns.PrototypePattern.Prototype.Enemy;

public class client {
    public static void main(String[] args) {
        // Using prototype pattern with a registry of enemy types

        Map<String , Enemy> enemyTypes = new HashMap<>() ; 

        enemyTypes.put("Ogre" , new Enemy(50, 100, "Ogre")) ;
        enemyTypes.put("Draugr" , new Enemy(30, 80, "Draugr")) ;

        Enemy  ogrePrototype = enemyTypes.get("Ogre").clone() ;
        Enemy  draugrPrototype = enemyTypes.get("Draugr").clone() ; 

        Enemy ogre1 = ogrePrototype.clone() ;
        ogre1.attack();
        Enemy draugr1 = draugrPrototype.clone() ; 
        draugr1.attack();
        Enemy draugr2 = draugrPrototype.clone() ; 
        draugr2.health-- ; 
        draugr1.displayHealth();
        draugr2.displayHealth();
        
        
    }
}
