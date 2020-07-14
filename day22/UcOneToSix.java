public class UcOneToSix {
	/**
	 * @check for checking employee is present or not
	 */
	public static void check(){
		double IS_PRESENT = Math.floor(Math.random() * 10) % 2;
		if(IS_PRESENT == 1) {
			System.out.println("employee is present");
			full_part(); //funtion calling
		}
		else {
			System.out.println("employee is absent");
			wageDaily(0,0);
		}	
		
	}
	/**
	 * @full_part for checking employee is fulltime or parttime
	 */
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
	/**
	 * @wageDaily for checking employee daily wage
	 */
	public static void wageDaily(int hrs,int rate) {
		double empwage=rate*hrs;
		System.out.println("employee daily wage= "+ empwage);
	}
	/**
	 * @wageMonthly for checking employee monthly wage
	 */
	public static void wageMonthly(int hrs,int rate,int days) {
		double empwage=rate*(hrs*days);
		System.out.println("employee monthly wage= "+ empwage);
	}
	/**
	 * @conditionCheck for checking employee wage till condition
	 */
	public static void conditionCheck() {
		int hrs=8;
		int rate=20;
		int days=1;
		while( days <= 20 && hrs <= 100) {
			double empwage=rate*(hrs*days);
			System.out.println("employee monthly wage= "+ empwage);
			days+=1;
			hrs+=8;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to employee wage computation");
		check(); //function calling
		sc.close();
	}

}
