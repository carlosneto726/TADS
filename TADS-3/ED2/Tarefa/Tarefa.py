class Tarefa:
    def __init__(self, tarefas):
        self.__tarefa = tarefa

    def gerarLista(self):
        self.__tarefa.sort(key = lambda x: x.getFim())
        lista = []
        lista.append(self.__tarefa[0])
        pos = 0
        for i in range(1, len(self.__tarefa), +1):
            if self.__tarefa[i].getInicio() >= lista[pos].getFim():
                lista.append(self.__tarefa[i])
                pos = i
        for i in range(len(lista)):
            print(lista[i].getNome())

class Tarefa:
    def __init__(self, nome, inicio, fim):
        self.__nome = nome
        self.__inicio = inicio
        self.__fim = fim
    
    def getNome(self):
        return self.__nome
    def getInicio(self)
        return self.__inico
    def getFim(self):
        return self.__fim