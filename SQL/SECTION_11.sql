-- SECTION 11
-- THE POWER OF LOGICAL OPERATORS
DROP DATABASE IF EXISTS BOOK_SHOP4;
CREATE DATABASE BOOK_SHOP4;
USE BOOK_SHOP4; 

CREATE TABLE BOOKS(
		ID INT NOT NULL AUTO_INCREMENT,
		AUTHOR VARCHAR(100),
		BOD_OF_AUTOR DATE,
		BOOK_NAME VARCHAR(200),
		PUBLISH_YEAR INT,
		STOCK INT,
		PRINCE FLOAT,
		PRIMARY KEY(ID)	);
INSERT INTO BOOKS(AUTHOR,BOD_OF_AUTOR,BOOK_NAME,PUBLISH_YEAR,STOCK,PRINCE)	
		VALUES("MEDARI","1997-05-10","JAVA",2000,13,19.99),
		("KUMAR","1999-05-10","C++ ",2017,4,7.99),
		("MEDARI","1997-05-10","JAVA",2000,13,19.99),
		("KUMAR","1999-06-10","C++ ",2017,4,7.99),
		("CHINNA","1997-08-10","JAVA",2000,13,19.99),
		("MEDARI","1998-05-10","VALUE C",2000,3,30.99),
		("MEDARI","1997-05-10","JAVA",2000,13,19.99),
		("MEDARI","1997-05-10","JAVA",2000,13,19.99),
		("MEDARI","1997-05-10","JAVA",2000,13,19.99),
		("MEDARI","1997-05-10","JAVA",2000,13,19.99),
		("MEDARI","1997-05-10","JAVA",2000,13,19.99);
		("MEDARI","1997-05-10","JAVA",2000,13,19.99);
		
-- 1.NOT EQUAL --> !=
	SELECT AUTHOR,PUBLISH_YEAR FROM BOOKS WHERE PUBLISH_YEAR!=2017;
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE BOOK_NAME!="JAVA";
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE BOOK_NAME="JAVA";--DISPLAYS THE JAVA CONTAINED NAMES
-- 2.NOT LIKE
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE BOOK_NAME NOT LIKE "JA%";
-- 3.GREATER THAN  >
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE PUBLISH_YEAR>2017;
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE PUBLISH_YEAR>=2017;
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE BOOK_NAME>"JAVA";
-- 4.LESS THAN  <
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE PUBLISH_YEAR<2017;
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE PUBLISH_YEAR<=2017;
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE BOOK_NAME<"JAVA";
-- 5. AND &&
	--1.SELECT books written by MEDARI,published after the year 1998
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR ="MEDARI" && PUBLISH_YEAR>1998;
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR ="MEDARI" AND PUBLISH_YEAR>1998;
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR ="MEDARI" AND PUBLISH_YEAR>1998 AND AUTHOR LIKE "ME%";
-- 6. OR ||
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR ="KUMAR" || PUBLISH_YEAR>1998;
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR ="KUMAR" OR PUBLISH_YEAR>1998;
-- 7. BETWEEN
	--IN BETWEEN
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE PUBLISH_YEAR BETWEEN 2000 AND 2020;
	--NOT BETWEEN
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE PUBLISH_YEAR NOT BETWEEN 1998 AND 2000;
-- 8.IN
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR ="KUMAR" OR  AUTHOR="MEDARI" OR AUTHOR="CHINNA";
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR IN ("KUMAR","MEDARI","CHINNA");
	--NOT IN
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR NOT IN ("KUMAR","CHINNA");
	--SELECT TITLE, RELEASED_YEAR FROM BOOKS WHERE RELEASED_YEAR NOT IN(2000,2002,2004,2006,2008,2010,2012,2014,2016);
	
-- 9.% MODULO
	SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE PUBLISH_YEAR>1990 AND PUBLISH_YEAR %2=0;
-- 10. CASE STATEMENT
	SELECT AUTHOR,PUBLISH_YEAR,
		CASE 
			WHEN PUBLISH_YEAR>=2017 THEN "HI"
			ELSE "BYE"
			END AS RES
		FROM BOOKS;
	SELECT AUTHOR,PUBLISH_YEAR,
		CASE
			WHEN STOCK BETWEEN 0 AND 5 THEN "*"
			WHEN STOCK BETWEEN 6 AND 50 THEN "**"
			ELSE "******"
			END AS RES
		FROM BOOKS;
	
-- ASSIGNMENT - 1
		SELECT 10 != 10;
		SELECT 15 > 14 && 99 - 5 <= 94;
		SELECT 1 IN (5,3) || 9 BETWEEN 8 AND 10;
		--1.SELECT ALL BOOKS WRITTEN BEFORE 1980 (NON INCLUSIVE)
		SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE PUBLISH_YEAR>1980;
		--2.SELECT ALL BOOKS WRITTEN BY KUMAR OR MEDARI
		SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR="KUMAR" OR AUTHOR="MEDARI";
		SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR IN("KUMAR","MEDARI");
		--3.SELECT ALL BOOKS WRITTEN BY KUMAR, PUBLISHED AFTER 2000
		SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME FROM BOOKS WHERE AUTHOR="KUMAR" AND PUBLISH_YEAR>2000;
		--4.SELECT ALL BOOKS WITH STOCK COUNTS BETWEEN 4 AND 15
		SELECT AUTHOR,PUBLISH_YEAR,BOOK_NAME,STOCK FROM BOOKS WHERE STOCK BETWEEN 4 AND 15;
		--5.SELECT ALL BOOKS WHERE NAME  STARTS WITH A 'C' OR AN 'K'
		SELECT AUTHOR FROM BOOKS WHERE AUTHOR LIKE "C%";
		SELECT AUTHOR FROM BOOKS WHERE AUTHOR LIKE "C%" OR AUTHOR LIKE "K%";
		--6. OUTPUT
		USE BOOK_SHOP2;
		SELECT TITLE,AUTHOR_LNAME,
			CASE
				WHEN TITLE LIKE "%stories%" THEN "short stories"
				WHEN TITLE = 'Just Kids' OR TITLE = 'A Heartbreaking Work of Staggering Genius' THEN 'Memoir'
				ELSE "NOVEL"
				END AS TYPE
					FROM BOOKS;
		--7.OUTPUT
		SELECT TITLE,AUTHOR_LNAME,
			CASE 
				WHEN COUNT(*) = 1 THEN '1 book'
				ELSE CONCAT(COUNT(*), ' books')
				END AS COUNT
				FROM books 
				GROUP BY author_lname, author_fname;
--END