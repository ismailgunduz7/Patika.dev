SELECT city.city, country.country
FROM city INNER JOIN country on city.country_id = country.country_id