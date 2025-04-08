# Projeto Orientação a Objetos

# João Gabriel Duarte Guarçoni Almeida - 202376008

Este projeto tem como intuito realizar reservas de hospedes em um hotel, funcionando a partir do nome do hospede, seu CPF e seu tempo de estadia. Claro, é um código simples, que não leva em consideração a disponibilidade de quartos e outras funções que nele poderiam ser acrescentadas, porém é uma base boa que seria passível de uma implementação melhor no futuro. No momento o código pode cadastrar um hospede no hotel, cancelar sua reserva, notificar sua entrada e sua saida do hotel e finalizar sua reserva para pagamento pelas formas: Pix, Cartão ou Dinheiro.

## Estrutura do Projeto

- **Calcula_conta.java**: Calcula a conta final do hóspede, levando em conta suas diárias.
- **Entrada.java**: Notifica a entrada rotineira do hospede no hotel.
- **Saida.java**: Notifica a saida rotineira do hospede no hotel.
- **Hospede.java**: Classe pai que representa a pessoa que sera cadastrada no hotel.
- **Reserva.java**: Classe que extende Hospede, por meio dela será realizada a chamada da classe pai para realizar a reserva do hospede no hotel.
- **Pagamento.java**: Classe abstrata que dará segmento para as formas de pagamento.
- **Pagamento_cartao.java**: Classe que extende Pagamento para realizar o pagamento no cartão.
- **Pagamento_pix.java**: Classe que extende Pagamento para realizar o pagamento no pix.
- **Pagamento_dinheiro.java**: Classe que extende Pagamento para realizar o pagamento no dinheiro.
- **Sistema_Reserva_Hotel.java**: Classe principal para testar as funcionalidades do projeto.

