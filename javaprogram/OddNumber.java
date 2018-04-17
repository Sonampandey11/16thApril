package day2;

public class OddNumber {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public OddNumber(int number) {
		super();
		this.number = number;
	}
public OddNumber() {
		
	}

public boolean getdata(OddInterface odd)
{
	return odd.isOdd(this.number);
}
public int getprimedata(PrimeInterface prime)
{
	return prime.isPrime(this.number);
}
	
public int getpalindrome(PalindromeInterface palindrome)
{
	return palindrome.ispolindrome(this.number);
}
}
