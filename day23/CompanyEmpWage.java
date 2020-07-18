import java.util.*;

interface IComputeEmpWage{

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}

class CompanyEmpWage{

	public static int setTotalEmpWage;
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth, int totalEmpWage){

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.totalEmpWage = totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage){

		this.totalEmpWage = totalEmpWage;
	}

	public String toString(){

		return "Total Emp Wage For Company : "+company + " is : "+totalEmpWage;
	}
}

public class EmpWageBuilder implements IComputeEmpWage{
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;


	private int numOfCompany = 0;

	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;

	public EmpWageBuilder(HashMap companyEmpWageMap){

		companyEmpWageList = new LinkedList();
		companyEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPErMonth, Map<String, CompanyEmpWage> companyToEmpWage, CompanyEmpWage CompanyEmpWage){

		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPErMonth, maxHoursPErMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWage.put(company, CompanyEmpWage);
	}

	public void computeEmpWage(){

		for (int i= 0; i < companyEmpWageList.size(); i++){

			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			CompanyEmpWage.setTotalEmpWage=(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);

		}
	}

	public int getTotalWage(String company){

		return companyToEmpWageMap.get(company).totalEmpWage;

	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage){
		return numOfCompany;

	}

	public static void main(String [] args){

		IComputeEmpWage empWageBuilder = new EmpWageBuilder(null);
		empWageBuilder.addCompanyEmpWage("Dmart",20,2,10);

		empWageBuilder.computeEmpWage();

		System.out.println("Total wage for dmart Company : "+empWageBuilder.getTotalWage("Dmart"));
	}

	public int getNumOfCompany() {
		return numOfCompany;
	}

	public void setNumOfCompany(int numOfCompany) {
		this.numOfCompany = numOfCompany;
	}

	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		// TODO Auto-generated method stub
		
	}

}
