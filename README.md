# Prova Prática: Missão Refatoração (Clean Code & OO)

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos — FIAP.

## Contexto

O projeto simula o módulo de frota do **FiapRide**. O código original, feito por um estagiário, funcionava mas violava princípios básicos de Clean Code e encapsulamento: atributos públicos, nomes sem sentido e nenhuma validação de dados (permitia gasolina negativa e consumo maior que o disponível no tanque).

Este repositório contém a versão refatorada da classe `Veiculo`, aplicando encapsulamento real e validações de regra de negócio.

## Estrutura do projeto

```
prova-refatoracao-GabrielLima/
├── diagrama-veiculo-refatorado.png   # Diagrama de classes (Astah)
├── src/
│   └── br/com/fiapride/
│       ├── model/
│       │   └── Veiculo.java          # Classe refatorada
│       └── main/
│           └── SistemaPrincipal.java # Classe de teste
└── README.md
```

## Principais mudanças da refatoração

| Antes | Depois |
|---|---|
| Atributos `public` | Atributos `private`, acesso via getters |
| Nomes sem sentido (`individuo`, `pl`, `gas`, `v`) | Nomes claros (`proprietario`, `placa`, `gasolina`, `litros`) |
| `gas` podia ficar negativo | `gastarGasolina` valida que não se pode gastar mais do que o disponível |
| Objeto criado "vazio" e populado depois | Construtor exige `proprietario` e `placa`, garantindo estado sempre válido |
| Classe `veiculos` (nome errado, minúsculo) | Classe `Veiculo` (PascalCase, singular) |

## Como executar

1. Importe o projeto no Eclipse (ou abra a pasta `src/` em qualquer IDE Java).
2. Execute a classe `br.com.fiapride.main.SistemaPrincipal`.
3. A saída no console mostra o veículo cadastrado e uma tentativa de consumo de gasolina bloqueada por validação.

## Diagrama de classes

O diagrama UML da classe `Veiculo`, com os atributos privados e as operações públicas, está disponível em [`diagrama-veiculo-refatorado.png`](./diagrama-veiculo-refatorado.png), na raiz deste repositório.

## Autor

Gabriel Lima — Disciplina de Programação Orientada a Objetos, FIAP.
