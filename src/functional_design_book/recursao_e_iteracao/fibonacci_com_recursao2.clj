(ns functional-design-book.recursao-e-iteracao.fibonacci_com_recursao2)

(defn ifib
  ([n a b]
   (if (= 0 n)
     b
     (recur (dec n) b (+ a b))))
  ([n]
   (cond
     (< n 1) nil
     (<= n 2) 1
     :else (ifib (- n 2) 1 1))))

(print (ifib 15))
