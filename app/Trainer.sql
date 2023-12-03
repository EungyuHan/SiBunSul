CREATE DATABASE Trainer;
USE Trainer;
CREATE TABLE Trainer (Name VARCHAR(50) PRIMARY KEY,
					  Address VARCHAR(50) NOT NULL,
					  Email VARCHAR(50) NOT NULL,
					  Phone VARCHAR(50) NOT NULL);
					
INSERT INTO Trainer (Name, Address, Email, Phone) 
VALUES ('User','jeonju','User@gmail.com', '01012341234');

SELECT * FROM Trainer;