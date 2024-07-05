(ns functional-design-book.recursao-e-iteracao.fibonacci-com-memorize)

(declare fib)

(defn fib-w [n]
  (cond
    (< n 1) nil
    (<= n 2) 1
    :else (+ (fib (dec n)) (fib (- n 2)))))

(def fib (memoize fib-w))

;O que aprendemos aqui é que iteração e recursão são abordagens muito
;diferentes. As funções iterativas devem usar chamadas finais para conduzir a
;iteração e devem usar o TCO para evitar o crescimento da pilha.
;Funções recursivas não usam chamadas finais e, portanto, aumentarão a pilha.
;Funções verdadeiramente recursivas podem ser bastante elegantes, e a
;memoização pode ser usada para evitar que essa elegância afete
;significativamente o desempenho.