SELECT rental.rental_id, customer.first_name, customer.last_name
FROM rental INNER JOIN customer on rental.customer_id = customer.customer_id