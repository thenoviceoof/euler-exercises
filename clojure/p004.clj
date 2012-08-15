; largest palindrome from product of two 3-digit numbers

(def max 999)

(println
 (loop [i 1
        j 1
        cur 0]
   (if (and (= i max) (= j max))
     cur
     (let [n (* i j)
           s (Integer/toString n)]
       (recur (if (= i max)
                j
                (inc i))
              (if (= i max)
                (inc j)
                j)
              (if (and (= s (apply str (reverse s))) (> n cur))
                n
                cur)))))
)
