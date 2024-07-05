(ns functional-design-book.beecrowd.1002)

(import '(java.math BigDecimal RoundingMode))

(defn round-to-decimals [value]
  (let [bd (BigDecimal. value)]
    (.toPlainString (.setScale bd 4 RoundingMode/HALF_UP))))

(let [raio (read-line)]
  (let [n 3.14159]
    (let [resultado (* n (*
                           (Double/parseDouble raio)
                           (Double/parseDouble raio)))]
      (println (str "A=" (round-to-decimals resultado))))))