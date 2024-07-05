(ns functional-design-book.recursao-e-iteracao.fibonacci-com-iteracao)

(defn fibs-work [n i fs]
  ; A função if leva três argumentos.
  ;Ele avalia o primeiro como um predicado. = (= i n)
  ;Se o predicado for verdadeiro, ele retorna o segundo argumento; = fs
  ;Caso contrário, ele retornará o terceiro.
  ;Então, se (= i n), então retornamos fs. Caso contrário...
  ;Bem, vamos examinar isso com cuidado
  (if (= i n)
    fs ;O argumento fs é a lista atual de números de Fibonacci

    ;Esta é uma chamada recursiva para fibs-work, passando n inalterado, i incrementado em
    ;1 e fs com um novo número de Fibonacci anexado.

    ;É a função conj que faz o acréscimo. São necessários dois argumentos: um vetor e o
    ;valor a ser anexado a esse vetor. Os vetores são uma espécie de lista.

    ;A função take-last recebe dois argumentos: um número n e uma lista. Ele retorna uma
    ;lista contendo os últimos n elementos do argumento da lista.

    ;A função apply recebe dois argumentos: uma função e uma lista. Ele chama a função com
    ;a lista como argumentos. Portanto, (apply + [3 4]) é equivalente a (+ 3 4).

    ;SEM TCO:
    ;(fibs-work n (inc i) (conj fs (apply + (take-last 2 fs))))

    ;COM TCO
    ;A função recur só pode ser chamada a partir de uma posição final e
    ;efetivamente invoca novamente a função envolvente sem aumentar a pilha
    (recur n (inc i) (conj fs (apply + (take-last 2 fs))))))

(defn fibs [n]
  (cond
    (< n 1) []
    (= n 1) [1]
    :else (fibs-work n 2 [1 1])))

(print (fibs 15))


