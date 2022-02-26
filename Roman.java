/*  
Code: Integer to Roman
@author: Soumy Jain
IDE: Eclipse
*/

public String intToRoman(int num) {
    String result = "";   // We are trying to store the result in String result
    HashMap<Integer,String> map = new HashMap<>(); // Making a Hashmap of Integer and String type
    
   /* Inserting all the numbers to their corresponding romans in the Hashmap */
    map.put(1000,"M");
    map.put(900,"CM");
    map.put(500,"D");
    map.put(400,"CD");
    map.put(100,"C");
    map.put(90,"XC");
    map.put(50,"L");
    map.put(40,"XL");
    map.put(10,"X");
    map.put(9,"IX");
    map.put(5,"V");
    map.put(4,"IV");
    map.put(1,"I");
    
  // Iterating over the loop while given number > 0
    while(num > 0){
	// Looping through the Hashmap keys
        for(int key : map.keySet()){
            if(num >= key){
		// Adding the key value in result
                result = result + map.get(key);
                num = num - key;
                break;
            }
        }
    }
    // Finally returning the answer result
    return result;
}

/*
@author Sarthak Vinayaka
Code - Roman to Integer
IDE - Eclipse
*/
public int romanToInt(String s) {
		  int result = 0 ;
		  char[] digits = s.toCharArray();
		  if(digits.length > 0){
              /* Initialize value map for Roman chars  */
			  int[] valueMap = new int[26];
			  valueMap['I' - 'A'] = 1;
			  valueMap['V' - 'A'] = 5;
			  valueMap['X' - 'A'] = 10;
			  valueMap['L' - 'A'] = 50;
			  valueMap['C' - 'A'] = 100;
			  valueMap['D' - 'A'] = 500;
			  valueMap['M' - 'A'] = 1000;
			  int lastIndex = digits[0] - 'A';
			  result = valueMap[lastIndex];
			  for(int i = 1 ; i < digits.length ; i++){
				  int currentIndex = digits[i] - 'A'; 
                  // If previous number was smaller in value then remove the previous and decrease the current value by previous value
				  if(valueMap[lastIndex] < valueMap[currentIndex]){ 
					  result = result - 2*valueMap[lastIndex] + valueMap[currentIndex] ;
				  }else{
					  result+= valueMap[currentIndex]; // just add the current value
				  }
				  lastIndex = currentIndex; // update last index
			  }
		  }
		  return result;
	  }