package com.cucumberhomepage.setdefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameterations {
	int x, y, result = 0;
	String first, second;
	double d1, d2, dresult = 0;
	List<Integer> number;
	Map<String, List<Integer>> m;

	@Given("I have no {int} and {int}")
	public void i_have_no_and(Integer int1, Integer int2) {
		x = int1;
		y = int2;
	}

	@When("I add them")
	public void i_add_them() {
		result = x + y;
	}

	@Then("print result")
	public void print_result() {
		System.out.println("Result:" + result);
	}

	@Given("I have {string} and {string}")
	public void i_have_and(String first, String second) {
		this.first = first;
		this.second = second;
	}

	@Then("Print them alphabetical order")
	public void print_them_alphabetical_order() {
		if (first.compareTo(second) == 0) {
			System.out.println("Strings are Identical");
		} else if (first.compareTo(second) > 0) {
			System.out.println(second + " " + first);
		} else {
			System.out.println(first + " " + second);
		}
	}

	@Given("i have to add two float no {double} and {double}")
	public void i_have_to_add_two_float_no(Double double1, Double double2) {
		d1 = double1;
		d2 = double2;
	}

	@When("I add two float no")
	public void i_add_two_float_no() {
		dresult = d1 + d2;
	}

	@Then("Print addition of Float number")
	public void print_addition_of_float_number() {
		System.out.println("Float Addition Result:" + dresult);
	}

	@Given("I have following Numbers:")
	public void i_have_following_numbers(io.cucumber.datatable.DataTable dataTable) {
		number = dataTable.asList(Integer.class);
	}

	@Then("print all number from list")
	public void print_all_number_from_list() {
		System.out.println("List of Number:" + number);
	}

	@Given("I have following table:")
	public void i_have_following_table(io.cucumber.datatable.DataTable dataTable) {
		Map<String, List<Integer>> m = dataTable.asMap(String.class, List.class);
		System.out.println("Map::" + m);
		System.out.println(dataTable.row(1));
	}

	@Then("print them is row column formate")
	public void print_them_is_row_column_formate() {
		System.out.println("Map::" + m);
	}

	@Given("WE have no {int} and {int}")
	public void we_have_no_and(Integer int1, Integer int2) {
		x = int1;
		y = int2;
	}

	@When("WE add them")
	public void we_add_them() {
		result = x + y;
	}

	@Then("WE Verify if result is prime")
	public void we_verify_if_result_is_prime() {
		int count = 0;
		for (int i = 1; i < result; i++) {
			if (result % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Result is NOT Prime: " + result);
		} else {
			System.err.println("The Result is Prime: " + result);
		}
	}

	@Given("WE have two from {int}")
	public void we_have_two_from(Integer rowNum) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Jsumit\\Daisy21AA\\src\\test\\resources\\Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheetAt(0);
		x = (int) sheet.getRow(rowNum).getCell(1).getNumericCellValue();
		y = (int) sheet.getRow(rowNum).getCell(2).getNumericCellValue();
	}

}
