package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Just to save the list of Symptoms, count and oder, in the external file
 */


    public class WriteSymptomsFromData  implements ISymptomWriter {

    /**
     *
     * @param listOrderSymptoms : Hashmap with all informations
     * Take all listFinalSymotms's key and value, print in new file, line per line
     *
     * @throws IOException
     *              if file can't be read
     */


    @Override
    public  void saveSymptoms(Map <String, Integer> listOrderSymptoms) {


        if (listOrderSymptoms != null) {
            try {
                FileWriter writer = new FileWriter("result.out");


                for (Map.Entry<String, Integer> listFinalSymptoms : listOrderSymptoms.entrySet()) {
                    String key = listFinalSymptoms.getKey();
                    Integer value = listFinalSymptoms.getValue();
                    System.out.println(listFinalSymptoms);
                    writer.write(key + " = " + value + "\n");
                }


                writer.close();

            } catch (IOException e) {

                System.err.println("Impossible de lire le contenu du fichier");
                }


        }


    }

}




