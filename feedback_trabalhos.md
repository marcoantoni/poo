# Feedback dos Trabalhos

> Os feedbacks abaixo estão identificados apenas pela matrícula do aluno.

## Matrícula 2024004896

**Nota:** 0


**Comentários:**

Não entregou

---

## Matrícula 2024004789

**Nota:** 4


**Comentários:**

A classe cumpriu os requisitos do enunciado e para os casos de teste, as saídas foram dentro do esperado. Um ponto interessante foi a criação do método  formatarMoeda(double valor)


---

## Matrícula 2024009678

**Nota:** 2.5


**Comentários:**

O trabalho utiliza corretamente o conceito de composição e implementa os métodos necessários para atender aos requisitos da atividade. Entretanto, não foi disponibilizado um código de teste, o que dificultou a validação da implementação, sendo necessário elaborar casos de teste para realizar a avaliação.  Durante os testes, foram identificadas diferenças significativas entre os valores calculados e os esperados. Para um salário de R$ 1.621,00, o desconto de INSS foi de R$ 123,12, enquanto o correto seria R$ 121,57.  Para um salário de R$ 4.000,00, o desconto de INSS foi de R$ 373,41 (o correto seria R$ 369,60) e o IRPF foi de R$ 162,55, quando o funcionário deveria estar isento desse imposto.  No cenário de um salário de R$ 6.000,00 sem dependentes, foram calculados R$ 649,60 de INSS e R$ 575,36 de IRPF, enquanto os valores esperados eram R$ 641,51 de INSS e R$ 385,10 de IRPF.  Para o mesmo salário com um dependente, o INSS permaneceu em R$ 649,60 e o IRPF foi de R$ 523,22, quando os valores corretos seriam R$ 641,51 e R$ 332,97, respectivamente.  Por fim, para um salário de R$ 10.000,00, o desconto de INSS foi de R$ 951,63 (o correto seria R$ 908,09, correspondente ao teto do INSS) e o IRPF foi de R$ 1.592,30, enquanto o valor esperado era de R$ 1.569,55.  Embora a estrutura do trabalho esteja adequada e os conceitos de orientação a objetos tenham sido aplicados corretamente, recomenda-se revisar a implementação das regras de negócio responsáveis pelos cálculos do INSS e do IRPF, pois as diferenças encontradas não se limitam a pequenos erros de arredondamento, mas indicam inconsistências na lógica utilizada.


---

## Matrícula 2025002715

**Nota:** 4


**Comentários:**

A classe cumpriu os requisitos do enunciado e para os casos de teste, as saídas foram dentro do esperado.


---

## Matrícula 2025003795

**Nota:** 3


**Comentários:**

O código funciona de maneira correta, mas há algumas restrições que não foram completamente atendidas. Por exemplo: Ao criar um funcionário com salário de 4 mil reais e 3 depedentes, foi gerado um desconto de R$ 65,27 de IRPF, que não está correto, pois com essa faixa salárial, deveria estar isento. Com salário de 6 mil reais, está sendo realizado um desconto de R$ 564,85, sendo que o correto seria 385,11


---

## Matrícula 2025003839

**Nota:** 3.9


**Comentários:**

O código está bem estruturado, utilizando corretamente a composição e os métodos necessários para atender aos requisitos da atividade. No entanto, durante os testes foram encontradas pequenas diferenças nos resultados. Por exemplo, ao criar um funcionário com salário de R$ 4.000,00, o desconto de INSS foi calculado em R$ 368,60, enquanto o valor esperado era de R$ 369,60. Recomenda-se revisar a lógica do cálculo para garantir que os valores estejam de acordo com o esperado.


---

## Matrícula 2025003857

**Nota:** 3.8


**Comentários:**

O trabalho está muito bem estruturado e apresenta soluções que vão além do que foi solicitado na atividade. Destaca-se a criação da classe abstrata **Imposto**, utilizada como base para as classes **ImpostoRenda** e **Inss**. Embora exista apenas um método abstrato, essa escolha demonstra que o conceito de abstração foi compreendido. Outro ponto positivo foi a criação da classe **Filho**, derivada da classe **Pessoa** desenvolvida em aula. Apenas vale observar que, na prática, nem todo dependente é um filho, podendo também ser cônjuge, pais, entre outros.  Durante os testes, foram encontradas divergências nos cálculos do imposto de renda. Por exemplo, para um funcionário com salário de R$ 6.000,00 e um dependente, o desconto calculado foi de R$ 432,88, enquanto o valor esperado era de R$ 332,97. Já para o mesmo salário sem dependentes, o desconto foi de R$ 491,93, sendo que o correto seria R$ 641,51. Para um salário de R$ 10.000,00, os valores calculados estão corretos.  De modo geral, o trabalho demonstra um bom domínio dos conceitos de orientação a objetos e uma implementação além do esperado, restando apenas revisar a lógica do cálculo do imposto de renda para alguns cenários.


