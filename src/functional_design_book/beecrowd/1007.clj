(ns functional-design-book.beecrowd.1007)

(let [a (read-line)]
  (let [b (read-line)]
    (let [c (read-line)]
      (let [d (read-line)]
        (let [parte1 (* (Integer/parseInt a) (Integer/parseInt b))]
          (let [parte2 (* (Integer/parseInt c) (Integer/parseInt d))]
            (let [diferenca (- parte1 parte2)]
              (println
                (str "DIFERENCA = " diferenca)))))))))