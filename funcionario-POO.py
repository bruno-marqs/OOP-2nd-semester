class Funcionario():
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario
    
    def getNome(self):
        return self.nome
    
    def getSalario(self):
        return self.salario
    
    def setNome(self, novoNome):
        self.nome = novoNome
    
    def setSalario(self, novoSalario):
        self.salario = novoSalario
    
    def aumentarSalario(self, percent):
        anterior = self.getSalario()
        self.setSalario(anterior + (anterior * percent / 100))
        print(f'O salário anterior era {anterior:.2f} reais e agora é de {self.salario} reais')

        
        
#programa
nome = input('Insira o nome do funcionário: ')
salario = float(input('Digite o valor do salário: '))
percent = float(input('Digite o percenual de aumento: '))
func = Funcionario(nome, salario)


#teste da classe
print(f'O nome do funcionario é: {func.getNome()}')
print(f'O salario atual é: {func.getSalario()} reais')
func.aumentarSalario(percent)