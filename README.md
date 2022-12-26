# REACTJS-CRUD-HABITS

A project CRUD (create,read,update,delete) application developed using ReactJS. 
This application performs operations such as list of products stored in database,adding,updating and deleting products

Type of mySQL table is like 

+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| id          | bigint       | NO   | PRI | NULL    |auto_increment |
| first_name  | varchar(255) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+

It runs on 8080 port.

There is two endpoints these are 

/api/v1/habits It returns all the list in mySQL table

and 

/api/v1/habit/{id} It returns row with given id

