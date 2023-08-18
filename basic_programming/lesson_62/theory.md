# Рекурсия

> In order to understand recursion, you first need to understand recursion.
>
> Для того чтобы понять рекурсию, надо сначала понять рекурсию.

In programming, recursion, or a recursive function, is a function that calls itself.

В программировании рекурсия, или же рекурсивная функция — это такая функция, которая вызывает саму себя.

Recursion can also be likened to a nesting doll (matryoshka doll). The first doll is the largest, followed by an identical doll but smaller in size. The essence of the matryoshka doll is that you can open it up and retrieve an exactly same doll, only slightly smaller. This prolonged process continues until you reach the last doll, which breaks the cycle.

Рекурсию также можно сравнить с матрёшкой. Первая кукла самая большая, за ней идёт точно такая же кукла, но поменьше. Суть матрёшки состоит в том, что вы можете открывать её и доставать из неё точно такую же куклу, только немного меньше. Такой продолжительный процесс длится до тех пор, пока вы не дойдёте до последней куклы, которая и прервёт цикл.

This is what a visual representation of recursion looks like (Так выглядит визуальная репрезентация рекурсии):
![Матрёшка - Gif Tenor](https://miro.medium.com/v2/0*zqiIc2epyEfGXgOG)

There are two more important definitions for understanding recursion:
- Recursion base case: the condition for exiting the block of recursive calls – the basic solution of the problem under conditions where recursion is not needed.
- Recursive step: calling the function itself with modified parameters.

Есть еще два важных для понимания рекурсии определения:
- Базис рекурсии – условие выхода из блока рекурсивных вызовов – базисное решение задачи, при условиях, когда нет необходимости вызывать рекурсию.
- Шаг рекурсии – вызов функцией самой себя при изменении параметров.
