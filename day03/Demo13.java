package day03;
import java.util.Scanner;
/**
 * 
 * */
public class Demo13 {

	public static void main(String[] args) {
		double salary;	//薪水
		double tax;		//税
		double taxIncome;	//应税收入: salary-3500
		System.out.println("请输入工资：");
		Scanner console = new Scanner(System.in);
		salary = console.nextDouble();
		taxIncome = salary-3500;
		
		if(taxIncome<=1500){
			tax = taxIncome*0.03;
		}else if(taxIncome<=4500){
			tax = taxIncome*0.1-105;
		}else if(taxIncome<=9000){
			tax = taxIncome*0.2-555;
		}else if(taxIncome<=35000){
			tax = taxIncome*0.25-1005;
		}else if(taxIncome<=55000){
			tax = taxIncome*0.3-2755;
		}else if(taxIncome<=80000){
			tax = taxIncome*0.35-5505;
		}else{
			tax = taxIncome*0.45-13505;
		}
		System.out.println("应纳税额为："+tax);
		System.out.println("税后："+(salary-tax));
	}

}
