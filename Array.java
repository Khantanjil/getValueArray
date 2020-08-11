public class Array{
	public static void main(String[] args){
		int[] array = {40, 80, 120, 160};
		int array_size = array.length;
		for(int i = 0; i < array_size; i++){
			if(i == array_size - array_size){
				System.out.println("The first value of the array is: " + array[i]);
			} else if(i == array_size - 1){
				System.out.println("The last value of the array is: " + array[i]);
			} else if(i == array_size - 2){
				System.out.println("The penultimate value of the array is: " + array[i]);
			} else if(i == array_size - array_size + 1){
				System.out.println("The second value of the array is: " + array[i]);
			} else{
				System.out.println("Couldn't get any values. Sorry!");
			}
		}
	}
}