---

## Matrícula 2025003866

**Nota:** 3.5


**Comentários:**

O trabalho atende aos requisitos solicitados e apresenta uma boa organização do código. Um ponto positivo é o uso de constantes para representar valores como o **TETO_INSS** e a **DEDUCAO_DEPENDENTE**, tornando a implementação mais clara e facilitando futuras atualizações.  Durante os testes, foram encontradas algumas inconsistências nos cálculos. Por exemplo, para um salário de R$ 10.000,00, o desconto de INSS foi de R$ 988,09, enquanto o valor correto seria R$ 908,09, correspondente ao teto da contribuição. Já para um salário de R$ 6.000,00, o desconto de INSS foi calculado corretamente (R$ 641,51), porém o desconto de IRPF foi de R$ 491,93, quando o valor esperado era de R$ 641,51. Recomenda-se revisar a lógica dos cálculos para garantir que os valores estejam corretos em todos os cenários.


---

## Matrícula 2025003893

**Nota:** 3.9


**Comentários:**

O trabalho atende aos requisitos solicitados, utilizando corretamente a composição e implementando os métodos necessários para a atividade. No entanto, durante os testes foi encontrada uma inconsistência nos cálculos. Por exemplo, para um funcionário com salário de R$ 4.000,00, o desconto de INSS foi calculado em R$ 368,60, enquanto o valor esperado era de R$ 369,60. Recomenda-se revisar a lógica do cálculo para garantir que os resultados estejam corretos em todos os casos.


---

## Matrícula 2025003946

**Nota:** 1.5


**Comentários:**

O trabalho cumpre o requisito de utilizar composição, por meio de um atributo do tipo Funcionario, conforme solicitado na atividade. No entanto, a implementação dos cálculos apresenta divergências significativas em relação aos valores esperados.Durante os testes, para um funcionário com salário de R$ 4.000,00, foram calculados descontos de INSS de R$ 383,88 e IRPF de R$ 148,26, enquanto o correto seria INSS de R$ 369,60 e isenção de IRPF.Para um salário de R$ 6.000,00 sem dependentes, os descontos obtidos foram INSS de R$ 383,88 e IRPF de R$ 148,26, quando os valores esperados eram R$ 641,51 de INSS e R$ 385,11 de IRPF.Já para um salário de R$ 6.000,00 com um dependente, o programa calculou INSS de R$ 656,79 e IRPF de R$ 459,08, enquanto os valores corretos seriam R$ 641,51 de INSS e R$ 332,97 de IRPF.É importante destacar que a principal proposta da atividade não era apenas utilizar composição, mas principalmente implementar corretamente as regras de negócio, ou seja, aplicar as regras de cálculo do INSS e do IRPF de acordo com as faixas salariais e a quantidade de dependentes. Dessa forma, recomenda-se revisar a lógica dos cálculos para que os resultados estejam de acordo com os valores esperados.


---

## Matrícula 2025003973

**Nota:** 2.5


**Comentários:**

O trabalho atende aos requisitos propostos e apresenta uma implementação organizada. Um ponto positivo é a utilização de uma estrutura para representar os cargos dos funcionários. No entanto, permaneceram no código comentários de exemplos anteriores, como: *"Descrições dos (1 = ADS, 2 = TPG, 3 = outros), apesar de no exemplo serem empregos, eu defini como curso nesse caso"*. É importante revisar e remover esse tipo de comentário, pois ele não condiz com o contexto da atividade e pode causar confusão na leitura do código.  Durante os testes foram identificadas algumas inconsistências nos cálculos dos descontos.  Para um funcionário com salário de R$ 4.000,00, o desconto de INSS foi calculado em R$ 368,60, enquanto o valor esperado era de R$ 369,60.  Já para um salário de R$ 6.000,00 sem dependentes, o desconto de INSS foi calculado corretamente (R$ 641,51), porém o IRPF foi de R$ 491,93, quando o valor esperado era de R$ 385,11.  No caso de um salário de R$ 6.000,00 com um dependente, o desconto de INSS permaneceu correto (R$ 641,51), mas o IRPF continuou sendo de R$ 491,93. Isso indica que a quantidade de dependentes não está sendo considerada no cálculo do imposto de renda.  Para um salário de R$ 10.000,00 sem dependentes, os valores calculados estão corretos.  Recomenda-se revisar a lógica do cálculo do IRPF, especialmente a aplicação da dedução por dependentes, garantindo que as regras de negócio sejam atendidas em todos os cenários testados, além de revisar os comentários do código para que estejam de acordo com o contexto da implementação.


---

## Matrícula 2025003982

**Nota:** 0


**Comentários:**

