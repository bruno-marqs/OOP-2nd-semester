class Macaco():
    def __init__(self, nome, estomago):
        self.nome = nome
        self.estomago = estomago

    def getNome(self):
        return self.nome
    
    def verEstomago(self):
        return self.estomago
    
    def comer(self, alimento):
        self.estomago.append(alimento)
    
    def digerir(self):
        self.estomago.pop(0)
    
# programa #
lista = []
lista2 = []

mk1 = Macaco('Golias', lista)
mk2 = Macaco('Fulano', lista2)

print(mk1.verEstomago())
mk1.comer('maçã')
print(mk1.verEstomago())
mk1.comer('banana')
print(mk1.verEstomago())
mk1.comer('uva')
print(mk1.verEstomago())

print('\n')

print(mk2.verEstomago())
mk2.comer('carne')
print(mk2.verEstomago())
mk2.comer('cerveja')
print(mk2.verEstomago())
mk2.comer('pudim')
print(mk2.verEstomago())

mk1.comer(mk2)
print(mk1.verEstomago())