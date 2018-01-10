package fr.istic.m2miage.prm2;

import java.io.File;

import static fr.istic.m2miage.prm2.EmlManager.BASE_PATH;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        try {
            EmlManager.display(new File(BASE_PATH + "Votre tablette tactile OFFERTE avec votre abonnement au Point - Le Point (news@mix.loffremagique.com) - 2015-10-10 0900.eml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
