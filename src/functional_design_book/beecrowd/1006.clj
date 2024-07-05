(ns functional-design-book.beecrowd.1006)

(import '(java.math BigDecimal RoundingMode))

(defn round-to-decimals [value]
  (let [bd (BigDecimal. value)]
    (.toPlainString (.setScale bd 1 RoundingMode/HALF_UP))))

(let [a (read-line)]
  (let [b (read-line)]
    (let [c (read-line)]
      (let [result1 (* (Double/parseDouble a) 2)]
        (let [result2 (* (Double/parseDouble b) 3)]
          (let [result3 (* (Double/parseDouble c) 5)]
            (let [media (/ (+ result1 result2 result3) 10)]
              (println
                (str "MEDIA = " (round-to-decimals media))))))))))