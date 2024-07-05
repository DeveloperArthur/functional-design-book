(ns functional-design-book.exercicios-em-clojure.prime-factors)

;Esta solução não é sustentável. Isso nos forçaria a somar os casos 5, 7, 11, 13… até o
;primo máximo que nossa linguagem poderia conter
;(defn prime-factors-of [n]
;  (if (> n 1)
;    (if (zero? (rem n 2))
;      (cons 2 (prime-factors-of (quot n 2)))
;      (if (zero? (rem n 3))
;        (cons 3 (prime-factors-of (quot n 3)))
;        [n]))
;    []))

(defn prime-factors-of [n]
  (loop [n n
         divisor 2
         factors []]
    (if (> n 1)
      (if (zero? (rem n divisor))
        (recur (quot n divisor) divisor (conj factors divisor))
        (recur n (inc divisor) factors))
      factors)))

(defn should [expected actual]
  (cond
    (= expected actual) (println "test passed")
    :else (println "test not passed: Expected" expected "Got:" actual)))

(should [] (prime-factors-of 1))
(should [2] (prime-factors-of 2))
(should [3] (prime-factors-of 3))
(should [2 2] (prime-factors-of 4))
(should [5] (prime-factors-of 5))
(should [2 3] (prime-factors-of 6))
(should [7] (prime-factors-of 7))
(should [2 2 2] (prime-factors-of 8))
(should [3 3] (prime-factors-of 9))