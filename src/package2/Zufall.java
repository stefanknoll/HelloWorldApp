/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

/**
 *
 * @author s.knoll
 */

import java.util.Random;

public class Zufall {
    Random rand;

    public Zufall() {
        rand = new Random();
    }

    public int gibZahl() {
        return 1 +  rand.nextInt(25);
    }
    
}
