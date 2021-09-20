SELECT customer.first_name, customer.last_name, COUNT(payment.customer_id)
FROM customer
JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY payment.customer_id, customer.first_name, customer.last_name
ORDER BY COUNT(payment.customer_id) DESC
LIMIT 1