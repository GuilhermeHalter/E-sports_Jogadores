# Jogadores de E-Sports 
### Diagrama de Classe 

<img src="Jogadores de e-sports (1).png" alt="img" width="1000" height="600">


### MySQL Codes

- inicializar o BDR mariaDB (antigo MySQL)
```bash
mysql -u root
```

- verificar se o mariaDB está funcionando
```bash
show databases;
```

- criar um banco de dados com o nome que desejar
```bash
create database eplayersportdb;
```

-  usar o banco criado
```bash
use eplayersportdb;
```


-  criar tabela

criar tabela `jogadoresVeteranos`
```bash
create table jogadoresVeteranos (id int not null, 
nome varchar(150) not null,
ano_treino int not null,
salario float not null,
primary key(id));
```

criar tabela `jogadoresTrainees`
```bash
create table jogadoresTrainees (id int not null, 
nome varchar(150) not null,
ano_treino int not null,
salario float not null,
primary key(id));  
```

-  Verificar a estrutura da tabela criada
```bash
desc jogadoresVeteranos;
```
```bash
desc jogadoresTrainees;
```

