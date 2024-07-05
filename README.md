# functional-design-book

## Programação sem estado

O conceito de "estado" refere-se ao conjunto de informações que define a condição de um 
sistema ou de um programa em um determinado momento.

Na programação imperativa, o estado de uma aplicação pode ser representado pelas variáveis, 
pois elas contêm informações que definem a condição atual do programa em um dado momento, 
ou seja, o estado do programa é mantido na memória através de variáveis, por exemplo:

```java
public class ImperativeExample {
    public static void main(String[] args) {
        int count = 0;  // Estado inicial

        for (int i = 0; i < 10; i++) {
            count += 1;  // Alteração do estado
        }

        System.out.println("Final count: " + count);  // Estado final
    }
}
```

Na programação funcional, a ideia é evitar mudanças de estado e variáveis mutáveis. 
Em vez disso, as funções retornam novos estados com base nos estados anteriores sem modificá-los.

Por isso é uma programação sem estado, na programação imperativa, a mudança de estado pode levar 
a efeitos colaterais, onde mudanças em uma parte do programa afetam outras partes, 
na programação funcional não tem efeitos colaterais pois o mesmo input sempre resulta no mesmo 
output, e o estado anterior não é modificado, veja esse exemplo em Java:

```java
public class ImperativeExample {
    static int globalState = 0;

    //A função add depende de uma variável global globalState.
    //Cada chamada à função add modifica globalState.
    public static int add(int x) {
        globalState += x;
        return globalState;
    }

    public static void main(String[] args) {
        O mesmo input 5 resulta em outputs diferentes (5, 10, 15), dependendo do estado de globalState.
        System.out.println(add(5));  // Output: 5
        System.out.println(add(5));  // Output: 10
        System.out.println(add(5));  // Output: 15
    }
}
```

O mesmo exemplo com Clojure:

```clojure
(defn add [state x]
  (+ state x))

(let [state1 (add 0 5)  ; Output: 5
      state2 (add state1 5)  ; Output: 10
      state3 (add state2 5)]  ; Output: 15
  (println state1)  ; Output: 5
  (println state2)  ; Output: 10
  (println state3))  ; Output: 15
```

A ideia de programar sem estado é criar novos valores em vez de modificar os existentes,
e é o programador quem cria novos estados ao invés de modificar estados existentes. 

Isso é feito através da criação de novas variáveis locais ou da passagem de novos valores 
como argumentos para funções, seguindo o princípio da imutabilidade dos dados.

## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    $ java -jar functional-design-book-0.1.0-standalone.jar [args]

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2024 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
