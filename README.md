# Postman Mechanism:

![Screenshot (34)](https://user-images.githubusercontent.com/42673172/136383735-283650ec-b4c3-49dc-9f5f-41ca0a966424.png)

![Screenshot (35)](https://user-images.githubusercontent.com/42673172/136384041-d0302841-a963-4bb0-be17-d6dc98e062c9.png)

![Screenshot (36)](https://user-images.githubusercontent.com/42673172/136384068-707c0007-22f8-4bb0-86c8-67618600e3da.png)

![Screenshot (37)](https://user-images.githubusercontent.com/42673172/136384095-d5a65be5-83ee-4809-8aaf-349622ae620a.png)

![Screenshot (38)](https://user-images.githubusercontent.com/42673172/136384121-1e08b44f-8381-4542-8b52-e20017e4de10.png)

# Steps to run:
1) Set up MySQL database with the same local instance on localhost:3306 and same username and password as 'root'(please refer application.properties file), create a database named 'project', in that database create a table named 'userlist'.
Query to create a table -> CREATE TABLE userlist (
    user_id Integer(100),
    fname varchar(25),
    lname varchar(25),
    dob date,
    city varchar(25),
    mobile varchar(11)
);
Make user_id as primary key and add auto-increment to it.
If you want to make any changes to table name or database name or localhost configuration, you may need to make the same changes in application.properties file.

2) Then, you need to import the project in your spring tool suite. After importing you have to run the application from there.
3) Lastly, you have to follow the postman mechanism screenshots, in which api calls are present to access the features of this service.



# More Features:
1) Added the functionality of Exception Handling.
2) Two ways to use the Get Request, one is by using an id, which will only show the user associated with that id and the other Get request will display all the users from the database.
