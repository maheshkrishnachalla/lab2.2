package in.main;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class InterestAmount {
	static double totalInterest = 0;
	static double totalPrinciple = 0;
	static double totalAmount = 0;
	public static final String filePath = System.getProperty("user.dir");

	/**
	 * 
	 * @param principle
	 * @param rate_of_interest
	 * @param time_in_years
	 * @return
	 */
	public static double interest_in_years(double principle, double rate_of_interest) {
		return principle*rate_of_interest*12/100;
	}

	public static double interest_in_months(double principle, double rate_of_interest, double time_in_months) {
		return (principle*rate_of_interest*time_in_months)/100;
	}

	public static double interest_in_days(double principle, double rate_of_interest, double time_in_days) {
		return (principle*rate_of_interest*time_in_days)/(30*100);
	}

	public static double compound_interest_in_years(double principle, double rate_of_interest, String startDate, String endDate) throws FileNotFoundException {
		double compountInterest= 0;
		double cInt= 0;
		int count =1;
		double prncp =principle;
		
		LocalDate sdate = LocalDate.parse(startDate);
		LocalDate pdate = LocalDate.parse(endDate);

		LocalDate ssdate = LocalDate.of(sdate.getYear(), sdate.getMonth(), sdate.getDayOfMonth());
		LocalDate ppdate = LocalDate.of(pdate.getYear(), pdate.getMonth(), pdate.getDayOfMonth());

		Period period = Period.between(ssdate, ppdate);
		System.out.println("start date = "+ startDate);
		System.out.println("end date = "+ endDate);
		System.out.println("Number of days: " + period.getYears() + " years " 
				+ period.getMonths() + " months "
				+ (period.getDays()+1) + " days ");

		int time_in_years=  period.getYears();
		int time_in_months= period.getMonths();
		int time_in_days= period.getDays()+1;


		System.out.println("Rate of Interest = "+rate_of_interest);
		totalPrinciple = totalPrinciple+principle;
		while(time_in_years>0) {

			principle = principle+compountInterest;
			System.out.println("principle of year_"+count+" = "+principle);
			compountInterest=  interest_in_years(principle, rate_of_interest); //(principle*rate_of_interest*12)/1000;
			System.out.println("Interest of year_"+count+" = "+compountInterest);
			cInt = cInt+compountInterest;
			time_in_years--;
			count++;
			totalInterest = totalInterest+compountInterest;
		}
		System.out.println("Interest of "+(count-1)+" years = "+cInt);
		double yearPrinciple = compountInterest + principle;
		System.out.println("principle of "+count+" years= "+yearPrinciple);
		double monthInterest = interest_in_months(yearPrinciple, rate_of_interest, time_in_months);
		System.out.println("Interest of "+time_in_months+" months = "+monthInterest);
		double monthPrinciple = yearPrinciple + monthInterest;
		System.out.println("principle of "+time_in_months+" months = "+monthPrinciple);
		double dayInterest = interest_in_days(monthPrinciple, rate_of_interest, time_in_months);
		System.out.println("Interest of "+time_in_days+" days = "+dayInterest);
		double dayPrinciple = monthPrinciple + dayInterest;
		System.out.println("principle of "+time_in_days+" days = "+dayPrinciple);
		totalInterest=totalInterest+monthInterest+dayInterest; 
		totalAmount = totalAmount+dayPrinciple;
		cInt = (cInt+monthInterest+dayInterest);
		System.out.println("Principle = "+prncp);
		System.out.println("Interest = "+cInt);
		System.out.println("Amount (P+I) = "+dayPrinciple);
		return dayPrinciple;

	}


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("$/$/$/$/$ Compound Interest $/$/$/$/$"+ new Date());
		double amount=0;
		
		//PrintStream fileOut = new PrintStream(new FileOutputStream(filePath+"/output/file.txt", true));
				
		try {
			int i =1;
			while(i==1) {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter principle = ");
				double principle = scanner.nextDouble();
				System.out.print("Enter rate of interest = ");
				double rate_of_interest = scanner.nextDouble();
				System.out.print("Enter Start Date in 'yyyy-mm-dd'= ");
				String startDate = scanner.next();
				System.out.print("Enter End Date in 'yyyy-mm-dd'= ");
				String endDate =  scanner.next();

				//System.setOut(fileOut);
				amount =compound_interest_in_years(principle, rate_of_interest, startDate,endDate);
				/*System.out.println("Amount = "+amount+" principle "+principle+" for "+time_in_years+" years "
		+time_in_months+" months "+time_in_days+" days of interest "+rate_of_interest);*/
				System.out.println("@@@@@@@@@@#################@@@@@@@@@@@@@");
				System.out.println("Enter 1 to continue :");
				i=scanner.nextInt();
			}

		}catch (Exception e) {
			System.out.println("******* exit *******");
			//System.err.println ("Error writing to file");
		}
		finally {
			System.out.println("Final Total Principle : "+totalPrinciple );
			System.out.println("Final Total Interest : "+totalInterest );
			System.out.println("Final Total Amount : "+totalAmount);

		}


	}

}
