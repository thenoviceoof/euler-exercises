; find the 10001st prime

(require 'clojure.contrib.seq-utils)

(defn div [x y] (zero? (mod x y)))

(defn gen-primes-up-to [i ind primes]
  (if (= ind (count primes))
    (last primes)
    (recur (inc i) ind
           (if (some (partial div i) primes)
             primes
             (concat primes [i])))))

(println (gen-primes-up-to 2 10001 []))
