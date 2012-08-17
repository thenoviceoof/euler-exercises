; find the 10001st prime

(defn div [x y] (zero? (mod x y)))

(defn gen-primes-up-to [i ind primes]
  (if (= ind (count primes))
    (last primes)
    (recur (inc i) ind
           (if (not (empty? (filter (partial div i) primes)))
             primes
             (concat primes [i])))))

(println (gen-primes-up-to 2 10001 []))
