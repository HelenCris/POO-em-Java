## Programação Orientada ao objeto

Objetivo: Aproximar o mundo digital do mundo real.
Quem criou: Alan Kay.

Como era antes da OOP: 
programação baixo nível -> programação linear -> programação estruturada -> programação modular -> Programação Orientada ao Objeto.

Vantagens: 
COMERNada 
- Confiável: O isolamento entre as partes gera software seguro. Ao alterar uma parte, nenhuma outra é afetada.
- Oportuno: Ao dividir tudo em partes, várias delas podem ser desenvolvidas em paralelo.
- Manutenível: Atualizar um software é mais fácil. Uma pequena modificação vai beneficiar todas as partes que usarem o objeto.
- Extensível: O software não é estático. Ele deve crescer para permanecer útil.
- Reutilizável: Podemos usar objetos de um sistema que criamos em outro sistema futuro.
- Natural: Mais fácil de entender. Você se preocupa mais na funcionalidade do que nos detalhes de implementação.


OBJETO É UMA INSTÂNCIA DE UMA CLASSE.

Objeto: Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características, comportamentos e estado atual.
    - Atributo: Características do objeto
    - Métodos: Comportamentos do objeto
    - Estado: Características atuais do objeto

Instanciar - é quando tem uma classe e transforma em objeto.

Classe: Define os atributos e métodos comuns que serão compartilhados por um objeto.

- Visibilidade: Indica o nível de acesso aos componentes internos de uma classe.
    +  representa o modo público, - representa o modo privado, # representa o modo protegido.


-Métodos Especiais
    - Métodos Acessores - Getters ex: e.getSetTotDoc
    - Métodos Modificadores - Setters ex: e.setTotDoc(doc) obs: geralmente precisa de um parametro pra funcionar
    - Método Construtor - Construct

- Pilares do POO
    -Encapsulamento: 
        Encapsular - Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior
        Interface - Lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com um objeto dessa classe
        OBS: Encapsular não é obrigatório, mas é uma boa prática para produzir Classes mais eficientes
        * Vantagens em Encapsular:
            - Tornar mudanças invisíveis
            - Facilitar reutilização do código
            - Reduzir efeitos colaterais


    -Herança
    -Polimorfismo