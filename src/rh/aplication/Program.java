package rh.aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import rh.entities.Department;
import rh.entities.HourContract;
import rh.entities.Worker;
import rh.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String dept = sc.nextLine();

		System.out.println("Enter worker data:");
		System.out.print("name: ");
		String name = sc.nextLine();

		System.out.print("Level: ");
		String level = sc.next();

		System.out.print("Base Salary: ");
		double salary = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(dept));

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + ": ");
			System.out.print("Date: DD/MM/YYYY ");
			LocalDate data = LocalDate.parse(sc.next(), dtf);

			System.out.print("Value per hours: ");
			double valor = sc.nextDouble();

			System.out.print("Duration Contract: ");
			int duration = sc.nextInt();
			sc.nextLine();

			HourContract hourContract = new HourContract(data, valor, duration);
			worker.addContract(hourContract);
		}

		System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
	}

}
