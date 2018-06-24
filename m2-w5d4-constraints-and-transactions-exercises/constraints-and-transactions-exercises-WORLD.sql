-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The 
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on 
-- Wikipedia.)
select * from city
where countrycode = 'USA' and district = 'Kansas' 
ORDER BY id DESC

BEGIN TRANSACTION;

INSERT INTO city(id, name, countrycode, district, population)
VALUES ('4080', 'Smallville', 'USA', 'Kansas', '45001')

COMMIT;

ROLLBACK;


-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.

SELECT * FROM countrylanguage
ORDER BY 

BEGIN TRANSACTION;

INSERT INTO countrylanguage(countrycode, language, isofficial, percentage)
VALUES ('USA', 'Kryptonese', false, '0.0001')


COMMIT;

ROLLBACK;

-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change 
-- the appropriate record accordingly.

SELECT * FROM countrylanguage
where language = 'Krypto-babble'

BEGIN TRANSACTION;

UPDATE countrylanguage SET language = 'Krypto-babble'
where language = 'Kryptonese'


COMMIT;

ROLLBACK;

-- 4. Set the US captial to Smallville, Kansas in the country table.

SELECT * FROM country
where code = 'USA'

BEGIN TRANSACTION;

UPDATE country SET capital = '4080'
where capital = '3813'


COMMIT;

ROLLBACK;

-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
-- No, because of the commit in #4, there is now a foreign key constraint on table country, at country_capital

SELECT * FROM city
where name = 'Smallville'

BEGIN TRANSACTION;

DELETE from city
where name = 'Smallville'


COMMIT;

ROLLBACK;

-- 6. Return the US captial to Washington.

SELECT * FROM country
where code = 'USA'

BEGIN TRANSACTION;

UPDATE country SET capital = '3813'
where capital = '4080'


COMMIT;

ROLLBACK;

-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)
-- Yes, because we removed the foreign key constraint in #6 by removing Smallville as the capital, allowing us to delete it. 
SELECT * FROM city
where name = 'Smallville'

BEGIN TRANSACTION;

DELETE from city
where name = 'Smallville'


COMMIT;

ROLLBACK;


-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972 
-- (exclusive). 
-- (590 rows affected)

select * from countrylanguage

BEGIN TRANSACTION;

UPDATE countrylanguage SET isofficial = NOT isofficial
WHERE countrylanguage.countrycode IN (SELECT country.code FROM country WHERE country.indepyear > 1800 AND country.indepyear < 1972)

COMMIT;

ROLLBACK;
-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)

select * from city

BEGIN TRANSACTION;


UPDATE city SET population = population / 1000

COMMIT;

ROLLBACK;



-- 10. Assuming a country's surfacearea is expressed in miles, convert it to 
-- meters for all countries where French is spoken by more than 20% of the 
-- population.
-- (7 rows affected)

BEGIN TRANSACTION;

SELECT co.name, ROUND(CAST(co.surfacearea * 1609.344 AS DECIMAL), 3)
FROM countrylanguage cl
JOIN country co ON co.code = cl.countrycode
WHERE language ='French' AND cl.percentage > 20

COMMIT;

ROLLBACK;


