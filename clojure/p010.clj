; find sum of primes below 2 million

(defn div [x y] (zero? (mod x y)))

; pretty much ripped off http://paste.lisp.org/display/69952
; could try and use a map
(defn primes [n]
  (let [root (int (Math/ceil (Math/sqrt n)))]
    (loop [i 3
           a (int-array n)
           res (list 2)]
      (if (>= i n)
        res
        (recur (+ i 2)
               (if (< i root)
                 (loop [c (+ i i)
                        arr a]
                   (if (>= c n)
                     arr
                     (recur (+ c i)
                            (do (aset arr c (int 1)) arr))))
                 a)
               (if (zero? (aget a i))
                 (conj res i)
                 res) )))))

(println (reduce + (primes 2000000)))


;; ; gonna use the sieve
;; (defn ss [M]
;;   (loop [s (take M (iterate #(+ 2 %) 3))
;;          sum 3] ; 1 + 2
;;     (let [f (first s)]
;;       (println f)
;;       (if (or (empty? s) (> f M))
;;         sum
;;         (recur (doall (filter #(not (div % f)) s))
;;                (+ f sum)))))
;;   )

;; (println (ss 2000000))