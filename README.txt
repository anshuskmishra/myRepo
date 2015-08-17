Welcome to SFTP Project 
=======================================================================
A mule application to read files from a read only SFTP folder. The application should poll every 5 minutes and write back to another folder.

Getting Started
===============
The inbound sftp is readonly for the user used in mulesoft. The files are written externally by different user every 5 - 10 minutes. The mulesoft ftp user cannot archive or delete the files in the inbound folders, which means the files will be available in the same folder even after mule reads the file. The application shouldn't read the files again. Polling of the files from mulesoft should happen every 5 minutes.

Pre-requisites:
===============
JDK 1.7
MuleServer 3.7
Anypoint Studio 5.2
Maven 4(either stand alone or mule plugin: Needs to be configured)

SFTP Server must be up and listening on:
localhost:995

Home-Dir: 	sftp\src\main (Provide All rights for this dir)
Input-Dir: 	sftp\src\main\resources (Dir should be made r/o)
Output-Dir: sftp\src\main\java
user:admin
password:admin

Note: I have used CoreFTP server and client to create the SFTP Environment.


Sample Data:
===============

Sample files to be read are available under below directory:
sftp\src\main\resources

Maven:
===============
I have used Maven 4 to mavenize this project.


Author:
Anshu Mishra
