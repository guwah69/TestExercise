#Setting Up Framework
- Clone project to your local 
- cd in the project
- run mvn clean, mvn compile and mvn test.to run the test. 


#Solution Explained
I have setup the solution following a Page Object Model Pattern and BDD approach

The main reason I has setup this solution to follow this approach is because POM will help with the following:
1.Reduce the number of duplicated codes. 
2.Maintain objects in separate class file
3. Improve readability
4.it helps to handle each page using its instance
The Framework structure has the following:
Src package which serves as the container for the projects. There are two main package inside the src package which
		there are: main and test
The main package is where the testBase and Config properties of the framework 
The test package has the following package:
Pages: this is where all the different pageObject for each page which has the web elements stored differently
Steps: Package is simple where all the steps definitions for each page are stored 
Resources package: is where all the feature files are stored