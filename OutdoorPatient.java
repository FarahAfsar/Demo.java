package hospital;
import javax.swing.JOptionPane;
import general_classes.Date;
import general_classes.Time;
public class OutdoorPatient extends Patient {
	double fee;
	Date da=new Date();
	Time t=new Time();
	OutdoorPatient()
	{
		super();
		fee=0.0;
	}
	OutdoorPatient(double f,String n,String ty,String ad,int a,int p,int c,char g)
	{
		super(n,ty,ad,a,p,c,g);
		fee=f;
	}
	void setFee(double f)
	{
		fee=f;
	}
	double getFee()
	{
		return fee;
	}
	void addOPatient()
	{
		addPatient();
		t.addTime();
		da.addDate();
		JOptionPane.showInputDialog("Enter fee: ", getFee());
	}
	void showOPatient()
	{
		showPatient();
		t.showTime();
		da.showDate();
		JOptionPane.showInputDialog("Fee: ", fee);
	}
}
