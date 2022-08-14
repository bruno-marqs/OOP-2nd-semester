class Controle():
    def __init__(self, canal, volume):
        self.canal = canal
        self.volume = volume
    
    def getCanal(self):
        return self.canal
    
    def getVolume(self):
        return self.volume
    
    def setCanal(self, novoCanal):
        if 0 <= novoCanal and novoCanal <= 100:
            self.canal = novoCanal
        else:
            return 'Não há canal nesta banda'
    
    def menosVolume(self):
        if 1 < self.volume and self.volume < 100:
            self.volume -= 1
        elif self.volume == 0:
            print('O volume está mudo')
        else:
            return 'Esta não é uma faixa de volume válida'
    
    def maisVolume(self):
        if 1 < self.volume and self.volume < 100:
            self.volume += 1
        elif self.volume == 100:
            print('O volume está no máximo')
        else:
            return 'Esta não é uma faixa de volume válida'

# programa #
print('Escolha o canal entre 0 a 100: ')
canal = int(input())
print('Escolha o volume inicial: ')
volume = int(input())

# objeto #
control = Controle(canal, volume)

# teste da classe #
print(f'Está sintonizado no canal {control.getCanal()} com volume {control.getVolume()}')
control.setCanal(99)
control.maisVolume()
print(f'Está sintonizado no canal {control.getCanal()} com volume {control.getVolume()}')
control.setCanal(101)
control.maisVolume()
print(f'Está sintonizado no canal {control.getCanal()} com volume {control.getVolume()}')





    
