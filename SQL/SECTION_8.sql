-- SECTION 8
--REFINING OUR SELETIONS
--More Weapons In The ArsenaL
DROP DATABASE IF EXISTS book_shop2;
CREATE DATABASE book_shop2;
USE book_shop2; 
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

	INSERT INTO books(title, author_fname, author_lname, released_year, stock_quantity, pages)
		VALUES ('10% Happier', 'Dan', 'Harris', 2014, 29, 256), 
           ('fake_book', 'Freida', 'Harris', 2001, 287, 428),
           ('Lincoln In The Bardo', 'George', 'Saunders', 2017, 1000, 367);
	
	--1.DISTINCT --> REMOVE DUPLICATES FROM THE TABLE OR COLUMNS
		SELECT DISTINCT author_lname FROM books;
		SELECT DISTINCT author_fname, author_lname FROM books;
		SELECT DISTINCT CONCAT(author_fname,' ', author_lname) FROM books;
	--2.ORDER BY
		SELECT AUTHOR_FNAME FROM BOOKS ORDER BY AUTHOR_FNAME;
		SELECT AUTHOR_FNAME FROM BOOKS ORDER BY AUTHOR_FNAME DESC;
		--NUMBER TO
		SELECT RELEASED_YEAR FROM BOOKS ORDER BY RELEASED_YEAR;
		-- I WANT TITLE AS ASC
		SELECT TITLE,AUTHOR_FNAME,AUTHOR_LNAME FROM BOOKS ORDER BY 1; --OR
		SELECT TITLE,AUTHOR_FNAME,AUTHOR_LNAME FROM BOOKS ORDER BY 1 ASC;
		-- DESC THE TITLES
		SELECT TITLE,AUTHOR_FNAME,AUTHOR_LNAME FROM BOOKS ORDER BY 1 DESC;
		-- I WANT TO SORT THE AUTHOR FIRST NAME BUT NOT CHANGE THIR LAST NAME
		SELECT AUTHOR_FNAME,AUTHOR_LNAME FROM BOOKS ORDER BY AUTHOR_FNAME,AUTHOR_LNAME;
		SELECT RELEASED_YEAR,AUTHOR_FNAME FROM BOOKS ORDER BY RELEASED_YEAR DESC,AUTHOR_FNAME;
	--3.LIMIT
		--NOTE: ORDER IS ASLO IMP OTHERWISE NOT EXECUTED
		SELECT RELEASED_YEAR,AUTHOR_FNAME FROM BOOKS ORDER BY RELEASED_YEAR DESC,AUTHOR_FNAME LIMIT 4;
		--PRINTS AFTER 4 DIGITS AFTER 7 VALUES
		SELECT RELEASED_YEAR,AUTHOR_FNAME FROM BOOKS ORDER BY RELEASED_YEAR DESC,AUTHOR_FNAME LIMIT 4,7;
		SELECT RELEASED_YEAR,AUTHOR_FNAME FROM BOOKS ORDER BY RELEASED_YEAR DESC,AUTHOR_FNAME LIMIT 4,2;
		--SELECT * FROM BOOKS LIMIT 95,18446744073709551615;
	--4.LIKE -- BETTER SEARCHING
		-- WILDCARDS
		-- DISPLAY THE AUTHOR NAMES STARTING WITH DA
		SELECT TITLE,AUTHOR_FNAME FROM BOOKS WHERE AUTHOR_FNAME LIKE "DA%";
		-- DISPLAY THE AUTHOR NAMES STARTING WITH VE
		SELECT TITLE,AUTHOR_FNAME FROM BOOKS WHERE AUTHOR_FNAME LIKE "%VE";
		-- DISPLAY THE AUTHOR NAMES STARTING OR ENDING WITH DA
		SELECT TITLE,AUTHOR_FNAME FROM BOOKS WHERE AUTHOR_FNAME LIKE "%DA%";
		-- DISPLAY 3 LETTERS WORDS
		SELECT TITLE,AUTHOR_FNAME FROM BOOKS WHERE AUTHOR_FNAME LIKE "___";
		--NUMBER TOO
		SELECT RELEASED_YEAR FROM BOOKS WHERE RELEASED_YEAR LIKE "20%";
		--(235)234-0987 LIKE '(___)___-____'
		
--ASSIGNMENT
	--1.Select All Story Collections-->Titles  That contain 'stories'
	SELECT TITLE FROM BOOKS WHERE TITLE LIKE "%STORIES";
	--2.Find The Longest Book-->Print Out the Title and Page Count
	SELECT TITLE AS TITLE,PAGES AS PAGES FROM BOOKS ORDER BY PAGES DESC LIMIT 1;
	--3.Print a summary containing the title and year, for the 3 most recent books
	SELECT TITLE,RELEASED_YEAR FROM BOOKS ORDER BY RELEASED_YEAR DESC LIMIT 3;
	--4.Find all books with an author_lname-->that contains a space(" ")
		--NOTE: SPACE MUST BE % % ALWAYS
	SELECT TITLE AS TITLE,AUTHOR_LNAME AS LASTNAME FROM BOOKS WHERE AUTHOR_LNAME LIKE "% %";
	--5.Find The 3 Books With The Lowest Stock--> Select title, year, and stock
	SELECT TITLE AS TITLE,RELEASED_YEAR AS YEARS,STOCK_QUANTITY AS STOCK_QUANTITY FROM BOOKS 
					ORDER BY STOCK_QUANTITY,RELEASED_YEAR DESC LIMIT 3;
	--6.Print title and author_lname, sorted first by author_lname and then by title
	SELECT TITLE AS TITLE,AUTHOR_LNAME AS LASTNAME FROM BOOKS ORDER BY AUTHOR_LNAME;
	--7.SORT TITLE AND SORT FIRST NAME
	SELECT TITLE AS TITLE,AUTHOR_LNAME AS LASTNAME FROM BOOKS ORDER BY AUTHOR_LNAME,TITLE;
	--8.Make This Happen...Sorted Alphabetically By Last Name
	SELECT UPPER(CONCAT("MY FAVORITE AUTHOR IS ",AUTHOR_FNAME," ",AUTHOR_LNAME)) AS YELL FROM BOOKS ORDER BY AUTHOR_LNAME;

