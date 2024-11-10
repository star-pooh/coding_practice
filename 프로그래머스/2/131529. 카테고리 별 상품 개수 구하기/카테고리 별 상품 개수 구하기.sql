SELECT
    SUBSTR(PRODUCT_CODE, 1, 2) AS CATEGORY,
    COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT
GROUP BY CATEGORY
ORDER BY CATEGORY;