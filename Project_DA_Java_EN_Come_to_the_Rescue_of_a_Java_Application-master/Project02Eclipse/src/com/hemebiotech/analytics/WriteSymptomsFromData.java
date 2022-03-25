package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * To save the list of Symptoms, count and order, in the external file
 */


public class WriteSymptomsFromData implements ISymptomWriter {

    /**
     * @param listOrderSymptoms : Hashmap with all informations
     *                          Take all listFinalSymotms's key and value, print in new file, line per line
     * @throws IOException if file can't be read
     */


    @Override
    public void saveSymptoms (Map<String, Integer> listOrderSymptoms) {


        if (listOrderSymptoms != null) {
            try {
                String localDir = System.getProperty ("user.dir");
                FileWriter writer = new FileWriter (localDir + "\\Ressources\\result.out");


                for (Map.Entry<String, Integer> listFinalSymptoms : listOrderSymptoms.entrySet ()) {

<<<<<<< HEAD
                    String key = listFinalSymptoms.getKey ();
                    Integer value = listFinalSymptoms.getValue ();
                    System.out.println (listFinalSymptoms);
                    writer.write (key + " = " + value + " \n ");
=======
                    String key = listFinalSymptoms.getKey();
                    Integer value = listFinalSymptoms.getValue();
                    System.out.println(listFinalSymptoms);
                    writer.write(key + " = " + value + "\n");
>>>>>>> petit_details

                }


                writer.close ();

            } catch (IOException e) {

<<<<<<< HEAD
                System.err.println ("Impossible de lire le contenu du fichier ");
            }
=======
                System.err.println(" Impossible de lire le contenu du fichier ");
                }
>>>>>>> petit_details


        }


    }

}




