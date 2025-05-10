# [LeetCode - 217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=24nnitp1)

## Descrição

Dado um array de inteiros `nums`, retorne `true` se algum valor aparecer pelo menos duas vezes no array, e retorne `false` se todos os elementos forem distintos.

## Exemplos

### Exemplo 1
```text
Input: nums = [1,2,3,1]  
Output: true
```
### Exemplo 2
```text
Input: nums = [1,2,3,4]  
Output: false  
Explicação: Todos os elementos são distintos.
```
### Exemplo 3
```text
Input: nums = [1,1,1,3,3,4,3,2,4,2]  
Output: true
```
## Restrições

- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

## Descrição dos Conceitos e Resolução

O problema consiste em verificar se existe algum número duplicado em um array de inteiros. Para resolver essa questão de forma eficiente, foi utilizado um conjunto (`Set`), uma estrutura de dados que não permite elementos duplicados.

Essa abordagem tem complexidade de tempo O(n), sendo mais eficiente do que comparações aninhadas (O(n²)), especialmente para arrays grandes.

