Feature: This features describes the parameterization in Cucumber
@Smoke
Scenario: Passing single numeric to the Gharkin step
Given I have no 5 and 6
When I add them
Then print result
@Regression @Smoke
Scenario: Passing single string to the Gharkin step
Given I have "India" and "China"
Then Print them alphabetical order
@Smoke
Scenario: Passing float n umber to Gharkin step
Given i have to add two float no 3.14 and 6.28
When I add two float no
Then Print addition of Float number
@Smoke
Scenario: Passing list of parameter to Gharkin step
Given I have following Numbers:
|10|
|20|
|30|
|40|
|50|
Then print all number from list
Scenario: Passing Table of parameters to Gharkin step
Given I have following table:
|firstList|11|10|22|20|33|30|44|40|55|50|66|60|
|secondList|100|11|200|22|10|33|20|44|30|55|20|66|
Then print them is row column formate
@Smoke
Scenario Outline:
Given WE have no <num1> and <num2>
When WE add them
Then WE Verify if result is prime
Examples:
|num1|num2|
|2   |3   |
|4   |30  |
|5   |32  |
|6   |34  |
|7   |13  |
|8   |20  |
@Smoke
Scenario Outline:
Given WE have two from <row-number>
When WE add them
Then WE Verify if result is prime
Examples:
|row-number|
|1   |
|2   |
|3   |
|4   |
|5   |
|6   |