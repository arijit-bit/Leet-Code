# Write your MySQL query statement below
SELECT 

-- sum(immediate)/total-customers * 100
    ROUND(100.0 * SUM(CASE WHEN order_date = customer_pref_delivery_date THEN 1 ELSE 0 END) 
          / COUNT(*),2) AS immediate_percentage
FROM Delivery d
-- finding out the latest first delevery of customers
WHERE order_date = (
    SELECT MIN(order_date)
    FROM Delivery
    WHERE customer_id = d.customer_id
);
