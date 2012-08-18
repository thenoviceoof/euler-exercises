; There exists exactly one Pythagorean triplet (a^2+b^2=c^2) for which
; a + b + c = 1000.  Find the product abc.

(def M 1000)

(println
(some #(let [a (get % 0) b (get % 1) c (get % 2)]
         (if (= (+ (* a a) (* b b)) (* c c))
           (* a b c)))
      (for [i (range 1 M)
            j (range 1 M) :when (> M (+ i j))]
        [i j (- M i j)]))
)
