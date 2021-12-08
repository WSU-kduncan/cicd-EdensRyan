Project Overview: This project creates a docker image using docker hub as a base that generates a container for a website.

Run Project:
	How docker is installed: As I use windows I accessed https://hub.docker.com/, created a profile,	   and clicked download for windows. 

	Build the container: Inside the folder with the Dockerfile use the command 
	"docker build -t web:latest .".

	Run the container: Run the command  "docker run -dit -p 8080:80 web".

	View the project: Access your browser and go to you public ip port 8080. For example 			   "http://192.168.0.193:8080"

