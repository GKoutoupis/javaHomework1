public class Holiday{
	
	//Attributes
	private String name;
	private int day;
	private String month;
	
	//Constractor
	public  Holiday(String name, int day, String month){
		this.name = name;
		this.day = day;
		this.month = month;
	}
	//Instance
	Holiday revolution = new Holiday("25h Martiou", 25, "Martios");
	Holiday oxi = new Holiday("28h Octombriou", 28, "Octombriou");
	//Method
	public String inSameMonth(String month){
		String  b = "false";
		if(revolution.month == oxi.month){
			b = "true";
		}
			return b;
		
		
	}
	
}