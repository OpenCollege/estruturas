# estruturas

- **Grau:** Quantidade de Filhos
- **Comprimento:** Quantidade de ligações
- **Quadtree:** Representação clássica de imagens bidimensionais
- **Octree:** Representação clássica de imagens tridimensionais


- https://stackoverflow.com/questions/3522454/java-tree-data-structure

## Arvores Binárias 
```c 
func1 (Nodo n) {
 if (n != null) {
 empilha(n);
 while (!pilha_vazia()) {
 n = desempilha();
 escreve(n.valor);
 if (n.dir != null)
 empilha(n.dir);
 if (n.esq != null)
 empilha(n.esq);
 }
 }
}
```

- Percurso por níveis
```c
func2 (Nodo n) {
 if (n != null) {
 enfileira(n);
 while (!fila_vazia()) {
 n = desenfileira();
 escreve(n.valor);
 if (n.esq != null)
 enfileira(n.esq);
 if (n.dir != null)
 enfileira(n.dir);
 }
 }
}
```


Pra que serve uma arvore binária?
