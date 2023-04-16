package Sprint5;

public enum Value {
	Twee(2), Drie(3), Vier(4), Vijf(5), Zes(6), Zeven(7), Acht(8), Negen(9), Tien(10), Boer(10),Ace(11),
	Koningin(12), Koning(13);
	
	public int numericalValue;
	
	private Value(int numericalValue) {
		this.numericalValue = numericalValue;
	}

}
