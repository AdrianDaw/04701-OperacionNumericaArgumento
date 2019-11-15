/*
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public final class App {

    // DATOS
    public static final int N1 = 5;
    public static final int N2 = 7;
    // CONSTANTES DE OPERACION
    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    public final void launchApp() {
        System.out.printf("Entre %d y %d el mayor es %d%n", N1, N2, (int) operar(N1, N2, OP_MAY));
        System.out.printf("Entre %d y %d el menor es %d%n", N1, N2, (int) operar(N1, N2, OP_MEN));
        System.out.printf("La suma de %d y %d es %d%n", N1, N2, (int) operar(N1, N2, OP_SUM));
        System.out.printf("La resta de %d menos %d es %d%n", N1, N2, (int) operar(N1, N2, OP_RES));
        System.out.printf("La multiplicacion de %d y %d es %d%n", N1, N2, (int) operar(N1, N2, OP_MUL));
        System.out.printf("La division de %d entre %d es %d%n", N1, N2, (int) operar(N1, N2, OP_DIV));
        System.out.printf("el resto de la division %d entre %d es %d%n", N1, N2, (int) operar(N1, N2, OP_MOD));
        System.out.printf("La media entre %d y %d es %d%n", N1, N2, (int) operar(N1, N2, OP_MED));
    }

    private static double operar(double n1, double n2, int op) {
        double result = 0;

        switch (op) {
            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                break;
            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                break;
            case OP_SUM:
                result = n1 + n2;
                break;
            case OP_RES:
                result = n1 - n2;
                break;
            case OP_MUL:
                result = n1 * n2;
                break;
            case OP_DIV:
                result = n1 / n2;
                break;
            case OP_MOD:
                result = n1 % n2;
                break;
            case OP_MED:
                result = (n1 + n2) / 2;
                break;
        }

        return result;
    }
}
