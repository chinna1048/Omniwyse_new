-- SECTION 7
-- THE WROLD OF STRING FUNCTIONS
--SOURCE FILENAME.SQL
-- CREATE DB AND TABLE 
DROP DATABASE IF EXISTS book_shop1;
CREATE DATABASE book_shop1;
USE book_shop1; 
CREATE TABLE books 
	(
		book_id INT NOT NULL AUTO_INCREMENT,
		title VARCHAR(100),
		author_fname VARCHAR(100),
		author_lname VARCHAR(100),
		released_year INT,
		stock_quantity INT,
		pages INT,
		PRIMARY KEY(book_id)
	);
INSERT INTO books (title, author_fname, author_lname, released_year, stock_quantity, pages)
  VALUES('The Namesake', 'Jhumpa', 'Lahiri', 2003, 32, 291),
		('Norse Mythology', 'Neil', 'Gaiman',2016, 43, 304),
		('American Gods', 'Neil', 'Gaiman', 2001, 12, 465),
		('Interpreter of Maladies', 'Jhumpa', 'Lahiri', 1996, 97, 198),
		('A Hologram for the King: A Novel', 'Dave', 'Eggers', 2012, 154, 352),
		('The Circle', 'Dave', 'Eggers', 2013, 26, 504),
		('The Amazing Adventures of Kavalier & Clay', 'Michael', 'Chabon', 2000, 68, 634),
		('Just Kids', 'Patti', 'Smith', 2010, 55, 304),
		('A Heartbreaking Work of Staggering Genius', 'Dave', 'Eggers', 2001, 104, 437),
		('Coraline', 'Neil', 'Gaiman', 2003, 100, 208),
		('What We Talk About When We Talk About Love: Stories', 'Raymond', 'Carver', 1981, 23, 176),
		("Where I'm Calling From: Selected Stories", 'Raymond', 'Carver', 1989, 12, 526),
		('White Noise', 'Don', 'DeLillo', 1985, 49, 320),
		('Cannery Row', 'John', 'Steinbeck', 1945, 95, 181),
		('Oblivion: Stories', 'David', 'Foster Wallace', 2004, 172, 329),
		('Consider the Lobster', 'David', 'Foster Wallace', 2005, 92, 343);

SELECT author_fname, author_lname FROM books;
--1.CONCATENATION
	-- CONCATENATION OF AUTHOR_FNAME AND AUTHOR_LNAME
	SELECT CONCAT(AUTHOR_FNAME," ",AUTHOR_LNAME) FROM BOOKS; -- CONCAT(FNAME,LNAME) ATTRIBUTE CREATED
	--CREATE NEW ATTRIBUTE FULL NAME
	SELECT CONCAT(AUTHOR_FNAME, ' ', AUTHOR_LNAME) AS 'FULL NAME' FROM BOOKS; --OR
	SELECT CONCAT(AUTHOR_FNAME, ' ', AUTHOR_LNAME) AS FULL FROM BOOKS;
	-- DISPALY FNAME AND LNAME AND FULLNAME ATTRIBUTESSE
	SELECT AUTHOR_FNAME AS FIRST,AUTHOR_LNAME AS LAST,
		CONCAT(AUTHOR_FNAME," ",AUTHOR_LNAME) AS FULL
		FROM BOOKS;
	-- TITLE,AUTHOR FNAME AND LAST NAME IN CONCAT
	SELECT CONCAT(title, '-', author_fname, '-', author_lname) FROM books;
	 --CONTACT_WS USE
	SELECT CONCAT_WS(' - ', title, author_fname, author_lname) FROM books;
--2.SUBSTRING
	--DEF : RETURNING THE SPECIFIED NUMBER OF CHARACTERS FORM A PARTICULAR POSITION
	--1 TO 10 CHAR IN TITLE ATTRIBUTE---TOTAL ATTRIIBUTE AMY CHANGE
	SELECT SUBSTRING(TITLE,1,10) FROM BOOKS;
	-- CHANGE THE RESULTENT ATTRIBUTE NAME
	SELECT SUBSTRING(TITLE,1,10) AS RES FROM BOOKS;
	-- SHORT FORM
	SELECT SUBSTR(TNITLE,1,10) AS RES FROM BOOKS;
	--CONCAT AND SUBSTRING 
	SELECT CONCAT(SUBSTRING(title, 1, 10),'...') FROM books;
	--ATRIBUTE NAME CHANGE
	SELECT CONCAT(SUBSTR(TITLE,1,10),"...") AS RES FROM BOOKS;