Não foi possível avaliar o trabalho, pois foi enviado apenas o arquivo **FolhaPagamento.java**. Para tentar realizar a correção, utilizei a classe **Funcionario** desenvolvida em aula, porém o código não compilou devido à ausência de métodos esperados, como `getSalario()`, `getNome()`, `getCPF()` e `getCargo()`.  Dessa forma, o programa não pôde ser executado nem testado, impossibilitando a verificação dos requisitos da atividade e dos cálculos implementados. Em razão disso, não foi possível atribuir pontuação ao trabalho.  Para evitar esse tipo de problema em futuras atividades, é importante enviar todos os arquivos necessários para a compilação e execução do projeto, além de verificar previamente se o código compila e funciona corretamente antes da submissão.


---

## Matrícula 2025004021

**Nota:** 1


**Comentários:**

O programa atende parcialmente aos requisitos propostos (a classe Funcionario não foi encapsulada). a organização do projeto dificulta bastante a compreensão e a manutenção do código.  Inicialmente, foram enviados arquivos contendo as classes **Metodos** e **Objetos**. Esses nomes não são nada sugestivos e não permitem identificar a responsabilidade de cada classe apenas olhando a estrutura do projeto. Foi necessário abrir os arquivos para entender sua finalidade. Além disso, a classe `Objetos` possui um construtor vazio que não realiza nenhuma inicialização. Nesse caso, seria mais adequado utilizar o construtor padrão fornecido automaticamente pelo Java, evitando código desnecessário.  Outro problema é que a classe `Metodos` não compilou inicialmente porque o arquivo foi salvo como **"Métodos.java"**. Em programação não se utiliza acentuação em nomes de arquivos, classes, métodos ou variáveis, pois isso pode causar problemas de compilação e portabilidade.  A estrutura do código também está bastante confusa. Por exemplo, o trecho abaixo não apresenta uma lógica clara:  ```java Funcionario func1 = new Funcionario("Carlos Augusto", "123.456.653-65", 4000.00f, "Desenvolvedor front end", 0); Objetos funcionario = new Objetos(); Metodos metodos = new Metodos(); ```  Ao criar o objeto `Funcionario`, o salário é informado no construtor. Entretanto, esse valor não é utilizado diretamente nos cálculos. Em vez disso, posteriormente é necessário executar:  ```java funcionario.setSalario(func1.salario); ```  Isso demonstra que os dados do funcionário estão sendo duplicados em outro objeto, tornando o fluxo da informação confuso e aumentando a chance de erros. Não há um motivo claro para essa duplicação.  De forma geral, falta coesão entre as classes. A classe `FolhaDePagamento`, que deveria concentrar a lógica principal da aplicação e coordenar as regras de negócio, praticamente apenas executa testes, enquanto a lógica fica espalhada entre as classes `Objetos` e `Metodos`. Essa distribuição torna o projeto mais difícil de entender e de manter.  Durante os testes também foram encontrados erros nos cálculos do IRPF:  * Salário de **R$ 6.000,00** e **0 dependentes**: o programa retornou **R$ 564,86**, enquanto o valor esperado era **R$ 385,10**. * Salário de **R$ 6.000,00** e **1 dependente**: o programa retornou **R$ 512,72**, enquanto o valor esperado era **R$ 332,97**.  Essas diferenças indicam que a implementação do cálculo do imposto precisa ser revisada.  Por fim, um comentário importante: percebo que você frequentemente utiliza IA como apoio para desenvolver os exercícios. Essa pode ser uma ferramenta útil, mas é fundamental compreender o código gerado antes de utilizá-lo. Neste trabalho, a orientação a objetos acabou sendo utilizada de forma que aumentou a complexidade da solução. Em vez de simplificar o desenvolvimento, foram criadas várias classes sem uma responsabilidade bem definida, o que tornou o código mais difícil de entender, testar e manter. O principal objetivo da orientação a objetos é justamente o contrário: organizar o código, distribuir responsabilidades de forma clara e facilitar sua evolução. Em muitos casos, uma solução com menos classes, porém bem estruturadas e com responsabilidades bem definidas, resulta em um projeto muito mais claro e de melhor qualidade.


---

## Matrícula 2025004077

**Nota:** 3.4


**Comentários:**

O trabalho atende aos requisitos da atividade, utilizando corretamente a composição e implementando os métodos necessários. De modo geral, a estrutura da solução está adequada.  Durante os testes, porém, foram identificadas algumas inconsistências nos cálculos. Para um funcionário com salário de R$ 4.000,00, o desconto de INSS foi de R$ 368,60, enquanto o valor esperado era de R$ 369,60.  No cenário de um salário de R$ 6.000,00 sem dependentes, o desconto de INSS foi calculado corretamente (R$ 641,51), porém o IRPF foi de R$ 299,69, quando o valor esperado era de R$ 385,10.  Já para um salário de R$ 6.000,00 com um dependente, o desconto de IRPF foi de R$ 222,31, enquanto o valor esperado era de R$ 332,97.  Recomenda-se revisar a lógica do cálculo do IRPF e realizar novos testes com diferentes combinações de salário e número de dependentes, garantindo que as regras de negócio sejam aplicadas corretamente em todos os cenários.


