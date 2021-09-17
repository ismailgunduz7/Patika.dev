SELECT customer_id, COUNT(customer_id)
FROM payment
GROUP BY customer_id
HAVING COUNT(customer_id) >=
ALL (
	SELECT COUNT(*)
	FROM payment
	GROUP BY customer_id
)