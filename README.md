Ασκηση 4
θα εμφανίσει -4-6-h

ΆΣΚΗΣΗ 6 a)
public class Employee{
	public String employeeName;
	public int salary;
	public String address;

	public Employee(){
		this("Bob Day");
	}

	public Employee(String name){
		this(name,1200);
	}
	public Employee(String name, int salary) {
 	this(name, salary, "Patission 76");
 }
 	public Employee(String name, int salary, String address) {
 	this.employeeName=name;
 	this.salary=salary;
 	this.address=address;
 }

 	void disp() {
 	System.out.println("Employee Name: "+ employeeName);
 	System.out.println("Employee Salary: "+salary);
 	System.out.println("Employee Address: "+address);
 }
 public static void main(String[] args) {
 Employee obj = new Employee();
 obj.disp();
 } 

}

b)Καλούνται κατά αύξουσα σειρά των παραμέτρων που παίρνουν ως ορίσματα στις μεθόδους που υλοποιούν το αντικείκενο obj
Δηλαδή πρώτα καλείται η
public Employee(){
		this("Bob Day");
	}
Μετά η 
public Employee(String name){
		this(name,1200);
	}

Μετά
 public Employee(String name, int salary) {
 	this(name, salary, "Patission 76");
 }


Και τέλος

public Employee(String name, int salary, String address) {
 	this.employeeName=name;
 	this.salary=salary;
 	this.address=address;
 }

 γ )Το τελευταίο this δεν είναι απαραίτητο καθώς έχουν ήδη δημιουργηθέι τρία instances από τον constructor 

 public Employee(String name, int salary) {
 	this(name, salary, "Patission 76");
 }


Άσκηση 7
α) 
100
100
101
101
102
102
103
103
104
104
105
105
106
106
107
107
108
108
109
109


β)Κάθε φορά που εκτελείται η επανάληψη θα δημιουργείται ένα αντικείμενο της κλάσσης Demo.Επομένως θα δημιουργηθούν 9 αντικείμενα.
c)Θα δημιουργηθούν 9 μεταβλητές max_value επειδή ως final μπορεί να αρχικοποιηθεί μόνο μία φορά.Επομένως κάθε νέο αντικείμενο που δημιουργείται δημιουργεί και μια μεταβλητή max value .Δεν μπορούμε να ξαναδώσουμε τιμή σε μια final μεταβήτή για αυτό δημιουργείται νέα σε κάθε δημιουργία αντικειμένου obj της κλάσης Demo
d) Θα δημιουργηθεί 1 μεταβλητή max_all.Ως static θα αλλάζει τιμή κάθε φορά που δημιουργούμε ενα νέο αντικείμενο obj της κλάσης demo .Η μεταβλητή max all κάνει ovrwrite την προηγουμενη τιμή και η νέα τιμή είναι διθέσιμη σε όλα τα instances του αντικειμένου.     