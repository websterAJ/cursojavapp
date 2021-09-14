/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

/**
 *
 * @author Alexander torres
 */
public class Operadores_Arimeticos {
    public static void main(String[] args) {
        
        /**
         *  + 	Suma Suma dos valores                                   x + y 	
            - 	Sustracción Resta un valor de otro                      x - y 	
            * 	Multiplicación Multiplica dos valores                   x * y 	
            / 	División Divide un valor entre otro                     x / y 	
            % 	Módulo Devuelve el resto de la división                 x % y 	
            ++ 	Incremento Aumenta el valor de una variable en 1 	++x 	
            -- 	Disminución Disminuye el valor de una variable en 1 	--x
         */
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)
        /**
         operadores de asignacion
            * = 	x = 5       x = 5 	
            +=          x += 3      x = x + 3 	
            -=          x -= 3      x = x - 3 	
            *=          x *= 3      x = x * 3 	
            /=          x /= 3      x = x / 3 	
            %=          x %= 3      x = x % 3 	
            &=          x &= 3      x = x & 3 	
            |=          x |= 3      x = x | 3 	
            ^=          x ^= 3      x = x ^ 3 	
            >>= 	x >>= 3     x = x >> 3 	
            <<= 	x <<= 3     x = x << 3
         */
        int a = 0;
        a+=3;
        /*
            operadores de == es solo para numeros
            == 	Igual a                     x == y 	
            != 	No igual                    x != y 	
            > 	Mayor que                   x > y 	
            < 	Menos que                   x < y 	
            >= 	Mayor o igual que           x >= y 	
            <= 	Menor o igual que           x <= y
        */
        
        /**
         * 
            &&      Lógico y 	Devuelve verdadero si ambas afirmaciones son verdaderas                 x < 5 &&  x < 10 	
            ||      Lógico o 	Devuelve verdadero si una de las afirmaciones es verdadera              x < 5 || x < 4 	
            !       Lógico no 	Invierte el resultado, devuelve falso si el resultado es verdadero 	!(x < 5 && x < 10)
         */

    }
}
