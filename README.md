## CaixaBrancaLogin
## Teste para análisar o erros presentes no código!
1 - Driver: Erro na Classe do Driver:
Na linha onde você tenta carregar o driver do MySQL, você deve usar: "com.mysql.cj.jdbc.Driver".

2 - Uso inadequado de Exception Handling:
Capturar exceções com um bloco vazio catch não é uma boa prática.

3 - SQL Injection Vulnerability:
O código une diretamente os valores login e senha na consulta SQL. Isso pode tornar seu aplicativo vulnerável a ataques de injeção SQL.

4 - Fechamento de Recursos:
Não está fechando a conexão, a declaração (Statement) e o resultado (ResultSet) após usá-los.

5 - Tratamento de Senhas:
Armazenar senhas diretamente no código não é seguro. Geralmente, as senhas devem ser armazenadas de forma segura em um banco de dados.


## Perguntas:
## A DOCUMENTAÇÃO FOI DESCRITA NO CÓDIGO?
Não há documentação explícita no código. É uma boa prática incluir comentários para documentar a funcionalidade das classes, métodos e variáveis.

## AS VARIÁVEIS E CONSTANTES POSSUEM BOA NOMENCLATURA?
A nomenclatura de variáveis e constantes não segue as convenções de nomenclatura Java recomendadas. Nomes de classes e métodos devem começar com letras maiúsculas.

## EXISTEM LEGIBILIDADE E ORGANIZAÇÃO NO CÓDIGO?
O código está desorganizado, e há falta de indentação. É importante manter um estilo de código consistente para facilitar a leitura e a manutenção. 

## TODOS OS NULLPOINTERS FORAM TRATADOS?
O código não lida diretamente com NullPointerException.

## A ARQUITETURA UTILIZADA FOI DEVIDAMENTE RESPEITADA?
Ele não demonstra uma boa arquitetura.

## AS CONEXÕES UTILIZADAS FORAM FECHADAS?
O código não fecha as conexões com o banco de dados (Connection), declarações (Statement) ou resultados (ResultSet). 

## 28/09/2023
