/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import static Modele.Etat.Inondee;
import Utile.Message;
import Utile.aMessage;
import View.VueMenu;
import ileinterdite.IleInterdite;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author chaulaic
 */
public class Controleur {
    private int niveauEaux;
    private ArrayList<Aventurier> joueurs;
    private Grille grille;
    private ArrayList<Cartes> cartes;
    
    private aMessage message;
    
    
    
    
    public void jouer() {
        
    }
    
    public void lanceIHM(){
        
    }
    
    public Collection getTuileInondée(Grille g) {
        Collection<Tuiles> collecTuilesIn = new ArrayList();
        for (Tuiles t : g.getTuiles()) {
            if (t.getEtat() == Inondee) {
                collecTuilesIn.add(t);
            }        
        }
        return collecTuilesIn;
    }
    
    public void piocheCarte() {
        
    }   
   
    String listeTuile[]= {"","","LePontDesAbimes","LaPorteDeBronze","","",
                          "","LaCaverneDesOmbres","LaPorteDeFer","LaPorteDOr","LesFalaisesDeLOubli","",
                          "LePalaisDeCorail","LaPorteDArgent","LesDunesDeLIllusion","Heliport","LaPorteDeCuivre","LeJardinDesHurlements",
                          "LaForetPourpre","LeLagonPerdu","LeMaraisBrumeux","Observatoire","LeRocherFantome","LaCaverneDuBrasier",
                          "","LeTempleDuSoleil","LeTempleDeLaLune","LePalaisDesMarees","LeValDuCrepuscule","",
                          "","","LaTourDuGuet","LeJardinDesMurmures","",""};
    
    public void patata(Grille g){
        for (int l = 0; l <= 6;l++) {
            for (int c = 0; c <= 6; c++) {
                if ((l==1 || l==2 ) || (l == 5 || l== 6)) {
                    if ((c==1 || c==2 ) || (c == 5 || c==6)) {
                        continue;
                    }
                } else {
                    g.addTuiles((l*6 + c),(new Tuiles(listeTuile[l*6 + 6], new CoorD(l,c) )));
            }
        }
    }
    
}
  
    
    public Message Listen(){
        System.out.println("test listener");
        return message.getMessage();
    }
          
}
