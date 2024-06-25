package rh.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import rh.entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/yyyy");

	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract hourContract) {
		contracts.add(hourContract);
	}

	public void removeContract(HourContract hourContract) {
		contracts.remove(hourContract);
	}

	/**
	 * @param year  o ano para o qual calcular a renda.
	 * @param month o mês para o qual calcular a renda (1-12).
	 * @return a renda total do funcionário no ano e mês especificados.
	 */
	public Double income(int year, int month) {
        double sum = getBaseSalary();

        for (HourContract c : contracts) {
            LocalDate contractDate = c.getData();
            if (year == contractDate.getYear() && month == contractDate.getMonthValue()) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
