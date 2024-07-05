(ns functional-design-book.beecrowd.1004)

(let [a (read-line)]
  (let [b (read-line)]
    (println (str "PROD = "
                  (* (Integer/parseInt a)
                     (Integer/parseInt b))))))