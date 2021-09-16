SELECT payment.payment_id, customer.first_name, customer.last_name
FROM payment INNER JOIN customer on payment.customer_id = customer.customer_id