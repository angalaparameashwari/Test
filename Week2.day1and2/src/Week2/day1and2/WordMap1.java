/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Week2.day1and2;

import java.util.*;
import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

public class WordMap1{
	public static void createWordMap(ArrayList<String> listInput){
		/*listOfIntegers
    	.stream()
    	.forEach(e -> System.out.print(e + " "));
		System.out.println("");*/
		//Map< Integer,String > hm = new HashMap< Integer,String >(); 
		MultiMap hm = new MultiValueMap();

		ArrayList<String> wordList = new ArrayList<String>();
		for(int i = 0 ; i < listInput.size() ;  i++)
		{
			int x = listInput.get(i).length();
			System.out.println(x);

			if(hm.containsKey(x))
			{

				hm.put(x, listInput.get(i));
			}
			else
			{
				hm.put(x, listInput.get(i));
			}
		}


		for(Map.Entry m: hm.entrySet()){
			System.out.println(m.getKey()+ "value is" + m.getValue());
		}
		/*Map< Integer,String > hm = new HashMap< Integer,String >(); 
		ArrayList<String> wordList = new ArrayList<String>();
		for(int i = 0 ; i < listInput.size() ;  i++)
		{
			int x = listInput.get(i).length();
			System.out.println(x);

			if(hm.containsKey(x))
				hm.put(x, listInput.get(i));
			else
				hm.put(x, listInput.get(i));
		}


		for(Map.Entry m: hm.entrySet()){
			System.out.println(m.getKey()+ "value is" + m.getValue());
		}*/
	}
	public static void main(String args[]){

		String[] inputWords = {"Find","it","here","Ap","Confidence"};

		//ArrayList<String> inputWordList = new ArrayList<>(Arrays.asList(inputWord));
		ArrayList<String> inputWordList = new ArrayList<String>(Arrays.asList(inputWords));
		//System.out.println(inputWordList.toString());
		createWordMap(inputWordList);
	}
}