--3.Replace
	SELECT REPLACE('Hello World', 'Hell', '%$#@');
	SELECT REPLACE('Hello World', 'l', '7');
	SELECT REPLACE('Hello World', 'o', '0'); 
	SELECT REPLACE('HellO World', 'o', '*');	
	--REPLACING E TO 3 IN TITLE'S
	SELECT REPLACE(title, 'e ', '3') FROM books;
	--DISPALY 1-10 CHAR AND REPLACE E TO 3
	SELECT SUBSTRING(REPLACE(TITLE, 'E', '3'), 1, 10) AS 'WEIRD STRING' FROM BOOKS;
--4.REVERSE
	SELECT REVERSE("HELLO WORLD");
	SELECT REVERSE(author_fname) FROM books;
	SELECT CONCAT(AUTHOR_FNAME, REVERSE(AUTHOR_FNAME)) AS RES FROM BOOKS;
--5.CHAR_LENGTH
	SELECT CHAR_LENGTH('Hello World');
	SELECT author_lname, CHAR_LENGTH(author_lname) AS 'length' FROM books;
	SELECT CONCAT(author_lname, ' is ', CHAR_LENGTH(author_lname), ' characters long') as res FROM books;
--6.UPPER CASE AND LOWER CASE
	SELECT UPPER("hello world");
	--UPPER
	SELECT UPPER(TITLE) AS UPPER FROM BOOKS;
	--LOWER
	SELECT LOWER(TITLE) AS UPPER FROM BOOKS;

--NOTES
	--DO 
	SELECT UPPER(CONCAT(AUTHOR_FNAME, ' ', AUTHOR_LNAME)) AS "FULL NAME IN CAPS" FROM BOOKS;
	--DONT
	-- SELECT CONCAT(UPPER(AUTHOR_FNAME, ' ', AUTHOR_LNAME)) AS "FULL NAME IN CAPS" FROMD BOOKS;
	--DO
	SELECT CONCAT(UPPER(AUTHOR_FNAME), ' ', UPPER(AUTHOR_LNAME)) AS "FULL NAME IN CAPS" FROM BOOKS;
	
--ASSIGNMENT
	--1.Replace spaces in titles with '->'
	SELECT REPLACE( TITLE," ","->") AS TITLE FROM BOOKS;
	--2.Print This Out  FORWARD AND BACKWORDS -- LAST NAMES
	SELECT AUTHOR_LNAME AS FORWARD,REVERSE(AUTHOR_LNAME) AS BACKWORD FROM BOOKS;
	--3.FULL NAMES IN CAPS
	SELECT UPPER(CONCAT(AUTHOR_FNAME," ",AUTHOR_LNAME)) AS "FULL NAME" FROM BOOKS; --OR
	SELECT CONCAT(UPPER(AUTHOR_FNAME)," ",UPPER(AUTHOR_LNAME)) AS FULLNAME FROM BOOKS;
	--4. IMAGE GIVEN
	SELECT CONCAT(TITLE," was released in",RELEASED_YEAR) AS BLURD FROM BOOKS;
	--5.Print book titles and the length of each title
	SELECT TITLE AS TITLE,CHAR_LENGTH(TITLE) AS LENGTH_OF_BOOKS FROM BOOKS;
	/*6.+---------------+-------------+--------------+
		| short title   | author      | quantity     |
		+---------------+-------------+--------------+
		| American G... | Gaiman,Neil | 12 in stock  |
		| A Heartbre... | Eggers,Dave | 104 in stock |
		+---------------+-------------+--------------+ */
		
	SELECT CONCAT(SUBSTRING(TITLE,1,10),"...") AS TITLE,
		   CONCAT(AUTHOR_LNAME,",",AUTHOR_FNAME) AS AUTHOR,
		   CONCAT(STOCK_QUANTITY," in stock") AS QUANTITY FROM BOOKS 
		   WHERE BOOK_ID=3 OR BOOK_ID=9;