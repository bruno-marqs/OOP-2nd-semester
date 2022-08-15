class ContaInvestimento():

  def __init__(self, num, nome, saldo, juros):
    self.num = num
    self.nome = nome
    self.saldo = saldo
    self.juros = juros

  def getSaldo(self):
    return self.saldo
  
  def depositar(self, valor):
    self.saldo = self.saldo + valor

  def sacar(self, valor):
    if self.saldo == 0 or self.saldo < valor:
      print('Você não tem saldo suficiente. Verifique seu saldo novamento.')
    else:
      self.saldo = self.saldo - valor
    
  def addJuros(self):
    self.saldo += self.saldo * self.juros/100

# programa #
print('Bem-vindo a sua conta investimento, insira os dados abaixo')
nome = input('Insira o nome do titular: ')
num = int(input(f'Insira o número da conta-investimento de {nome}: '))
juros = int(input('Indique o juros mensal: '))
print(f'O saldo inicial de {nome} é 1000')

# objeto #
inv1 = ContaInvestimento(num, nome, 1000, juros)

# teste da classe # 
print(inv1.getSaldo())
inv1.addJuros()
inv1.addJuros()
inv1.addJuros()
inv1.addJuros()
inv1.addJuros()
print(inv1.getSaldo())
