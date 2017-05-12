package data;

// TO DO : DECIDERE LE VISIBILIT� DI ATTRIBUTI, METODI, CLASSI
/*Definiamo la classe Data per modellare un insieme di transizioni
 * (vettori attributo-valore)*/
class Data {
	
	private Object data [][]; // una matrice di Object che ha numero di righe pari al numero di transazioni da memorizzare e numero di colonne pari al numero di attributi in ciascuna transazione
	private int numberOfExamples;//cardinalit� dell�insieme di transazioni
	private Attribute attributeSet[];// un array di attributi, che sono avvalorati in ciascuna transazione
	
	/*La classe Data popola la matrice data[][] con le transizioni (14 transazioni per 5 attributi)
	 * Inoltre avvalora l'array attributeSet[] con cinque oggetti di DiscreteAttribute
	 * uno per ciascun attributo*/
	
	Data(){

		// numberOfExamples
		
		 numberOfExamples=14;		 
		 
		
		//explanatory Set
		
		attributeSet = new Attribute[5];

		// TO DO : avvalorare ciascune elemento di attributeSet con un oggetto della classe DiscreteAttribute che modella il corrispondente attributo (e.g. outlook, temperature,etc)
		// nel seguito si fornisce l'esempio per outlook
		
		String outLookValues[]=new String[3];
		outLookValues[0]="overcast";
		outLookValues[1]="rain";
		outLookValues[2]="sunny";
		attributeSet[0] = new DiscreteAttribute("Outlook",0, outLookValues);
		
		//Avvaloriamo gli attributi di Temperature
		String temperatureValue[] = new String[3];
		temperatureValue[0]="hot";
		temperatureValue[1]="mild";
		temperatureValue[2]="cool";
		attributeSet[1]= new DiscreteAttribute("temperature", 1, temperatureValue);
		
		//Avvaloro gli attibuti di humidity
		String humidityValue[] = new String[2];
		humidityValue[0]= "high";
		humidityValue[1]= "normal";
		attributeSet[2]= new DiscreteAttribute("humidity", 2, humidityValue);
		//Avvaloro gli attributi di wind
		String windValue[] = new String[2];
		windValue[0]= "weak";
		windValue[1]= "strong";
		attributeSet[3]= new DiscreteAttribute("wind", 3, windValue);
		//Avvaloro gli attributi di playTennis
		String playTennisValue[]= new String[2];
		playTennisValue[0]= "no";
		playTennisValue[1]= "yes";
		attributeSet[4]= new DiscreteAttribute("playTennis", 4, playTennisValue);

		//data
		
		data = new Object [14][5];

		// TO DO : memorizzare le transazioni secondo lo schema della tabella nelle specifiche
		data[0][0]=outLookValues[2];
		data[0][1]=temperatureValue[0];
		data[0][2]=humidityValue[0];
		data[0][3]=windValue[0];
		data[0][4]=playTennisValue[0];
		
		data[1][0]=outLookValues[2];
		data[1][1]=temperatureValue[0];
		data[1][2]=humidityValue[0];
		data[1][3]=windValue[1];
		data[1][4]=playTennisValue[0];

		data[2][0]=outLookValues[0];
		data[2][1]=temperatureValue[0];
		data[2][2]=humidityValue[0];
		data[2][3]=windValue[0];
		data[2][4]=playTennisValue[1];

		data[3][0]=outLookValues[1];
		data[3][1]=temperatureValue[1];
		data[3][2]=humidityValue[0];
		data[3][3]=windValue[0];
		data[3][4]=playTennisValue[1];

		data[4][0]=outLookValues[1];
		data[4][1]=temperatureValue[2];
		data[4][2]=humidityValue[1];
		data[4][3]=windValue[0];
		data[4][4]=playTennisValue[1];

		data[5][0]=outLookValues[1];
		data[5][1]=temperatureValue[2];
		data[5][2]=humidityValue[1];
		data[5][3]=windValue[1];
		data[5][4]=playTennisValue[0];

		data[6][0]=outLookValues[0];
		data[6][1]=temperatureValue[2];
		data[6][2]=humidityValue[1];
		data[6][3]=windValue[1];
		data[6][4]=playTennisValue[1];

		data[7][0]=outLookValues[2];
		data[7][1]=temperatureValue[1];
		data[7][2]=humidityValue[0];
		data[7][3]=windValue[0];
		data[7][4]=playTennisValue[0];

		data[8][0]=outLookValues[2];
		data[8][1]=temperatureValue[2];
		data[8][2]=humidityValue[1];
		data[8][3]=windValue[0];
		data[8][4]=playTennisValue[1];

		data[9][0]=outLookValues[1];
		data[9][1]=temperatureValue[1];
		data[9][2]=humidityValue[1];
		data[9][3]=windValue[0];
		data[9][4]=playTennisValue[1];

		data[10][0]=outLookValues[2];
		data[10][1]=temperatureValue[1];
		data[10][2]=humidityValue[1];
		data[10][3]=windValue[1];
		data[10][4]=playTennisValue[1];

		data[11][0]=outLookValues[0];
		data[11][1]=temperatureValue[1];
		data[11][2]=humidityValue[0];
		data[11][3]=windValue[1];
		data[11][4]=playTennisValue[1];

		data[12][0]=outLookValues[0];
		data[12][1]=temperatureValue[0];
		data[12][2]=humidityValue[1];
		data[12][3]=windValue[0];
		data[12][4]=playTennisValue[1];

		data[13][0]=outLookValues[1];
		data[13][1]=temperatureValue[1];
		data[13][2]=humidityValue[0];
		data[13][3]=windValue[1];
		data[13][4]=playTennisValue[0];

		
	}
	
	int getNumberOfExamples(){ //metodo che  restituisce il valore del membro  numberOfExamples 
		 
		 return numberOfExamples; //cardinalit� dell'insieme delle transazioni
	}
	
	int getNumberOfAttributes(){ //metodo che restituisce la cardinalit� del membro  attributeSet 
		 
		 return attributeSet.length;  //cardinalit� dell'nsieme degli attributi
	}
	
	Object getAttributeValue(int exampleIndex, int attributeIndex){
		//metodo che  restituisce il valore dell' attributo attributeIndex  per la transazione exampleIndex meomorizzata in data 
		// assume come  indice di riga per la matrice data che corrisponde ad una specifica transazione, indice di colonna per un attributo
		return data[exampleIndex][attributeIndex];  // valore assunto dall�attributo identificato da attributeIndex nella transazione identificata da exampleIndex nel membro data. 
	}
	
	Attribute getAttribute(int index){  //metodo che restituisce l�attributo in posizione attributeIndex di attributeSet 
		return attributeSet[index];  //attributo con indice attributeIndex
	}
	
	/*il metodo to String per ogni transazione memorizzata in data, concatena i valori assunti dagli attributi nella transazione 
	 * separati da virgole in una stringa. Le stringhe che rappresentano ogni transazione sono poi concatenate in un�unica stringa da 
	 *restituire in output. 
  */
	public String toString(){
		String stringa=new String();
		for(int i=0;i<data.length;i++){
			stringa+=(i+1)+":";
			for(int k=0;k<data[k].length;k++){
				stringa=stringa+data[i][k]+",";
			}
		stringa=stringa+"\n"; //concatenamento di stringhe
		}
		return stringa; //un unica stringa contente le stringhe concatenate
		
		
	}


	
	public static void main(String args[]){
		Data trainingSet=new Data();
		System.out.println(trainingSet);
	}

}