---

## Matrícula 2025004095

**Nota:** 3.6


**Comentários:**

O trabalho atende aos requisitos da atividade, apresentando uma implementação organizada e utilizando corretamente a composição e os métodos necessários.  Durante os testes, entretanto, foram identificadas algumas inconsistências nos cálculos. Para um funcionário com salário de R$ 4.000,00, o desconto de INSS foi de R$ 368,60, enquanto o valor esperado era de R$ 369,60.  No cenário de um salário de R$ 6.000,00 sem dependentes, o desconto de INSS foi calculado corretamente (R$ 641,51), porém o IRPF foi de R$ 491,93, quando o valor esperado era de R$ 385,10.  Já para um salário de R$ 6.000,00 com um dependente, o desconto de IRPF foi de R$ 432,88, enquanto o valor esperado era de R$ 332,97.  Recomenda-se revisar a lógica do cálculo do IRPF, especialmente a definição da base de cálculo e a aplicação da dedução por dependentes, garantindo que os resultados estejam de acordo com as regras de negócio em todos os cenários testados.


---

## Matrícula 2025005790

**Nota:** 3


**Comentários:**

O trabalho atende aos requisitos da atividade e apresenta uma implementação organizada. Um ponto positivo é a utilização de constantes para representar as faixas salariais, alíquotas e demais valores utilizados nos cálculos, tornando o código mais legível e facilitando futuras alterações.  Durante os testes, entretanto, foram identificadas algumas inconsistências nos resultados. Para um funcionário com salário de R$ 4.000,00, foi calculado um desconto de IRPF de R$ 150,55, quando o correto seria isenção nessa faixa salarial.  Para um salário de R$ 6.000,00 sem dependentes, o desconto de INSS foi calculado corretamente (R$ 641,51), porém o IRPF foi de R$ 564,85, enquanto o valor esperado era de R$ 385,11.  Já para um salário de R$ 6.000,00 com um dependente, o desconto de INSS permaneceu correto (R$ 641,51), mas o IRPF foi de R$ 512,72, quando o valor esperado era de R$ 332,97. Embora tenha ocorrido uma redução no imposto, indicando que os dependentes estão sendo considerados, o cálculo ainda não está de acordo com as regras de negócio propostas.  Recomenda-se revisar a lógica utilizada para o cálculo do IRPF, verificando principalmente a base de cálculo e a aplicação das deduções por dependentes, a fim de garantir que os valores obtidos estejam corretos em todas as situações.


---

## Matrícula 2025015179

**Nota:** 3.4


**Comentários:**

O trabalho atende aos requisitos da atividade e apresenta uma implementação organizada. Um ponto positivo é a utilização de constantes no código, o que torna a implementação mais clara e facilita futuras alterações. Entretanto, recomenda-se seguir o padrão de nomenclatura da linguagem Java para constantes, utilizando nomes em letras maiúsculas, como `TETO_INSS` e `DEDUCAO_DEPENDENTE`.  No código desenvolvido, ficaria mais adequado comentários, uma vez que há trechos que ficam dificeis de ententer. Durante os testes, foram identificadas algumas inconsistências nos cálculos dos descontos.  Para um funcionário com salário de R$ 6.000,00 sem dependentes, o desconto de INSS foi calculado corretamente (R$ 641,51), porém o IRPF foi de R$ 491,93, quando o valor esperado era de R$ 385,10.  Já para um salário de R$ 4.000,00, o desconto de INSS foi de R$ 368,60, enquanto o valor esperado era de R$ 369,60. O IRPF, nesse caso, foi corretamente calculado como isento.  No cenário de um funcionário com salário de R$ 6.000,00 e um dependente, o desconto de INSS permaneceu correto (R$ 641,51), porém o IRPF foi de R$ 439,82, quando o valor esperado era de R$ 332,97. Isso indica que a dedução por dependentes não está sendo aplicada corretamente no cálculo.  Para um salário de R$ 11.000,00, os valores calculados estão corretos.  Uma possível explicação para parte dessas inconsistências está na forma como o salário líquido é calculado:  `double liquido = salario - calcularINSS(salario) - calcularIRPF(salario, dependentes);`  Observe que o método `calcularIRPF` está recebendo o salário bruto como base de cálculo. No entanto, conforme as regras da atividade, o IRPF deve ser calculado sobre o salário **após o desconto do INSS**, aplicando também a dedução por dependentes. Recomenda-se revisar essa lógica para que os cálculos estejam de acordo com as regras de negócio propostas.


---