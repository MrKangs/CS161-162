public class StudentExam{
	private String name;
	private int testNo;
	String subject;

	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	public static void main(String [] args){
		StudentExam s = new StudentExam();
		s.setName("Ken");
		System.out.println(s.getName());
		s.testNo = 12;
		System.out.println(s.testNo = 20);
	}
}