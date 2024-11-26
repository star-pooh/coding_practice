SELECT
    YEAR(SALES_DATE) AS YEAR,
    MONTH(SALES_DATE) AS MONTH,
    U.GENDER,
    COUNT(DISTINCT U.USER_ID) AS USERS
FROM USER_INFO U
INNER JOIN ONLINE_SALE O
ON U.USER_ID = O.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY MONTH, GENDER
ORDER BY YEAR, MONTH, U.GENDER