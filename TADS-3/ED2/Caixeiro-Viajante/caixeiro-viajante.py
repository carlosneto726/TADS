class Vertice:
    
    def __init__(self, valor):
        self.__valor = valor
        self.__arestas = set()
    
    def getValor(self):
        return self.__valor
    def setValor(self, valor):
        self.__valor = valor
        
    def getArestas(self):
        return self.__arestas

    def adicionarAresta(self, aresta):
        self.__arestas.add(aresta)


class Aresta:
    def __init__(self, vOrigem, vDestino, peso):
        self.__vOrigem = vOrigem
        self.__vDestino = vDestino
        self.__peso = peso
        self.__vOrigem.adicionarAresta(self)
        self.__vDestino.adicionarAresta(self)
        
    def getvOrigem(self):
        return self.__vOrigem
    def getvDestino(self):
        return self.__vDestino
    def getValor(self):
        return self.__peso


class Grafo:
    def __init__(self):
        self.__vertices = set()
        self.__arestas  = set()
        
    def setArestas(self, arestas):
        self.__arestas = arestas
    def getArestas(self):
        return self.__arestas

    def setVertices(self, vertices):
        self.__vertices = vertices
    def getVertices(self):
        return self.__vertices 
        
    def inserirVertices(self, v):
        if self.buscarPorValor(v) != v:
            self.__vertices.add(Vertice(v))
            return True
        else:
            return False
            

    def inserirAresta(self, vO, vD, peso = 1, direcionado = True):
        verticeO = self.getVerticeByValor(vO)
        verticeD = self.getVerticeByValor(vD)
        if verticeO and verticeD is None:
            raise Exception("Esse Vertice nao existe")
            return False
        else:
            self.__arestas.add(Aresta(verticeO, verticeD, peso, direcionado))
            return True
        
        
    def removerAresta(self, vO, vD, peso, direcionado = True):
        verticeO = self.getVerticeByValor(vO)
        verticeD = self.getVerticeByValor(vD)
        if verticeO and verticeD != None:
            for aresta in self.getArestas():
                if verticeO == aresta.getvOrigem() and verticeD == aresta.getvDestino() and peso == aresta.getValor():
                    self.__arestas.remove(aresta)
                    return True                    
        return False


    def removerVertice(self, valor):        
        para_remover = self.getVerticeByValor(valor)
        if para_remover == None:
            pass
        else:
            self.getVertices().remove(para_remover)
            
            for aresta in self.getArestas():
                peso = aresta.getValor()
                vO = aresta.getvOrigem()
                vD = aresta.getvDestino()
                
                if vO == para_remover or vD == para_remover:
                    break
            self.removerAresta(vO, vD, peso)



    def caxeiro_viajante(self, vInicio):
        aresta = 0
        c = 0
        p = 0
        caminho = []
        for v in self.getVertices():
            c+=1

        for vertice in range(c):
            print(vertice)
            if vertice == 0:
                menor = 99999
                caminho.append(vInicio.getValor())
                for a in vInicio.getArestas():
                    if a.getValor() < menor:

                        if a.getvOrigem().getValor() == caminho[vertice -1]:
                            menor = a.getValor()
                            p = a.getvDestino().getValor()
                            obj = a.getvDestino()
                        elif a.getvDestino().getValor() == caminho[vertice -1]:
                            menor = a.getValor()
                            p = a.getvOrigem().getValor()
                            obj = a.getvOrigem()
                caminho.append(p)


            for a_i in obj.getArestas():
                if a_i.getValor() < menor:
                    menor = a_i.getValor()
                    p = a_i.getvDestino().getValor()
                    obj = a_i.getvDestino()
            caminho.append(p)

            
        return caminho



    def caxeiro_viajante2(self, vInicio):
        p = 0
        c = 0
        caminho = []

        for v in self.getVertices():
            menor = 99999
            if c == 0:
                caminho.append(vInicio.getValor())
            for a in v.getArestas():
                if a.getValor() < menor:

                    if a.getvOrigem().getValor() == caminho[len(caminho) -1]:
                        menor = a.getValor()
                        c+=menor
                        p = a.getvDestino().getValor()
                        
                    elif a.getvDestino().getValor() == caminho[len(caminho) -1]:
                        menor = a.getValor()
                        c+=menor
                        p = a.getvOrigem().getValor()
            caminho.append(p)
            print(c)

            
        return caminho
            




a = Vertice('A')
b = Vertice('B')
c = Vertice('C')
d = Vertice('D')
e = Vertice('E')

ab = Aresta(a, b, 2)
bc = Aresta(b, c, 4)
cd = Aresta(c, d, 3)
de = Aresta(d, e, 3)
ea = Aresta(e, a, 3)
ad = Aresta(a, d, 6)
be = Aresta(b, e, 3)
ec = Aresta(e, c, 7)
ac = Aresta(a, c, 5)

grafo = Grafo()
grafo.setVertices({a,b,c,d,e})
grafo.setArestas({ab,bc,cd,de,ea,ad,be,ec,ac})



print(grafo.caxeiro_viajante2(a))




















