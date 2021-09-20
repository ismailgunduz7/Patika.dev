SELECT *
FROM film
WHERE title LIKE 'K%'
ORDER BY film.length DESC, replacement_cost ASC
LIMIT 4