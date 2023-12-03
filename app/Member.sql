CREATE DATABASE Member;
USE Member;
CREATE TABLE Member (Name VARCHAR(50) PRIMARY KEY,
					  Address VARCHAR(50) NOT NULL,
					  Email VARCHAR(50) NOT NULL,
					  Phone VARCHAR(50) NOT NULL,
					  TrainerName VARCHAR(50) NOT NULL);
INSERT INTO Member (Name, Address, Email, Phone, TrainerName) 
VALUES ('User','jeonju','User@gmail.com', '01012341234','HongGildong');

SELECT * FROM Member;