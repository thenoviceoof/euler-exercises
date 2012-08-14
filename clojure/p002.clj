; generate fib sequences up to 4 million, add up even values

(defn fib [a b]
  (if (< b 4000000)
    (+ (if (zero? (mod b 2))
         b 0)
       (fib b (+ a b)))
    0))

(println (fib 1 2))