(ns functional-design-book.recursao-e-iteracao.fibonacci-com-recursao)

;A função fib já deve ser autoexplicativa. Afinal, fib(n) é apenas fib(n−1) + fib(n−2)
(defn fib [n]
  (cond
    (< n 1) nil
    (<= n 2) 1
    :else (+ (fib (dec n)) (fib (- n 2)))))

(defn fibs [n]
  ;A função range recebe dois argumentos, a e b, e retorna uma lista de todos os inteiros de a
  ;para b-1.
  ; A função map leva dois argumentos, f e l. O argumento f deve ser uma função e o
  ;argumento l deve ser uma lista. Chama f com cada membro de l e retorna uma lista
  ;contendo os resultados.
  (map fib (range 1 (inc n))))

(println (fibs 20))

;---------- alternativa inves de usar fibs
(defn lazy-fibs []
  (map fib (rest (range))))

(print (take 10 (lazy-fibs)))
