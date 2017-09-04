package basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] examples = {1,2,3,4,5,6,7,8,10};
		System.out.println(min(examples));
		System.out.println(max(examples));
		System.out.println(avarage(examples));
	}
	
	static int sum(int n){
		if(n==0){
			return 0;
		}
		return (n+sum(n-1));
	}
	
	static int fac(int n){
		if(n==0){
			return 1;
		}
		return(n*fac(n-1));
	}
	
	
	static int min(int[] numbers){
		int value = numbers[0];
		for(int i=0;i<numbers.length;i++){
			value = (numbers[i]<value)?numbers[i]:value;
		}
		return value;
	}

	static int max(int[] numbers){
		int value = numbers[0];
		for(int i=0;i<numbers.length;i++){
			value = (numbers[i]>value)?numbers[i]:value;
		}
		return value;
	}
	
	static int avarage(int[] numbers){
		int value = 0;
		for(int i=0;i<numbers.length;i++){
			value += numbers[i];
		}
		return (value/numbers.length);
	}
}
