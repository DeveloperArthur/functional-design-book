(ns functional-design-book.beecrowd.2879)

(def counter (atom 0))

(let [n (read-line)]
  (dotimes [i (Integer/parseInt n)]
    (let [a (read-line)]
      (if (not= (Integer/parseInt a) 1)
        (swap! counter inc))))
  (println @counter))