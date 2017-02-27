package base;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int iValue){
		this.iValue = iValue;
	}

	public int getiValue(){
		return iValue;
	}
	
	public static boolean isEven(int val){
		if(val % 2 == 0){
		return true;
		} else return false;
	}
	
	public static boolean isOdd(int val){
		if(val % 2 == 0){
			return false;
		} else return true;
	}
	
	public static boolean isPrime(int val){
		for(int i = 2; i < val; i++){
			if(val % i == 0){
				return false;
			}
		} return true;
	}
	
	public static boolean isEven(MyInteger mi){
		if(mi.getiValue() % 2 == 0){
		return true;
		} else return false;
	}
	
	public static boolean isOdd(MyInteger mi){
		if(mi.getiValue() % 2 == 0){
			return false;
		} else return true;
	}
	
	public static boolean isPrime(MyInteger mi){
		for(int i = 2; i < mi.getiValue(); i++){
			if(mi.getiValue() % i == 0){
				return false;
			}
		} return true;
	}
	
	public boolean equals(int val){
		return iValue == val;
	}
	
	public boolean equals(MyInteger mi){
		return iValue == mi.getiValue();
	}
}
