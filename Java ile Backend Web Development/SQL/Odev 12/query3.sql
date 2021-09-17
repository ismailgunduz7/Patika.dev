SELECT COUNT(*)
FROM film
WHERE film.rental_rate =
(
	SELECT MIN(rental_rate)
 	FROM film
)
AND film.replacement_cost =
(
	SELECT MIN(replacement_cost)
	FROM film
)