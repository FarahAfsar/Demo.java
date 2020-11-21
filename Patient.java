package hospital;
import javax.swing.JOptionPane; 
public class Patient {
	private String name,address,type;
	private int age,phone_no,cnic,ni,no;
	private char gender;
	Doctor d=new Doctor();
	Patient()
	{
		type="";
		ni=0;
		no=0;
		name="";
		address="";
		age=0;
		cnic=0;
		phone_no=0;
		gender=' ';
	}
	Patient(String n,String t,String ad,int a,int p,int c,char g)
	{
		type=t;
		cnic=c;
		phone_no=p;
		gender=g;
		name=n;
		age=a;
		address=ad;
	}
	String getName()
	{
		return name;
	}
	String getType()
	{
		return type;
	}
	int getCnic()
	{
		return cnic;
	}
	int getPhone_no()
	{
		return phone_no;
	}
	char getGender()
	{
		return gender; 
	}
	int getAge()
	{
		return age;
	}
	String getAddress()
	{
		return address;
	}
	void setName(String n)
	{
		name=n;
	}
	void setType(String t)
	{
		type=t;
	}
	void setAddress(String ad)
	{
		address=ad;
	}
	void setAge(int a)
	{
		age=a;
	}
	void setCnic(int c)
	{
		cnic=c;
	}
	void setPhone_no(int p)
	{
		phone_no=p;
	}
	void setGender(char g)
	{
		gender=g;
	}
	public void addPatient()
	{
		name=JOptionPane.showInputDialog("Enter name: ");
		address=JOptionPane.showInputDialog("Enter address: ");
		type=JOptionPane.showInputDialog("Enter type of patient whether indoor or outdoor");
		String ag= JOptionPane.showInputDialog("Enter age: ");
		age=Integer.parseInt(ag);
		String cn=JOptionPane.showInputDialog("Enter CNIC: ");
		cnic=Integer.parseInt(cn);
		JOptionPane.showInputDialog("Enter Phone Number: ", getPhone_no());
		JOptionPane.showInputDialog("Enter Gender: ", getGender());
	}
	void showPatient()
	{
		JOptionPane.showInputDialog("name: ",name);
		JOptionPane.showInputDialog("address: ",address);
		JOptionPane.showInputDialog("age: ",age);
		JOptionPane.showInputDialog("CNIC: ",cnic);
		JOptionPane.showInputDialog("Phone Number: ", phone_no);
		JOptionPane.showInputDialog("Gender: ", gender);
		JOptionPane.showInputDialog("Type of patient: ",type);
		JOptionPane.showInputDialog("Doctor: ",d.name);
		JOptionPane.showInputDialog("num of indoor patient: ",ni);
		JOptionPane.showInputDialog("num of outdoor patient: ",no);
	}
}
