docker build -t web:latest .Project Overview: This project creates a docker image using docker hub as a base that generates a container for a website.

Run Project:
	How docker is installed: As I use windows I accessed https://hub.docker.com/, created a profile,	   and clicked download for windows. 

	Build the container: Inside the folder with the Dockerfile use the command 
	"docker build -t web:latest .".

	Run the container: Run the command  "docker run -dit -p 8080:80 web".

	View the project: Access your browser and go to you public ip port 8080. For example 			   "http://192.168.0.193:8080"

DockerHub repo: Once logged onto hub.docker.com click "Create Repository" on the top right. The account    name should already be provided but place a name for the repository in the field next to it. Ensure public is selected and click create.

DockerHub Authentication: While logged into hub.docker.com click the profile name on the top right. Select account settings and then security. Then click "New Access Token". Please note that the free service 
provides only a single access token.

GitHub Secrets: In the github repository select "Settings". Scroll down the menu to the left and click on  the option "Secrets". Use "New repository secret" on the top right to create secrets for both the docker   docker token and docker username. 

GitHub Workflow: Change the env variable to identify the correct repository. In this case                  80810007/exaltedsite.

Pulling the image: The image can be pulled from the repository using the command                           "sudo docker pull 80810007/exaltedsite" I chose to test this via the aws ubuntu account that was created at the start of this semester.

Running the container: The container can be run with the command                                           "sudo docker run -dit -p 8080:80  80810007/exaltedsite" The site can then be checked as before to ensure   that it is working but ensure to change the ip the public ip of the current system running the container.

