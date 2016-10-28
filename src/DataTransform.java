import java.util.Arrays;

public class DataTransform {
	public static void main(String[] args){
		//String[] arr = {"Star", "Wars", "Episode", "VII", "The", "Force", "Awakens"};
		String arr1 = "cool the just what happened cool";
		String arr2 = "cool in the next that";
		//System.out.println(maxLenght(arr));
		//System.out.println(Arrays.toString(splitString(arr1)));
		System.out.println(Arrays.toString(intersectWords(arr1,arr2)));
	}
	public static int maxLenght(String[] x){
		int maxLenght = 0;
		for (String elem: x) {
			int y = elem.length();
			if (y > maxLenght){
				maxLenght = y;
			}
		}	
		return maxLenght;

	}
	public static String[] splitString(String x) {
		int space = x.indexOf(" ");


		String[] arr = new String[x.lastIndexOf(" ")];

		int i = 0;

		while (!(space == -1)){
			String y = x.substring(0, space);
			arr[i] = y;	
			i++;
			x = x.substring(space + 1);
			space = x.indexOf(" ");
		}
		arr[i] = x;
		String[] arr1 = Arrays.copyOf(arr, i + 1);
		return arr1;
	}
	public static String[] intersectWords(String x, String y){

		String[] new1 = splitString(x);

		String[] new2 = splitString(y);

		int key = new1.length + new2.length;
		
		int k = 0;

		String [] arr2 = new String[key];



		for (String elem: new1) {

			for (String elem1: new2){

				if (elem.equals(elem1)){

					arr2[k] = elem;

					k++;

				}
			}

		}
		String [] arr3 = Arrays.copyOf(arr2, k);
		return arr3;

	}
	public static void wordLengthsTally(String[] x){
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
