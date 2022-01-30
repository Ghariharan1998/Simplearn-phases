/*	Creating a dynamic web project
 
   Step1  :Creating a dynamic web project
	Open Eclipse
	Go to the File menu. Choose New->Dynamic Web Project
	Enter the project name as FirstServlet. Click on Next
	Enter nothing in the next screen and click on Next
	Check the checkbox Generate web.xml deployment descriptor and click on Finish
	This will create the project files in the Project Explorer

	Creating a servlet
	Step2:
	    Creating a servlet
	In the Project Explorer, expand ServletConcept->Java Resources
	Right click on src and choose New->Servlet
	In Class Name, enter FirstServlet and click on Finish
	
	Checking for servlet-api.jar
	Step3:
	     	Before building the project, we need to add servlet-api.jar to the project
          Servlet-api.jar file is already present in your practice lab. (Refer FSD: Lab Guide - Phase 2)
	To add it to the project, follow the below mentioned steps:
	In the Project Explorer, right click on FirstServlet and choose Properties
	Select Java Build Path from the options on the left
	Click on Libraries tab on the right
	Under ClassPath, expand the node that says Apache Tomcat
	If there is an existing entry for servlet-api.jar, then click on Cancel and exit the window
	If it is not there, then click on Classpath entry and click on Add External JARs button on the right
	From the file list, select servlet-api.jar file and click Ok
	Click on Apply and Close

	   Building the project
	Step4:
	    	From the Project menu at the top, click on Build
	If any compile errors are shown, fix them as required

	
	
	Publishing and starting the project
	
	Step5:
	If you do not see the Servers tab near the bottom of the IDE, go to Window menu and click on Show View->Servers
	Right click on the Server entry and choose Add and Remove
	Click the Add button to move FirstServlet from the Available list to the Configured list
	Click on Finish
	Right click on the Server entry and click on Publish
	Right click on the Server entry and click on Start
	This will start the server
	 
	Running the project
	Step6:
		To run the project, open a web browser and type: http://localhost:8080/Assisted2Program
	
	
	
	*/
