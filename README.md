<h1>Documentação do Projeto OrangeHRM</h1>
<h2>1. Introdução</h2>
Este projeto de automação tem como objetivo validar as funcionalidade do site OrangeHRM utilizando Selenium WebDriver para interação com o navegador e Java como linguagem de programação.

<h2>2. Estrutura do Projeto</h2>
A estrutura do projeto segue uma arquitetura baseada em Page para mapear a aplicação, DSL para criação de métodos e Application para rodar os teste conforme descrito abaixo:
<h3> </h3>

![Estrutura do projeto](https://github.com/user-attachments/assets/1851bbac-2b88-4709-8a03-e6e452670ae8)

<h2>3. Casos de Teste</h2>

<br>CT01 - Realizar o Login e validar mensagem de campo requerido para User;</br>
<br>CT02 - Realizar o Login e validar mensagem de campo requerido para Pass;</br>
<br>CT03 - Realizar o Login e validar mensagem de Credencias Inválidas;</br>
<br>CT04 - Realizar o Cadastro de 3 "Employee" (Fulano Bigos One, Ciclano Bigos Two, Beltrano Bigos Three)</br>
<br>CT05 - Realizar a pesquisa dos nomes cadastrados</br>
<br>CT06 - Deletar o Employee Fulano e validar se é apresentado a mensagem de exclusão</br>
<br>CT07 - Deletar o Employee Beltrano e validar se é apresentado a mensagem de exclusão</br>
<br>CT08 - Acessar o campo employe list e editar o cadastro do Ciclano, informando os campos Genero, Other Id e Driver's License Number (Os campos solicitado no email, SSN Number e Nickaname não foram encontrados na aplicação)</br>
<br>CT09 - Efetuar logout</br>
<br></br>
<br>Observação: As evidências e Relatórios dos Testes estão em uma pasta zipada dentro do projeto</br>
