(ns functional-design-book.exercicios-em-clojure.boliche)

;(defn to-frames [rolls]
;  (let [frames (partition 2 rolls)
;        possible-bonuses (map #(take 1 %) (rest frames))
;        possible-bonuses (concat possible-bonuses [[0]])]
;    (map concat frames possible-bonuses)))
;
;(defn add-frame [score frame-and-bonus]
;  (let [frame (take 2 frame-and-bonus)]
;    (if (= 10 (reduce + frame))
;      (+ score (reduce + frame-and-bonus))
;      (+ score (reduce + frame)))))

(defn to-frames [rolls]
  (loop [remaining-rolls rolls
         frames []]
    (cond
      (empty? remaining-rolls)
      frames

      (= 10 (first remaining-rolls))
      (recur (rest remaining-rolls)
             (conj frames (take 3 remaining-rolls)))

      (= 10 (reduce + (take 2 remaining-rolls)))
      (recur (drop 2 remaining-rolls)
             (conj frames (take 3 remaining-rolls)))
      :else
      (recur (drop 2 remaining-rolls)
             (conj frames (take 2 remaining-rolls))))))

(defn add-frame [score frame]
  (+ score (reduce + frame)))

(defn score [rolls]
  (reduce add-frame 0 (take 10 (to-frames rolls))))

(defn should [expected actual]
  (cond
    (= expected actual) (println "test passed")
    :else (println "test not passed: Expected" expected "Got:" actual)))

(should 0 (score (repeat 20 0)))
(should 20 (score (repeat 20 1)))
(should 24 (score (concat [5 5 7] (repeat 17 0))))
(should 20 (score (concat [10 2 3] (repeat 16 0))))
(should 300 (score (repeat 12 10)))