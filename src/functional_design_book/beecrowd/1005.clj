(ns functional-design-book.beecrowd.1005)

(import '(java.math BigDecimal RoundingMode))

(defn round-to-decimals [value]
  (let [bd (BigDecimal. value)]
    (.toPlainString (.setScale bd 5 RoundingMode/HALF_UP))))

(let [nota1 (read-line)]
  (let [nota2 (read-line)]
    (let [result1 (* (Double/parseDouble nota1) 3.5)]
      (let [result2 (* (Double/parseDouble nota2) 7.5)]
        (let [media (/ (+ result1 result2) 11)]
          (println (str "MEDIA = " (round-to-decimals media))))))))