CREATE DATABASE PTRecord;
USE PTRecord;
CREATE TABLE PTRecord (ptDate date PRIMARY KEY,
					   Memo VARCHAR(50) NOT NULL);
INSERT INTO PTRecord (ptDate, Memo) 
VALUES ('2023-12-25','Push-up 10time 10set');

SELECT * FROM PTRecord;