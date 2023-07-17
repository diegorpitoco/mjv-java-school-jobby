# O Projeto Final Do Bootcamp realizado Pela [MJVSchool](https://academy.mjvinnovation.com/br/mjvschool/ "Site da MJV").

E como mentor do nosso Projeto tivemos o Professor [Gleydson](https://www.linkedin.com/in/glysns/ "Linkdin").

# HRRegister Soluções Tecnológicas </br> 

Somos uma empresa de tecnologia voltada a soluções para o processo de Recutamento e Seleção de Profissionais de TI. Segue os componestes do nosso time Incrível de desenvolvedores.</br> 
[Alane Kerolaine](https://www.linkedin.com/in/alane-kerolaine-g-l-carvalho/ "Linkedin") </br>
[Diego Pitoco](https://www.linkedin.com/in/diego-reis-pitoco-9a971380/ "Linkedin") </br>
[Emerson Luiz](https://www.linkedin.com/in/emerson-luiz-e8t18/ "Linkedin") </br>
[Estefania Carrer](https://www.linkedin.com/in/estefania-carrer-49659110a/ "Linkedin") </br>
[Ismael Miranda](https://www.linkedin.com/in/mirandaismael/ "Linkedin") </br>

# Modernização
Nos ultimos anos o processo de recrutamento e seleção aplicados pela empresa People Job conseguiu chegar a um nível de eficiência reconhecido no mercado, e algumas ações de modernização começavam a se tornar essencias para manter o nível dos resultados apresentados.

Foi ai que os gestores da empresa decidiriam investir em modernização da sua plataforma Jobby e claro, a HR foi convidada para conduzir este projeto.

<img src="https://sintaxe.netlify.app/assets/refactoring.bd0b51f1.jpg" width="500" />


# Jobby - Ao seu dispor #

Este projeto consiste uma plataforma destinada ao armazenamento de dados pessoais e profissionais para em seguida proporcionar uma listagem de profissionais, suas experiências e habilidades destinadas para auxilar no processo de recrutamento e seleção da empresa People Job.

 <img src="https://sintaxe.netlify.app/assets/aproposta-2.78be4362.jpg" width="500" />


# Lógica

Este projeto contempla a elaboração de um programa simples onde é possível que o candidato preencha seus dados pessoais, endereço, contato e experiência profissional mencionando uma faixa salarial pretendida. Abaixo seguem as informações que serão preenchidas pelo candidato:

🔵Dados Pessoais: Nome, CPF, Data Nascimento, Sexo</br>
🔵Dados Endereço: Logradouro, Número, Complemento, Bairro, Cidade, Estado</br>
🔵Dados Contato: E-mail, Telefone, Celular, Se celular for WhatsApp</br>
🔵Dados Profissionais: Profissão, Empresa, Salário, Emprego Atual</br>
🔵Habilidades: Uma lista de habilidades</br>
🔵Pretenção Salarial: Valor Mínimo, Valor Máximo</br> 

 <img src="https://sintaxe.netlify.app/assets/cadastro-v1.b270b4df.png" width="500" />




# Especificações
Dos requisitos apresentados à nossa fábrica, a mais relevante foi a necessidade de normalizar o nosso modelo de dados que antes continha uma estrutura de registros com informações redundantes e com crescimento exponencial da sua necessidade de armazenamento dos dados.

<img src="https://github.com/emerge8/assets/blob/main/hrregister.png?raw=true" width="500" />

<b>1.</b> Remodelar toda a estrutura de banco de forma que atenda o diagrama apresentado acima</br>
<b>2.</b> Realizar cadastros prévios para a inserção dos candidatos como: Profissões, Cidades e Empresas</br>
<b>3.</b> Garantir que os cadastros sejam inseridos no banco de dados considerando a nova estrutura</br>
<b>4.</b> Contar quantos candidatos possuem a habilidade JAVA</br>
<b>5.</b> Identificar quais candidatos NÃO possuem habilidade relacionadas</br>
<b>6.</b> Selecionar os candidatos que são do sexo FEMININO e que moram nas cidades do estado sigla SP informando o nome, cpf, dados de endereço e nome da cidade</br>
<b>7.</b> Agrupar por profissão e contar quantos profissionais que moram na cidade de nome SÃO PAULO</br>
<b>8.</b> Selecionar candidatos que registram experiências com data de contratação entre 01/01/202 a 31/12/2023</br>
<b>9.</b> Selecionar candidatos que trabalharam na empresa MICROSOFT</br>
<b>10.</b> Selecionar candidatos que AINDA trabalham na empresa MICROSOFT</br>
<b>11.</b> Selecionar candidatos que estão trabalhando atualmente</br>
<b>12.</b> Criar uma consulta que retorne todos os candidatos e nome da sua profissão correspondentemente</br>
<b>13.</b> Criar uma consulta que retorne todos os candidatos e nome da sua profissão onde o id da profissão corresponda ao registro ANALISTA DE SISTEMAS</br>
<b>14.</b> Criar uma consulta que conte a quantidade de profissionais por profissão</br>
<b>15.</b> Criar uma consulta que retorne os candidatos ordenados por profissão e salário máximo de forma decrescente</br>

# Integração
Depois do BOOOM da World Wide Web, um dos maiores eventos de evolução na área de tecnologia e desenvolvimento de softwares foi o surgimento de uma arquitetura HTTP para a integração entre aplicações transferindo conteúdos JSON e XML conhecida atualmente como API ou Web Services.

<img src="https://sintaxe.netlify.app/assets/api.1fcb1c5c.jpg" width="500" />

Com esta nova arquitetura a People Job em parceria com HR decidiram juntar forças para o desenvolvimento de uma plataforma centralizada de dados capaz de provê mecanimos de integração para a recepção e fornecimento de dados dos candidatos registrados em sua plataforma.

Dentre as novas funcionalidades que serão disponibilizadas pela plataforma, destacamos as mencionadas abaixo:

<b>1.</b> Cadastro do candidato de forma online e em tempo real</br>
<b>2.</b> Consulta dos candidatos existentes na base de dados</br>
<b>3.</b> Consulta dos candidatos considerando critérios de busca</br>
<b>4.</b> Consulta de informações estratégicas dos candidatos</br>

# Swagger

Swagger é um framework para descrição, consumo e visualização de serviços RESTful. E seu grande objetivo é permitir que a documentação possa evoluir no mesmo ritmo da implementação, já que pode ser gerada automaticamente com base em anotações do código, gigantes da tecnologia como a Yelp e a Netflix já usam o Swagger nos seus produtos e projetos.


Abaixo segue um pequeno vídeo da nossa api sendo utilizada no Swagger.

![Web 1](https://github.com/emerge8/assets/blob/main/testeSwagger.gif)

# Tecnologias Utilizadas
 
- Java Development Kit (JDK) 19
- Spring Boot 2.7.13
- MySql
- Postman
- Swagger V3








