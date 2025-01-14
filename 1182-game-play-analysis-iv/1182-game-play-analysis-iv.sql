SELECT
    ROUND(SUM(DATEDIFF(a.event_date, b.event_date) = 1) / COUNT(DISTINCT a.player_id), 2) AS fraction
FROM
    Activity a
INNER JOIN
    (
        SELECT
            player_id,
            MIN(event_date) AS event_date
        FROM
            Activity
        GROUP BY
            player_id
    ) AS b
ON
    a.player_id = b.player_id
