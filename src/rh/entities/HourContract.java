package rh.entities;

import java.time.LocalDate;

public class HourContract {

	private LocalDate data;
	private Double valueHour;
	private Integer hour;

	public HourContract() {
	}

	public HourContract(LocalDate data2, Double valueHour, Integer hour) {
		super();
		this.data = data2;
		this.valueHour = valueHour;
		this.hour = hour;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValueHour() {
		return valueHour;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Double totalValue() {
		return valueHour * hour;
	}
}
