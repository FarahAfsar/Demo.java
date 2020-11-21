package hospital;

import javax.swing.JOptionPane;

public class Demo {

	public static void main(String[] args) {
		IndoorPatient ip=new IndoorPatient();
		OutdoorPatient op=new OutdoorPatient();
		String n;
		n=JOptionPane.showInputDialog("how many doctors you want to enter?");
		int numD=0;
		numD=Integer.parseInt(n);
		Doctor[] ad=new Doctor[numD];
		for(int i=1;i<=numD;i++)
		{
			ad[i].addData();
			String nu=JOptionPane.showInputDialog("how many patients of this doctor?");
			int numP=Integer.parseInt(nu);
			Patient[] apatient=new Patient[numP];
			for(int j=1;j<=numP;j++)
			{
				apatient[i].addPatient();
			}
		}
		int num=0;
		do
		{
			JOptionPane.showInputDialog("1- Add an indoor patient");
			JOptionPane.showInputDialog("2- Add an outdoor patient");
			JOptionPane.showInputDialog("3- See the list of all Doctors");
			JOptionPane.showInputDialog("4- Search a doctor by name or department");
			JOptionPane.showInputDialog("5- See the list of all indoor patients");
			JOptionPane.showInputDialog("6- See the list of all appointments on a certain day");
			JOptionPane.showInputDialog("7- See the list of appointments of a certain doctor");
			JOptionPane.showInputDialog("8- Change the date or time of appointment of a certain patient");
			JOptionPane.showInputDialog("9- Exit");
			String numb=JOptionPane.showInputDialog("				Enter your option");
			num=Integer.parseInt(numb);
			switch(num)
			{
			case 1: ip.addIPatient();
			break;
			case 2: op.addOPatient();
			break;
			case 3: 
				for(int i=0;i<=numD;i++)
				{
					ad[i].showData();	
				}
			break;
			case 4: 
				for(int i=0;i<=numD;i++)
				{
					ad[i].search();	
				}
			break;
			}
		}while(num>0 && num<9);
	}

}
