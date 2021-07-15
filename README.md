# LimaStore - Sua loja favorita


Desenvolvi um **Ecommerce Web usando Spring MVC** com vários módulos, para estudar Orientação a Objetos com JAVA. 

### Funcionalidades:

1. Registro e Manipulação de Usuários.

2. **Operações CRUD**, por exemplo:

* O usuário pode adicionar o produto ao carrinho e ao resumo da compra.
* O administrador pode adicionar produtos à lista de produtos.
* O administrador pode editar os detalhes do produto.
* O administrador pode excluir o produto da lista 

3. **Spring Security**

* O usuário pode fazer o login no site.
* Todo o site mudará de acordo com a função, dependendo se o cliente é Usuário ou Admin.
* O usuário pode fazer logout após a conclusão. 

### Ferramentas e Tecnologias:

* **Tecnologias** : Bootstrap, Java, Spring MVC, Hibernate, JSP, Maven.
* **Servidor da Aplicação**: Apache Tomcat Server.
* **Banco de Dados** : H2 Database 

### Instalação:

1. IDE - IntelliJ Idea
   * [Download IntelliJ Idea](https://www.jetbrains.com/idea/download/#section=windows).
   
2. Servidor - Apache Tomcat Server

   * [Download Apache Server](https://tomcat.apache.org/download-70.cgi).

3. Build - Maven

   * [Download Maven](https://maven.apache.org/download.cgi).

4. Banco de Dados - H2 Database

   * [Download H2 Database](http://www.h2database.com/html/download.html).

7. Clone o Repositório e importe no IntelliJ.

8. Rode seu Banco de Dados H2.

9. Configure seu banco de dados em **application-context.xml**.

   * Configurações:


        <!-- database properties DataSource -->

            <bean id="dataSource"
              class="org.springframework.jdbc.datasource.DriverManagerDataSource">
              <property name="driverClassName" value=SEU BD DRIVER CLASS NAME" />
              <property name="url" value="SUA DB URL" />
              <property name="username" value="SUA DB USERNAME" />
              <property name="password" value="SUA DB PASSWORD" />
            </bean>
            
10. Rode o servidor.
