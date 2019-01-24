# GoogleSearch
1.	Open IntelliJ IDEA 
2.	Create new Maven project, specify group id, artifact id
3.	Navigate to project root folder and Open Git Bash there 
4.	Create .gitignore file (touch .gitignore) add necessary files extensions 
5.	Create pom.xml file (touch pom.xml).
6.	Download last version of chromedriver.exe and extract it to project root folder
7.	Open IDEA, open pom.xml file. Click on it and select “Run As” – “Maven Build”.  Add dependences for Selenium and Testng (I have used this library instead of JUnit,  because I studied that for automated tests I should use Testng)
8.	Add next directories: 
8.1	IdeaProjects\kaa2\src\main\java\com\kaa. Click on Java and Mark directory as Sources root. In this directories we can add in future some resources, and describe elements locators, methods of elements on page. And in test directory just call necessary methods from specific class. 
8.2	\IdeaProjects\kaa2\src\test\java\com\kaa\google. Click on Test and Mark directory as Test Sources root.
9.	Create new Java Class “Google Test” in test\java\com\kaa\google
10.	Add three annotations:  @BeforeClass  @Test @AfterClass
11.	@BeforeClass 
    11.1	driver initialization – we specify what browser will be used for test 
11.2	specify the value of the variable “googleSearch”
11.3	pass the variable to method “get” – this will allow to navigate to “googleSearch”
11.4	specify the value of the variable “searchText”
11.5	variable “searchLocator” initialization  and specify location using its XPath (Open Chrome – F12 DevTools, Select arrow to inspect input – Click on input – press the RMB  is selected code in “Elements” tab – From menu Select “Copy” – Copy XPath
11.6	search for google input “searchLocator” 
11.7	Use method “sendKeys” to input “searchText” into searchField
11.8	Use method “submit” to imitate click on submit button
11.9	Open Google – search for test – open DevTools – and copy XPath for text that contain “test” word 
11.10	variable “linkLocator” initialization  and specify location using its XPath
11.11	search for text description under link in search result that we found in 11.9 
11.12	using assertTrue method we check that text from 11.11 contain “text” word 
12.	 @Test Mark the method as the test method 
13.	@AfterClass we use method tearDown to close a browser after test running completed and method “close” to quit  from webDriver.
14.	 Select in menu tab “Run” – “Run ‘Google Test’” and wait for result of test running. 
https://www.screencast.com/t/B0kcVAtwkj
