package hospital;
import general_classes.Date;
import javax.swing.JOptionPane;
import general_classes.Date;
public class IndoorPatient extends Patient {
	Doctor d=new Doctor();
	Date da=new Date();
	int ward_no,room_no,bed_no;
	double fee;
	IndoorPatient()
	{
		super();
		ward_no=0;
		room_no=0;
		bed_no=0;
		fee=0.0;
	}
	IndoorPatient(String n,String ad,String t,int a,int p,int c,char g,int w,int r,int b,double f)
	{
		super(n,ad,t,a,p,c,g);
		ward_no=w;
		room_no=r;
		bed_no=b;
		fee=f;
	}
	void setWard(int w)
	{
		ward_no=w;
	}
	void setRoom(int r)
	{
		room_no=r;
	}
	void setBed(int b)
	{
		bed_no=b;
	}
	void setFee(int f)
	{
		fee=f;
	}
	int getWard()
	{
		return ward_no;
	}
	int getRoom()
	{
		return room_no;
	}
	int getBed()
	{
		return bed_no;
	}
	double getFee()
	{
		return fee;
	}
	public void addIPatient()
	{
		addPatient();
		da.addDate();
		JOptionPane.showInputDialog("Enter Ward_no: ", getWard());
		JOptionPane.showInputDialog("Enter Room_no: ", getRoom());
		JOptionPane.showInputDialog("Enter Bed_no: ", getBed());
		JOptionPane.showInputDialog("Enter fee: ", getFee());
		String dctr=JOptionPane.showInputDialog("Enter Doctor: ");
		if(dctr!=d.name)
		{
			JOptionPane.showInputDialog("enter valid doctor name");
		}
		else
		{
			JOptionPane.showInputDialog("patient added");
		}
	}
	void showIPatient()
	{
		showPatient();
		da.showDate();
		JOptionPane.showInputDialog("Ward_no: ", ward_no);
		JOptionPane.showInputDialog("Room_no: ", room_no);
		JOptionPane.showInputDialog("Enter Bed_no: ", bed_no);
		JOptionPane.showInputDialog("Enter fee: ", fee);
	}
}
