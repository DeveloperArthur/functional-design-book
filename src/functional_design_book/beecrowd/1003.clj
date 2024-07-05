(ns functional-design-book.beecrowd.1003)

(let [a (read-line)]
  (let [b (read-line)]
    (println (str "SOMA = "
                  (+ (Integer/parseInt a)
                     (Integer/parseInt b))))))