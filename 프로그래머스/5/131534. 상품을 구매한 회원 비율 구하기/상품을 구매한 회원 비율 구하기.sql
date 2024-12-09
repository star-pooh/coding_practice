SELECT
    YEAR(O.SALES_DATE) AS YEAR,
    MONTH(O.SALES_DATE) AS MONTH,
    COUNT(DISTINCT O.USER_ID) AS PURCHASED_USERS,
    ROUND(COUNT(DISTINCT O.USER_ID) / (
        SELECT 
            COUNT(*)
        FROM 
            USER_INFO
        WHERE 
            YEAR(JOINED) = 2021
    ), 1) AS PUCHASED_RATIO
FROM 
    USER_INFO U
INNER JOIN
    ONLINE_SALE O
ON
    U.USER_ID = O.USER_ID
WHERE
    YEAR(JOINED) = 2021
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH