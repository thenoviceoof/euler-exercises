; sum of things divisible by 3 or 5

(defn check [x]
  (or (zero? (mod x 3))
      (zero? (mod x 5))))

(println (reduce
          #(+ %1 %2)
          (for
              [i (range 1000) :when (check i)]
            i)))