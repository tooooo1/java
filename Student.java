package sec06;

public class Student {
	private int math;
	private int eng;
	private int kor;
	
	public void Student() {
		
	}
	public Student(int math, int eng, int kor) {
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	
}
