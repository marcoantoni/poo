
# Herança em Programação Orientada a Objetos

## Objetivo

Neste material, o objetivo é compreender o conceito de **herança** por meio de um exemplo prático envolvendo as classes:

- `Produto`
- `Calcado`
- `Vestuario`

A explicação principal está disponível no vídeo abaixo:

**Vídeo:** https://youtu.be/qVEX2b_0oUU

> O vídeo foi produzido utilizando um código desenvolvido em anos anteriores da disciplina e está sendo disponibilizado como material complementar para estudo.

---

## Relação entre as Classes

No exemplo apresentado, a classe `Produto` representa a classe mais genérica.

As classes `Calcado` e `Vestuario` são especializações de `Produto`, ou seja, herdam suas características e comportamentos.

Representação simplificada:

```text
Produto
│
├── Calcado
│
└── Vestuario
```

Isso significa que tanto `Calcado` quanto `Vestuario` possuem todas as características de um produto, além de poderem possuir atributos e métodos próprios.

---

## Material para Estudo

Na pasta disponibilizada junto a este material encontra-se o arquivo:

```text
Produto.java
```

Utilize essa classe como base para acompanhar o vídeo e reconstruir o exemplo apresentado.

Durante o estudo, observe:

- O que é uma superclasse (`Produto`);
- O que são subclasses (`Calcado` e `Vestuario`);
- Quais atributos podem ser herdados;
- Como a herança evita a duplicação de código;
- Como as subclasses podem possuir características específicas.

---

## Observação

Este material foi elaborado com apoio de Inteligência Artificial (IA) e tem como objetivo auxiliar os estudos sobre herança em Java.

### Referências

- Oracle Java Documentation: https://docs.oracle.com/javase/
- Vídeo complementar: https://youtu.be/qVEX2b_0oUU