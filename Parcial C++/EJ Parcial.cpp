/* Resoluci�n Parcial 1 Problema 1
Esta es una posible soluci�n del ejercicio.
Hay muchas formas de resolverlo. No significa
que otras soluciones est�n mal.
*/

#include <iostream>
using namespace std;

// Programa Principal
int main()
{
    int contador = 100;

    while (contador >= 1)
    {
        if (contador % 10 == 0)
        {
            cout << endl;
        }
        cout << contador << " ";
        contador = contador -1;
    }
    return 0;
}
