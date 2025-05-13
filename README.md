# Desafio POO - iPhone

## Descrição do Projeto
Este projeto tem como objetivo modelar as funcionalidades de um iPhone, representadas por meio de classes e interfaces, utilizando o paradigma de Programação Orientada a Objetos (POO). As funcionalidades modeladas incluem o uso de um **Reprodutor Musical**, um **Aparelho Telefônico** e um **Navegador de Internet**.

## Funcionalidades Implementadas
Reprodutor Musical: Permite tocar, pausar e selecionar músicas.

Aparelho Telefônico: Permite fazer chamadas, atender chamadas e iniciar o correio de voz.

Navegador de Internet: Permite exibir páginas, adicionar novas abas e atualizar páginas.

## Diagrama UML

Aqui está o diagrama UML que representa as classes e interfaces do projeto:
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    
    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    
    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    iPhone ..|> ReprodutorMusical : implements
    iPhone ..|> AparelhoTelefonico : implements
    iPhone ..|> NavegadorInternet : implements

