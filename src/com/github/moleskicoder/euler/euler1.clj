; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;
; Find the sum of all the multiples of 3 or 5 below 1000.

(ns com.github.moleskicoder.clojure-euler.euler1
  (:gen-class))

(defn multiple? [x y]
  (zero? (mod x y)))

(defn euler1 []
  (reduce +
    (filter #(or (multiple? % 3) (multiple? % 5))
      (range 1 1000))))

(defn -main
 [& args]
 (println (euler1)))
