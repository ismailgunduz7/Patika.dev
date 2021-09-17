SELECT COUNT(*)
FROM film
WHERE film.length >
(
	SELECT AVG(length)
 	FROM film
)