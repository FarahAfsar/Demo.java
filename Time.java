package general_classes;
import javax.swing.JOptionPane; 
public class Time {
	private int hours,mins;
	private String midday;
	public Time()
	 {
		 hours=0;
		 mins=0;
		 midday="";
	 }
	 Time(int h,int m,String mi)
	 {
		 hours=h;
		 mins=m;
		 midday=mi;
	 }
	 void setHours(int h)
	 {
		 hours=h;
	 }
	 void setMins(int m)
	 {
		 mins=m;
	 }
	 void setMidday(String mi)
	 {
		 midday=mi;
	 }
	 int getHours()
	 {
		 return hours;
	 }
	 int getMins()
	 {
		 return mins;
	 }
	 String getMidday()
	 {
		 return midday;
	 }
	 public void addTime()
	 {
		 String h=JOptionPane.showInputDialog("enter hour");
		 hours=Integer.parseInt(h);
		 String m=JOptionPane.showInputDialog("enter min");
		 mins=Integer.parseInt(m);
		 midday=JOptionPane.showInputDialog("enter am or pm");
		 
	 }
	public void showTime()
	 {
		 JOptionPane.showInputDialog(hours+ " : " +mins+ " " +midday);
	 }
}
