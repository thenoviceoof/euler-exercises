; find difference between the sum of squares and square of sums for [1..100]

(println
 (- (#(* % %) (reduce + (range 101)))
    (reduce + (map #(* % %) (range 101))))
)