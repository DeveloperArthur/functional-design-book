(ns functional-design-book.beecrowd.1001)

(let [x (read-line)]
  (let [y (read-line)]
    (println "X =" (+
                     (Integer/parseInt x)
                     (Integer/parseInt y)))))