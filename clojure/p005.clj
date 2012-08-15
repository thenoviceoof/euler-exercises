; What is the smallest positive number that is evenly divisible by all
; of the numbers from 1 to 20?

(use 'clojure.contrib.math)

; find the prime factors of all the numbers, take the union
(defn prime-factors [number]
  (loop [i 2
         n number
         h {}]
    (if (= n i)
      (assoc h i (inc (get h i 0)))
      (if (zero? (mod n i))
        (recur i (/ n i) (assoc h i (inc (get h i 0))))
        (recur (inc i) n h)))))

(def facs (map prime-factors (range 2 20)))
(println
(reduce
 #(* %1 %2)
 (map #(expt (get % 0) (get % 1))
      (seq (apply merge-with
                  (cons (fn [val1 val2]
                          (max val1 val2))
                        facs)))))
)
