insert into cliente (id, nome) values (1, 'Eletrônicos Eletro');
insert into cliente (id, nome) values (2, 'Smart Compras');

insert into produto (id, nome, valor) values (1, 'Notebook', 2000.00);
insert into produto (id, nome, valor) values (2, 'geladeira', 3000.00);

insert into venda (id, cliente_id, frete, total, cadastro) values (1, 1, 15.0, 2965.0, sysdate());

insert into item (id, venda_id, produto_id, quantidade) values (1, 1, 1, 1);