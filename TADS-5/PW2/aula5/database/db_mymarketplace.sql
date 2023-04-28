CREATE TABLE tb_users (
  id int(11) NOT NULL AUTO_INCREMENT,
  email varchar(255) NOT NULL,
  passw varchar(255) DEFAULT NULL,

  PRIMARY KEY(id)
);

CREATE TABLE tb_lojas (
  id int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  descricao varchar(255) DEFAULT NULL,
  img longblob DEFAULT NULL,
  id_user int(11) DEFAULT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY(id_user) REFERENCES tb_users(id)
);

CREATE TABLE tb_produtos (
  id int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  descricao varchar(255) DEFAULT NULL,
  preco float NOT NULL,
  id_loja int(11) NOT NULL,
  img longblob DEFAULT NULL,

  PRIMARY KEY (id),
  FOREIGN KEY(id_loja) REFERENCES tb_lojas(id)
);

INSERT INTO tb_users(email, passw) 
VALUES 
("bugatti@123", "123"),
("ferrari@123", "123"),
("honda@123", "123"),
("koenigsegg@123", "123"),
("lamborghini@123", "123"),
("mazda@123", "123"),
("mclaren@123", "123"),
("mercedes@123", "123"),
("mitsubishi@123", "123"),
("nissan@123", "123"),
("porsche@123", "123"),
("subaru@123", "123"),
("toyota@123", "123");

INSERT INTO tb_lojas(nome, descricao, id_user)
VALUES
("Bugatti", "Fabricante de carros", 1),
("Ferrari", "Fabricante de carros", 2),
("Honda", "Fabricante de carros", 3),
("Koenigsegg", "Fabricante de carros", 4),
("Lamborghini", "Fabricante de carros", 5),
("Mazda", "Fabricante de carros", 6),
("Mclaren", "Fabricante de carros", 7),
("Mercedes-Benz", "Fabricante de carros", 8),
("Mitsubishi", "Fabricante de carros", 9),
("Nissan", "Fabricante de carros", 10),
("Porsche", "Fabricante de carros", 11),
("Subaru", "Fabricante de carros", 12),
("Toyota", "Fabricante de carros", 13);

INSERT INTO tb_produtos(nome, descricao, preco, id_loja)
VALUES
("Bugatti Centodie", "This is a car.", "1", "1"),
("Bugatti Chiron", "This is a car.", "1", "1"),
("Bugatti Divo", "This is a car.", "1", "1"),
("Bugatti La Voiture Noire", "This is a car.", "1", "1"),
("Bugatti Mistral", "This is a car.", "1", "1"),
("Bugatti Veyron", "This is a car.", "1", "1"),
("Ferrari Enzo", "This is a car.", "1", "2"),
("Ferrari F40", "This is a car.", "1", "2"),
("Ferrari Porto Fino", "This is a car.", "1", "2"),
("Ferrari Testarossa", "This is a car.", "1", "2"),
("Honda S2000", "This is a car.", "1", "3"),
("Honda Civic Type R", "This is a car.", "1", "3"),
("Honda NSX-R", "This is a car.", "1", "3"),
("Koenigsegg One 1", "This is a car.", "1", "4"),
("Koenigsegg Jesko", "This is a car.", "1", "4"),
("Lamborghini Aventador", "This is a car.", "1", "5"),
("Lamborghini Diablo", "This is a car.", "1", "5"),
("Lamborghini Huracan", "This is a car.", "1", "5"),
("Lamborghini Murcielago", "This is a car.", "1", "5"),
("Mazda Rx-7", "This is a car.", "1", "6"),
("Mazda Rx-5 Miata", "This is a car.", "1", "6"),
("McLaren F1", "This is a car.", "1", "7"),
("McLaren Senna", "This is a car.", "1", "7"),
("McLaren SLR", "This is a car.", "1", "7"),
("Mercedes-Benz C112", "This is a car.", "1", "8"),
("Mercedes-Benz CLKMS Tarben", "This is a car.", "1", "8"),
("Mercedes-Benz S Class Coupe", "This is a car.", "1", "8"),
("Mercedes-Benz SLR Mansonry", "This is a car.", "1", "8"),
("Mitsubishi Eclipse 98", "This is a car.", "1", "9"),
("Mitsubishi Eclipse Spider", "This is a car.", "1", "9"),
("Mitsubishi Lancer Evo 8", "This is a car.", "1", "9"),
("Mitsubishi Lancer Evo X", "This is a car.", "1", "9"),
("Nissan 180x", "This is a car.", "1", "10"),
("Nissan 300zx", "This is a car.", "1", "10"),
("Nissan 350z", "This is a car.", "1", "10"),
("Nissan GTR", "This is a car.", "1", "10"),
("Nissan Silvia", "This is a car.", "1", "10"),
("Nissan Skyline", "This is a car.", "1", "10"),
("Porsche 911", "This is a car.", "1", "11"),
("Porsche 917k", "This is a car.", "1", "11"),
("Porsche 918", "This is a car.", "1", "11"),
("Porsche Carrera GT", "This is a car.", "1", "11"),
("Porsche Cayman", "This is a car.", "1", "11"),
("Porsche Taycan", "This is a car.", "1", "11"),
("Subaru BRZ", "This is a car.", "1", "12"),
("Subaru Impreza WRX STI 1", "This is a car.", "1", "12"),
("Subaru Impreza WRX STI 2", "This is a car.", "1", "12"),
("Subaru Impreza WRX STI 4", "This is a car.", "1", "12"),
("Toyota AE86", "This is a car.", "1", "13"),
("Toyota Celica", "This is a car.", "1", "13"),
("Toyota Supra Mk4", "This is a car.", "1", "13");













