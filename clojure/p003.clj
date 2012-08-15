; find a prime factorization of a number, get largest such factor

(def number 600851475143)
;(def number 1000)

(def upper-limit (Math/ceil (Math/sqrt number)))

(defn div [n x]
  (zero? (mod n x)))

(println (loop [i 2
                n number]
           (if (= i n)
             i
             (recur (if (div n i)
                      i
                      (inc i))
                    (if (div n i)
                      (/ n i)
                      n)))))

; first attempt, which took forever           
;; (loop [cur 0
;;        candidates (range 2 upper-limit)]
;;   (if (empty? candidates)
;;     cur
;;     (let [i (first candidates)
;;           cands (if (zero? i)
;;                   candidates
;;                   (doall (filter #(not (div % i)) candidates)))]
;;       (println [i upper-limit])
;;       (recur (max cur (if (div number i) i 0)) cands))))
