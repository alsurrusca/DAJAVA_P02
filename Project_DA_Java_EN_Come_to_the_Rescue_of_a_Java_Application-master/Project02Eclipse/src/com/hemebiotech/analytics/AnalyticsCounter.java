package com.hemebiotech.analytics;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Read, count and make symptoms in order.
 *
 *
 */




	public class AnalyticsCounter {


	private List<String> listSymptoms;
	private Map<String, Integer> listSymptomsCount = new HashMap<String, Integer>();
	private Map<String, Integer> listOrderSymptoms;


	public void start()  {

		this.getSymptoms();
		this.countSymptoms();
		this.orderSymptoms();
		this.saveSymptoms();
	}


	private void getSymptoms() {

		/**
		 * @see ReadSymptomDataFromFile
		 *
		 * return HashMap from file
		 */

		String localDir = System.getProperty("user.dir");
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(localDir + "\\Ressources\\symptoms.txt");
		listSymptoms = readSymptomDataFromFile.getSymptoms();



	}


	private void countSymptoms() {

		/**
		 *
		 * @param listSymtoms
		 * @return list of all symptom's occurrences
		 *
		 */

			for(String symptom : listSymptoms) {

				if (listSymptomsCount.containsKey(symptom)) {
					listSymptomsCount.put(symptom, (listSymptomsCount.get(symptom) + 1));
				}
					else {
						listSymptomsCount.put(symptom, 1);
					}


			}


		}




	public void orderSymptoms()  {

		/**
		 * Created hash map with keys as symptoms and values as occurencies
		 * Order by key
		 * @return LinkedHashMap
		 *
		 */
		listOrderSymptoms = listSymptomsCount.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(
						Map.Entry :: getKey,
						Map.Entry :: getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new


				));

	}






	private void saveSymptoms() {

		/**
		 *
		 *
		 * @see WriteSymptomsFromData
		 *
		 * @return void
		 *
		 */


			WriteSymptomsFromData writeSymptomsFromData = new WriteSymptomsFromData();
			writeSymptomsFromData.saveSymptoms(listOrderSymptoms);


	}


}



