BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Recettes" (
	"idRecette"	INTEGER,
	"Titre"	TEXT,
	"Description"	TEXT,
	PRIMARY KEY("idRecette")
);
INSERT INTO "Recettes" ("idRecette","Titre","Description") VALUES (1,'Poulet Basquaise','Poulet cuit avec poivrons/tomates ,  servi avec du riz'),
 (2,'Poulet au Curry','Poulet Indien cuit au four avec sauce crémeuse et servie avec du riz basmati');
COMMIT;
