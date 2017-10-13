#Setting Up Framework
- Clone project to your local 
- cd in the project
- To run test: run mvn clean, mvn compile and mvn test.
- Generate Report: Go to Target folder=> Site=> and run report it shuld look like this:
![testreport](https://user-images.githubusercontent.com/14157404/31548241-1ebc7e68-b022-11e7-8ce3-10437c13de4f.PNG)



#Solution Explained
I have setup the solution following a Page Object Model Pattern and BDD approach

The main reason I have setup this solution is to follow the Page Object Model Pattern, because POM will help with the following:
1.Reduce the number of duplicated codes. 
2.Maintain objects in separate class file
3. Improve readability
4.it helps to handle each page using its instance
The Framework structure has the following:
Src package which serves as the container for the projects. There are two main package inside the src package which
		are: main and test package
The main package is where the testBase and Config properties of the framework lies
The test package has the following packages:
Pages: this is where all the different pageObject for each page which has the web elements are stored.
Steps: Package is where all the steps definitions for each pages are stored 
Resources package: is where all the feature files are stored. 
