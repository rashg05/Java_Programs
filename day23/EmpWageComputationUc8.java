public class EmpWageComputationUc8{
		public static final int isFullTime = 1;
		public static final int isPartTime = 2;

		public void computeWage(String cmpName, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth){
			int empHrs = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;

			while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays){

				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random()*10%3);
				switch (empCheck){
					case isFullTime :
						empHrs = 8;
						break;

					case isPartTime :
						empHrs = 4;
						break;

					default:
						empHrs = 0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Day : "+totalWorkingDays + " Emp Hr : "+empHrs);

			}
			int totalEmpWage = totalEmpHrs * empRatePerHr;
			System.out.println("Toatal Emp Wage for company : "+cmpName + " is : "+totalEmpWage);
		}
		public static void main(String [] args){

			EmpWageCompanyUc8 emp = new EmpWageCompanyUc8();
			emp.computeWage("Apple",20,2,10);
			emp.computeWage("Microsoft",10,4,20);

		}
	}
