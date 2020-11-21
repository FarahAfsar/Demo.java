package general_classes;
import javax.swing.JOptionPane;
public class Date {
	private int day,month,year;
	public Date()
	 {
		 day=0;
		 month=0;
		 year=0;
	 }
	 Date(int d,int m,int y)
	 {
		 day=d;
		 month=m;
		 year=y;
	 }
	 int getDay()
	 {
		 return day;
	 }
	 int getMonth()
	 {
		 return month;
	 }
	 int getYear()
	 {
		 return year;
	 }
	 void setDay(int d)
	 {
		 day=d;
	 }
	 void setMonth(int m)
	 {
		 month=m;
	 }
	 void setYear(int y)
	 {
		 year=y;
	 }
	 public void addDate()
	 {
		 String d=JOptionPane.showInputDialog("enter day ");
		 day=Integer.parseInt(d);
		 String m=JOptionPane.showInputDialog("enter month ");
		 month=Integer.parseInt(m);
		 String y=JOptionPane.showInputDialog("enter year ");
		 year=Integer.parseInt(y);
		 
	 }
	public void showDate()
	 {
		 JOptionPane.showInputDialog( day+ " / " +month+ " / " +year);
	 }
	void searchDate()
	{
		 String d=JOptionPane.showInputDialog("enter day ");
		 int da=Integer.parseInt(d);
		 String m=JOptionPane.showInputDialog("enter month ");
		 int mo=Integer.parseInt(m);
		 String y=JOptionPane.showInputDialog("enter year ");
		 int ye=Integer.parseInt(y);
		 if(year==ye)
		 {
			 if(month==mo)
			 {
				 if(day==da)
				 {
					 
				 }
			 }
		 }
	}
}
