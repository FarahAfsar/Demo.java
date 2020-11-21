package hospital;
import javax.swing.JOptionPane; 
public class Doctor {
	String name,department,specialization;
	int cnic,phone_no;
	char gender;
	Doctor()
	{
		name="ali";
		department="general";
		specialization="mbbs";
		cnic=123434554;
		phone_no=055312;
		gender='M';
	}
	Doctor(String n,String d,String s,int c,int p,char g)
	{
		name=n;
		department=d;
		specialization=s;
		cnic=c;
		phone_no=p;
		gender=g;
	}
	String getName()
	{
		return name;
	}
	String getDepartment()
	{
		return department;
	}
	String getSpecialization()
	{
		return specialization;
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
	void setName(String n)
	{
		name=n;
	}
	void setDepartment(String d)
	{
		department=d;
	}
	void setSpecialization(String s)
	{
		specialization=s;
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
	public void addData()
	{
		name=JOptionPane.showInputDialog("Enter name: ");
		department=JOptionPane.showInputDialog("Enter Department: ");
		specialization=JOptionPane.showInputDialog("Enter Specialization: ");
		String c=JOptionPane.showInputDialog("Enter CNIC: ");
		cnic=Integer.parseInt(c);
		String p=JOptionPane.showInputDialog("Enter Phone Number: ");
		phone_no=Integer.parseInt(p);
		String g=JOptionPane.showInputDialog("Enter Gender: ");
		gender= g.charAt(0);
	}
	void showData()
	{
		JOptionPane.showInputDialog("name is: ", name);
		JOptionPane.showInputDialog("Department is: ", department);
		JOptionPane.showInputDialog("Specialization is: ", specialization);
		JOptionPane.showInputDialog("CNIC is: ", cnic);
		JOptionPane.showInputDialog("Phone Number is: ", phone_no);
		JOptionPane.showInputDialog("Gender is: ", gender);
	}
	void search()
	{
		String s;
		s=JOptionPane.showInputDialog("enter name or department");
		if(s==name)
		{
			JOptionPane.showInputDialog("found");
			showData();
		}
		else if(s==department)
		{
			JOptionPane.showInputDialog("found");
			showData();
		}
		else
			JOptionPane.showInputDialog("not found");
	}
}

