import java.util.*;

public class EmployeeWage {
	public static void check(){
		double IS_PRESENT = Math.floor(Math.random() * 10) % 2;
		if(IS_PRESENT == 1) {
			System.out.println("employee is present");
			full_part();
		}
		else {
			System.out.println("employee is absent");
			wageDaily(0,0);
		}	
		
	}
	public static void full_part() {
		double IS_FULL_TIME = Math.floor(Math.random() * 10) % 2;
		if(IS_FULL_TIME == 1) {
			System.out.println("employee is fulltime");
			wageDaily(8,20);
			wageMonthly(8,20,20);
		}
		else {
			System.out.println("employee is parttime");
			wageDaily(4,20);
			wageMonthly(4,20,20);
			
		}
	}
	public static void wageDaily(int hrs,int rate) {
		double empwage=rate*hrs;
		System.out.println("employee daily wage= "+ empwage);
	}
	public static void wageMonthly(int hrs,int rate,int days) {
		while( days <= 20 || hrs <= 100) {
		double empwage=rate*(hrs*days);
		System.out.println("employee monthly wage= "+ empwage);
		days+=1;
		hrs+=8;
		}
	}
	public static void conditionCheck() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to employee wage computation");
		check();
		Scanner sc = new Scanner(System.in);
		int value=1;
		System.out.println("enter the choice:-");
		System.out.println("1. for to check employee present or not \n"
				+ "2.for to check employee fulltime or parttime \n"
				+ "3. for check employee wage");
		value=sc.nextInt();
		switch(value) {
		  case 1:
		    check();
		    break;
		  case 2:
		    full_part();
		    break;
		  case 3:
			  System.out.println("employee working hours");
			  int hrs=sc.nextInt();
			  System.out.println("employee is rate per hour");
			  int rate=sc.nextInt();
			  wageDaily(hrs, rate);
			  break;
		  default:
			  System.out.println("invalid choice");
		}
		
sc.close();
	}

}
