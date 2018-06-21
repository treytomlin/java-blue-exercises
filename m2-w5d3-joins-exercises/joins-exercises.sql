-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
select film.title from film
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
where first_name = 'NICK' and last_name = 'STALLONE'
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
select film.title from film
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
where first_name = 'RITA' and last_name = 'REYNOLDS'
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
select film.title from film
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
where first_name = 'JUDY' and last_name = 'DEAN' or first_name = 'RIVER' and last_name = 'DEAN'
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Documentary'

-- 5. All of the ‘Comedy’ films
-- (58 rows)
select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Comedy'
-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Children'
and rating = 'G'
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Family'
and rating = 'G'
and length < 120
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
select film.title from film
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
where first_name = 'MATTHEW' and last_name = 'LEIGH' 
and rating = 'G'
-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Sci-Fi'
and release_year = 2006
-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
select film.title from film
join film_actor on film.film_id = film_actor.film_id
join actor on film_actor.actor_id = actor.actor_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Action'
and first_name = 'NICK' and last_name = 'STALLONE' 
-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
select address.address, city.city, address.district, country.country from store
join address on store.address_id = address.address_id
join city on address.city_id = city.city_id
join country on city.country_id = country.country_id
-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
select store.store_id, address.address, staff.first_name from store
join staff on store.store_id = staff.store_id
join address on staff.address_id = address.address_id
join city on address.city_id = city.city_id
join country on city.country_id = country.country_id


-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
select CONCAT(customer.first_name || ' '|| customer.last_name) as top_customers, COUNT(payment.rental_id) as number_of_rentals from customer
join rental on customer.customer_id = rental.customer_id
join payment on rental.rental_id = payment.rental_id
group by top_customers 
order by number_of_rentals desc
limit 10 
-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
select CONCAT(customer.first_name || ' '|| customer.last_name) as top_customers, SUM(payment.amount) as total_paid from customer
join rental on customer.customer_id = rental.customer_id
join payment on rental.rental_id = payment.rental_id
group by top_customers 
order by total_paid desc
limit 10 
-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
select store.store_id, address.address, COUNT(payment.rental_id) as total_number_of_rentals, SUM(payment.amount) as total_amount_of_sales, AVG(payment.amount)as average_sale_per_store from store
join address on store.address_id = address.address_id
join customer on store.store_id = customer.store_id
join payment on customer.customer_id = payment.customer_id
JOIN rental ON payment.rental_id = rental.rental_id
GROUP BY store.store_id, address.address;
-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)
select film.title, COUNT(rental.rental_id) as number_of_rentals from film
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
group by film.title
order by number_of_rentals desc
limit 10
-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)
select category.name, COUNT(rental.rental_id) as total_rentals from film
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
group by category.name
order by total_rentals desc
limit 5
-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
select COUNT(rental.rental_id) as total_rentals from film
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Action'
group by film.title
order by total_rentals desc
limit 5
-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)
SELECT actor.first_name, actor.last_name, COUNT(rental.rental_id) AS total_rentals FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
GROUP BY actor.actor_id, actor.first_name, actor.last_name
ORDER BY total_rentals DESC 
LIMIT 10;
-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
SELECT CONCAT(actor.first_name || ' ' || actor.last_name) as top_actors, COUNT(rental.rental_id) AS total_rentals FROM actor
JOIN film_actor ON actor.actor_id= film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
JOIN film_category ON inventory.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Comedy'
GROUP BY actor.actor_id, top_actors
ORDER BY total_rentals DESC 
LIMIT 5;