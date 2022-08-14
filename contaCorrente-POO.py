class ContaCorrente():

    def __init__(self, num, nome, saldo):
        self.num = num
        self.nome = nome
        self.saldo = saldo
    
    def getSaldo(self):
        return self.saldo
    
    def depositar(self, valor):
        self.saldo = self.saldo + valor
    
    def sacar(self, valor):
        if self.saldo == 0 or self.saldo < valor:
            print('Você não tem saldo suficiente. Por favor, fique rico.')
        else:
            self.saldo = self.saldo - valor
    
# programa #
print('Bem-vindo a sua nova conta, insira os dados abaixo.')
print('Insira nome do titular: ')
nome = input()
print(f'Insira número da conta-corrente de {nome}: ')
num = int(input())
print('Seu saldo inicial é 0')

# objeto #
conta1 = ContaCorrente(num, nome, 0)

# teste da classe #
print(conta1.getSaldo())
conta1.depositar(3000)
print(conta1.getSaldo())
conta1.sacar(2000)
print(conta1.getSaldo())
conta1.sacar(2000)
print(conta1.getSaldo())
