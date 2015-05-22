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
public class ZufallszahlGroesserZehn {
    Zufall z;

    public ZufallszahlGroesserZehn() {
        z = new Zufall();
    }
    
    public int zufallszahlGroesserZehn() {
        int zahlgroesser10 = 0;
        z = new Zufall();
        while (zahlgroesser10 <= 10){
            zahlgroesser10 = z.gibZahl();
        }
        return zahlgroesser10;
    }

    public static void main(String args[]) {
        ZufallszahlGroesserZehn zufallszahl = new ZufallszahlGroesserZehn();
        System.out.println(zufallszahl.zufallszahlGroesserZehn());
    }
    
}
