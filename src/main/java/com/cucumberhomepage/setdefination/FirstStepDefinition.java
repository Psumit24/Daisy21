package com.cucumberhomepage.setdefination;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {
	int result,x,y=0;
	@Given("Take two numbers as input from user")
	public void take_two_numbers_as_input_from_user() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two Numbers:>");
		 x =sc.nextInt();
		 y =sc.nextInt();
		
	  sc.close(); 
	}

	@When("I add Them")
	public void i_add_them() {
		 result = x+y;
	}

	@Then("Verify if the addition is prime or not prime")
	public void verify_if_the_addition_is_prime_or_not_prime() {
		int count =0;
		for (int i = 1; i < result; i++) {
			if (result%i==0) {
				count++;
			}
		}
			if (count>=2) {
				System.out.println("Result is Not Prime:"+result);
				}
			else {
				System.out.println("Result is Prime:>"+result);
			}
		}
	}

