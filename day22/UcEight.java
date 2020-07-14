public class UcEight {

	/**
	 * @param args
	 */
	double IS_PRESENT = Math.floor(Math.random() * 10) % 2; //class variables
	private static void UcEight(double iS_PRESENT2) {
		// TODO Auto-generated method stub
		double PRESENT =iS_PRESENT2 ;
		if(PRESENT == 1) {
			System.out.println("employee is present");
			full_part(); //funtion calling
		}
		else {
			System.out.println("employee is absent");
			wageDaily(0,0);
		}
	}

		public static void full_part() {
			double IS_FULL_TIME = Math.floor(Math.random() * 10) % 2;
			if(IS_FULL_TIME == 1) {
				Scanner sc = new Scanner(System.in);
				System.out.println("employee is fulltime");
				System.out.println("employee working hours");
				int hrs=sc.nextInt();
				System.out.println("employee per hour rate");
				int rate=sc.nextInt();
				System.out.println("employee present day in month");
				int days=sc.nextInt();
				wageDaily(hrs,rate);
				wageMonthly(hrs,rate,days);
				sc.close();
			}
			else {
				System.out.println("employee is parttime");
				Scanner sc = new Scanner(System.in);
				System.out.println("employee working hours");
				int hrs=sc.nextInt();
				System.out.println("employee per hour rate");
				int rate=sc.nextInt();
				System.out.println("employee present day in month");
				int days=sc.nextInt();
				wageDaily(hrs,rate);
				wageMonthly(hrs,rate,days);
				sc.close();
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UcEight obj = new UcEight();
		UcEight(obj.IS_PRESENT);
	}

}
