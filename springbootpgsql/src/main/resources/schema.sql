CREATE TABLE todo1  
(  
  id serial NOT NULL,  
  title character varying(50),  
  details text,  
  finished integer,  
  CONSTRAINT todo_pkey1 PRIMARY KEY (id)  
); 